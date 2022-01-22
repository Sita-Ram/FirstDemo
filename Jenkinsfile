pipeline {
    agent any

    stages {
        stage('git') {
            steps {
                git url:'https://github.com/Sita-Ram/FirstDemo.git'
            }
        }
        stage('build') {
            steps {
                 bat 'mvn clean package'
            }
        }
    }
}