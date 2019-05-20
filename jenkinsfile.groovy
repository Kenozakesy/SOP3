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
                mail bcc: '', body: 'test', cc: '', from: '', replyTo: '', subject: 'test', to: 'thezemmer@gmail.com'
            }
        }       
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}