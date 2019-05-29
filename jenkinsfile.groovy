pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('BUILD') {
            steps {
                sh 'mvn -B -DskipTests install package'
            }     
        }
        stage('UNITTEST') {
            steps {
                sh 'mvn test'
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