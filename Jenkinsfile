pipeline {

    agent any

    tools {
//        jdk 'MyJdk-11'
        maven "MyMaven-3.8.3"
    }

    stages {
        stage("build project") {
            steps {
                echo $JAVA_HOME
                echo "Maven VERSION"
                sh 'mvn -version'
                echo 'building project...'
                sh "mvn clean"
                sh "mvn package"
            }
        }
    }

}