node {
    stage('Test') {
        git url: 'https://github.com/ramiro4thSource/cucumberJavaExercises.git'
        def mvnHome = tool 'M3'
        bat "${mvnHome}/bin/mvn -B -q test -Dcucumber.options=\"--tags @Signup\""
        step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
    }
}