Jenkinsfile (Declarative Pipeline)
/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'python:3.13.2-alpine3.21' } }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/gabriags/jenkins-test.git'
            }
        }
        stage('build') {
            steps {
                sh 'python --version'
            }
        }
    }
}