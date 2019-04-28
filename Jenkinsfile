pipeline {
    agent any
    stages {
        stage('Deploy to Test') {
        agent { docker 'aaronyunan/jdk11-awscli' }
            steps {
                sh './auto/deploy'
            }
        }
    }
}
