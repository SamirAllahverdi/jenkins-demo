pipeline {
    agent any
    tools {
        maven "Maven-3.8.3"
    }
    stages {
        stage("build image") {
        agent any
            steps {
                sh 'mvn springboot:build-image'
            }
        }
        stage("push image"){
            steps{
              withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
              	sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
                sh 'docker push cerment/jenkins-demo:0.0.1-SNAPSHOT'
              }
            }
        }
    }
}
