node{

   def tomcatWeb = 'C:\\dev\\apache-tomcat-9.0.56\\webapps'
   def tomcatBin = 'C:\\dev\\apache-tomcat-9.0.56\\bin'
   def tomcatStatus = ''
   stage('SCM Checkout'){
     git 'https://github.com/Sita-Ram/FirstDemo.git'
   }
   stage('Compile-Package-create-war-file'){
      // Get maven home path
    //  def mvnHome =  tool name: 'maven-3', type: 'maven'   
     // bat "${mvnHome}/bin/mvn clean package"
	  bat "mvn package"
      }
/*   stage ('Stop Tomcat Server') {
               bat ''' @ECHO OFF
               wmic process list brief | find /i "tomcat" > NUL
               IF ERRORLEVEL 1 (
                    echo  Stopped
               ) ELSE (
               echo running
                  "${tomcatBin}\\shutdown.bat"
                  sleep(time:10,unit:"SECONDS") 
               )
'''
   }*/
   stage('Deploy to Tomcat'){
     bat "copy target\\web-app-name.war \"${tomcatWeb}\\web-app-name.war\""
   }
      stage ('Start Tomcat Server') {
         sleep(time:5,unit:"SECONDS") 
         bat "${tomcatBin}\\startup.bat"
         sleep(time:100,unit:"SECONDS")
   }
}