pipeline {
    agent any

	environment {
		def tomcatWeb = "C:\\dev\\apache-tomcat-9.0.56\\webapps"
		def tomcatBin = "C:\\dev\\apache-tomcat-9.0.56\\bin"
		def tomcatStatus = ""
	   }
   
    stages {
        stage('checkout') {
            steps {
                git url:'https://github.com/Sita-Ram/FirstDemo.git'
            }
        }
        stage('buildAndPackage') {
            steps {
					bat 'mvn clean package'
				// bat 'mvn spring-boot:run -Dserver.port=8989 &'
            }
        }
		
		  stage('deploy') {
            steps {
					bat "copy target\\SpringDEMO.war \"${tomcatWeb}\\SpringDEMO.war\""
				// bat 'mvn spring-boot:run -Dserver.port=8989 &'
            }
        }
		
		  stage('startServer') {
            steps {
					bat "${tomcatBin}\\startup.bat"
				// bat 'mvn spring-boot:run -Dserver.port=8989 &'
            }
        }
	}
}