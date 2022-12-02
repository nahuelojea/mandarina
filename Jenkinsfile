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
        stage('Push to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u nicolasluongo9 -p ${dockerhubpwd}'
                    }
                    sh 'docker push nicolasluongo9/mandarina'
                }
            }
        }
    }
}