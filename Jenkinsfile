pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/SammLopes/Jenkins.git'
            }
        }
        stage('Build'){
              steps {
                bat 'mvn clean instal'
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}