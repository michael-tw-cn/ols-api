pipeline {
    agent any
    stages {
        stage('Run Unit Tests') {
            agent { docker 'openjdk:11-jdk' }
            steps {
                sh './auto/run-unit-tests'
            }
        }
        stage('Deploy to Test') {
        agent { docker 'aaronyunan/jdk11-awscli' }
            steps {
                sh './auto/deploy'
            }
        }
    }
}
