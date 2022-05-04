pipeline {
    agent any
    tools {
        maven "MyMaven-3.8.3"
    }
    stages {
        stage("build project") {
            steps {
                echo "Maven VERSION"
                sh 'mvn -version'
                echo 'building project...'
                sh "mvn clean"
                sh "mvn package"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy...'
            sh 'sudo kill $(sudo lsof -t -i:8081)'
            echo 'Killed 8081...'
            sh 'nohup java -jar target/jenkins-demo-0.0.1-SNAPSHOT.jar &'
            echo 'started the project...'
        }}
    }

}