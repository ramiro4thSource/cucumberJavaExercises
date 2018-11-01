node {
    testExitCode=1;
    stage('Test') {
        git url: 'https://github.com/ramiro4thSource/cucumberJavaExercises.git'
        def mvnHome = tool 'M3'
        testExitCode = bat ([script: "${mvnHome}/bin/mvn -B -q  test" ,returnStatus:true])
        step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
    }
    stage('Build'){
        if(testExitCode==0){
            bat "${mvnHome}/bin/mvn package "
        }
    }

}