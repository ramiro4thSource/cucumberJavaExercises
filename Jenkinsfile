pipeline { 
    agent any  
    stages { 
        stage('Test') { 
            steps 
	    withMaven(maven: 3_5_4){ 
               sh 'mvn test'
            }
        }	
    }
}