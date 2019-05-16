pipeline {
    agent any
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
    }
}