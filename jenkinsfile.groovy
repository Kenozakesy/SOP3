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
                git 'https://github.com/Kenozakesy/SOP3.git'
                bat 'mvn verify'
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
            echo 'I will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
    }
}