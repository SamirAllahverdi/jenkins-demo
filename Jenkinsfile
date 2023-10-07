pipeline {
    agent any
    tools {
        maven "Maven-3.8.3"
    }
    stages {
        stage("build project") {
            steps {
                echo "Maven VERSION"
                sh 'mvn -version'
                echo 'Hello World'
            }
        }
    }
}
