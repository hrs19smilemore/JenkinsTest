pipeline {
    agent any

    tools {
            // Install the Maven version configured as "M3" and add it to the path.
            maven "M3"
        }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package'
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean test'
                    junit: '**/target/surefire-reports/*.xml', fingerprint: true
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
