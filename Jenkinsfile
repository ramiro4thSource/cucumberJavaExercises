pipeline { 
    agent any  
    stages {
        stage('Test') {
            steps{
                withMaven(maven:'M3'){
                    bat 'mvn test'
                }
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
