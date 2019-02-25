pipeline { 
    agent any  
    stages {
        stage('Test') {
            steps{
                bat 'mvn test'
            }
        }
        stage('Cucumber-Reports'){
            steps{
                cucumber buildStatus: 'UNSTABLE',
                        fileIncludePattern: '**/cucumber.json',
                        jsonReportDirectory:'target'
            }
        }
    }
}
