pipeline {
    agent any
    tools {
        maven "Maven-3.8.3"
    }
    stages {
        stage("build image") {
          steps {
             echo %env.BUILD_ID%
             bat 'docker build -t cerment/jenkins-demo:${env.BUILD_ID} .'
          }
        }
    }
}
