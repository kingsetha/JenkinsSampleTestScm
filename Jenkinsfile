pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from the repository
                git url: 'https://github.com/kingsetha/JenkinsTestSample.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Build your Java project using Maven
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run JUnit tests
                bat 'mvn test'
            }
            post {
                always {
                    // Archive JUnit test results
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
