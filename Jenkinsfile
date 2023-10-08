pipeline {
    agent any
    tools {
        maven "Maven-3.8.3"
    }
    stages {
        stage("build image") {
          steps {
             bat 'docker build -t cerment/jenkins-demo:%BUILD_NUMBER% .'
          }
        }
        stage("push image"){
          steps{
                	bat "docker login -u $dockerUser -p $dockerPassword"
                    bat 'docker push cerment/jenkins-demo:%BUILD_NUMBER%'
          }
        }
    }
}
