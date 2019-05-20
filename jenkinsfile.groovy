pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Ok') {
            steps {
                echo "OK"
            }
        }
        stage('build') {
            steps {
                git url: 'https://github.com/Kenozakesy/SOP3'
            }     
        }
        stage('test') {
            steps {
                echo 'test'
            }
        }       
    }
    post { 
        always { 
            junit 'build/reports/**/*.xml'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
    }
}