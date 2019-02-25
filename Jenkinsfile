pipeline { 
    agent any  
    stages {
        stage('Cucumber-Reports'){
            steps{
                cucumber buildStatus: 'UNSTABLE',
                        fileIncludePattern: '**/*.json',
                        jsonReportDirectory:'target'
            }
        }
    }
}
