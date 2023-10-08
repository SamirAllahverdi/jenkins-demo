pipeline {
    agent any
    tools {
        maven "Maven-3.8.3"
    }
    stages {
    stage("env BUILD_ID"){
    steps{
                 echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"

    }}
        stage("build image") {
          steps {
             bat 'docker build -t cerment/jenkins-demo:${env.BUILD_ID} .'
          }
        }
    }
}
