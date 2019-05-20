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
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
                // step() {
                //     sh 'mvn --version'
                // }
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