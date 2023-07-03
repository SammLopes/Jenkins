pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/SammLopes/Jenkins.git'
            }
        }
        
        stage('Teste'){
            bat 'mvn test'
            
        }
        
        stage('Build'){
              steps {
                bat 'mvn clean instal'
                junit '**/target/surefire-reports/TEST-*.xml'
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}