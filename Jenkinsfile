pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compiling Java program...'
                bat 'javac MultiplicationTable.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running Java program...'
                bat 'java MultiplicationTable'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy step can be added here (optional)'
            }
        }
    }
}
