pipeline {
    environment {
        registry = "yoksar/test-api"
        credentials = "dockerhub" 
        gitUrl = "https://github.com/CPIJ/kumuluz-test-api.git"
        dockerImage = ''
    }
    
agent {docker}
    stages {
        stage('Clone repository') {
            steps {
                git([url: gitUrl, branch: 'master'])
            }
        }

        stage('Build image') {
            steps {
                script {
                    dockerImage = docker.build registry
                }
            }
        }

        stage('Push image to DockerHub') {
            steps {
                script {
                    docker.withRegisry('', credentials) {
                        dockerImage.push()
                    }
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