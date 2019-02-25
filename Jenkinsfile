pipeline { 
    agent any  
    stages {
        stage('Test') {
            steps{
                withMaven(maven:'maven_3_5_4'){
                    sh 'mvn test'
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
