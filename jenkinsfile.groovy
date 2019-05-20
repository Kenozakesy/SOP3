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
                sh 'mvn --version'
            }
         
        }
        stage('test') {
            steps {
                echo 'do testing here'
            }
        }       
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}