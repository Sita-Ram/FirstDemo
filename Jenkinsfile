pipeline {
    agent any

    stages {
        stage('git') {
            steps {
                git url:'https://github.com/Sita-Ram/FirstDemo.git'
            }
        }
        stage('buildAndStartApp') {
            steps {
                // bat 'mvn clean package'
				 bat './mvn spring-boot:run -Dserver.port=8989 &'
            }
        }
		
	}
}