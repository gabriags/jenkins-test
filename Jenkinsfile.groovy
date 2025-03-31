pipeline {
    agent { docker { image 'python:3.13.2' } }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/gabriags/jenkins-test.git'
            }
        }
        stage('Build') {
            steps {
                sh 'python --version'
            }
        }
    }
}