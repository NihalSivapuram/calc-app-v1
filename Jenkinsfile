pipeline {
    agent any

    stages{
        stage('Checkout'){
            steps{
                git branch: 'main',
                url: 'https://github.com/NihalSivapuram/calc-app-v1.git'
            }
        }
        stage('Build'){
            steps{
                bat 'mvn clean compile'
            }
        }
        stage ('Test'){
            steps{
                bat 'mvn clean test'
            }
        }
        stage ("Package"){
            steps{
                bat 'mvn clean package'
            }
        }
    }
    post {
        success {
            echo 'Build completed successfully'
        }
        failure {
            echo 'Build failed'
        }
    }
}