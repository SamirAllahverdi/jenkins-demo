pipeline {
    agent any
    tools {
        maven "Maven-3.8.3"
    }
    stages {
        stage("build image") {
        agent any
            steps {
               sh 'docker build -t cerment/jenkins-demo:${env.BUILD_ID} .'
            }
        }
//         stage("push image"){
//             steps{
//               echo "Docker Image Tag Name: jenkins-demo:${env.BUILD_ID}"
//               withCredentials([usernamePassword(credentialsId: 'f3ef67b7-5707-4f44-9565-6e3eb3e11df1', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
//               	sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
//                 sh 'docker push cerment/jenkins-demo:${env.BUILD_ID}'
//               }
//             }
//         }
    }
}
