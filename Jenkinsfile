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
                    sh ' docker build -t nao1991/mandarina-integration .'
                }
            }
        }
        stage('Push to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u nao1991 -p ${dockerhubpwd}'
                    }
                    sh 'docker push nao1991/mandarina-integration'
                }
            }
        }
    }
}
