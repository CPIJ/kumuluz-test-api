pipeline {
    environment {
        registry = "yoksar/test-api"
        credentials = "dockerhub" 
        gitUrl = "https://github.com/CPIJ/kumuluz-test-api.git"
        dockerImage = ''
    }
    
    agent any
    stages {
        stage('Clone repository') {
            steps {
                git([url: gitUrl, branch: 'master'])
            }
        }

        stage('Build image') {
            steps {
                script {
                    sh "docker build -t $registry"
                }
            }
        }

        stage('Push image to DockerHub') {
            steps {
                script {
                    sh "docker push $registry"
                }
            }
        }

        stage('Remove local image') {
            steps {
                sh "docker rmi $registry"
            }
        }
    }
}