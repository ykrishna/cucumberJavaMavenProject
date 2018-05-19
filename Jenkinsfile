pipeline {
    tools {
        maven "apache-maven-3.5.3"
        //jdk "default"
    }

    agent any

    stages {
        stage("build") {
            steps {
                dir("tmp") {
                    //git changelog: false, poll: false, url: 'git@github.com:ykrishna/cucumberJavaMavenProject.git', branch: 'master'
                    sh 'echo "M2_HOME: ${M2_HOME}"'
                    sh 'echo "JAVA_HOME: ${JAVA_HOME}"'
                    sh 'mvn clean test -Dmaven.test.failure.ignore=true'
                }
            }
        }
    }

    post {
        always {
            //junit '*/target/surefire-reports/*.xml'
            archiveArtifacts "target/**/*"
        }
    }
}
