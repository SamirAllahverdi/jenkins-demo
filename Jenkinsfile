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
    }

}