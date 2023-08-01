pipeline {
    agent any
    
    stages {
        stage('Checkout'){
           steps{
                git 'https://github.com/VdeVitorinha/Bisca_2.0.git'
           } 
        }
        stage('Teste'){
            steps{
                bat'mvn test -Dtest=!BaralhoTest'
            }
        }
        stage('Teste Crítico'){
            steps{
                script{
                    try{
                        bat 'mvn test -Dtest=BaralhoTest'
                    }catch(Exception e){
                        mail bcc: 'Jenkins mail', body: 'Erro no teste critico!!!!', cc: '', from: 'sam.v.p.lopes@gmail.com', replyTo: '', subject: 'Jenkins Mail', to: 'sam.v.p.lopes@gmail.com'
                        error("Pipeline interrompido")
                    }
                    
                }
            }
        }
        //stage("Email"){
          //  steps{
           //     mail bcc: '', body: 'erro', cc: '', from: '', replyTo: '', subject: '', to: 'sam.v.p.lopes@gmail.com'
            //}
        //}
        
        stage('Build'){
            steps{
                bat 'mvn clean install'
            }
        }
    }
}
