pipeline {
    agent any
    tools{
        maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Build docker'){
            steps{
                script{
                    sh ' docker build -t nicolasluongo9/mandarina .'
                }
            }
        }
    }
}