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
          steps {
            withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'pass', usernameVariable: 'user')]) {
                	bat "docker login -u $user -p $pass"
                    bat 'docker push %user%/jenkins-demo:%BUILD_NUMBER%'
            }
          }
        }
    }
}
