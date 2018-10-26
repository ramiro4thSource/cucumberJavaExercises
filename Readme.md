# Cucumber-Java exercises
Hello, on this repo you will find some exercises about testing automation using cucumber-java and sellenium. 


## Install dependencies
As `pom.xml` is used in this project, no installation importing jar libraries is needed.

## Running test
If you want to test in different browser you can change this value in `config.properties` file. 
Then run the command
```
mvn test
```



## Structure

```
├── drivers
│   ├── chromedriver.exe
│   ├── geckodriver.exe
├── src
│   │   ├── main
│   │   ├── test
│   │   │   ├── java
│   │   │   │   ├── domain
│   │   │   │   ├── features
│   │   │   │   ├── pages
│   │   │   │   ├── runner
│   │   │   │   ├── screens
│   │   │   │   ├── steps
│   │   │   │   ├── util
│   │   │   │   ├── config.properties
├── target
│   │   ├── cucumber
│   │   │   ├── index.html
│   │   │   ├── report.js
├── pom.xml
├── REadme.md
└── .gitignore
```
