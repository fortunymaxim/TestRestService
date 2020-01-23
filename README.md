# README #

### Requirements ###

* Java JDK 8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Maven https://maven.apache.org/download.cgi
* Git https://git-scm.com/downloads
* Eclipse Neon https://www.eclipse.org/downloads/download.php?file=/oomph/epp/neon/R/eclipse-inst-win64.exe
* Eclipse JBoss Tools 4.4.0.Final Plugin (download from Eclipse Marketplace Help->Eclipse Marketplace in Eclipse)
* WildFly 10.0 Server http://wildfly.org/downloads/

### Tasks ###
* Using git pull down the project onto your local and create a new branch named {your_name_date}
* Create a class called Cars with fields make, model, and year
* In **TestService.java** create a GET function producing JSON for the rest service using RestEasy
* The function should return a list of the class Cars
* The list can contain all dummy data and should be at least 10 records
```
#!json

[
   {
      "make":"Ford",
      "model":"Mustang",
      "year":"2016",
   },
   {
      "make":"Chrysler",
      "model":"300",
      "year":"2017",
   }
]
```
* Use jquery and bootstrap to call the service and display the data in a responsive design in **index.html**
* Remote deploy the project to your local wildfly server using the command **mvn clean install** to test
* URL to the web page http://localhost:8080/MCSTest/
* URL to the rest service http://localhost:8080/MCSTest/rest/test/path_that_you_defined_for_GET_function
* Using git commit and push the completed project to the bitbucket repository

### Notes ###
* You may need to change the port for your wildfly server to 9990 or 9991 in the pom.xml file

### Helpful Documentation ###

* http://www.mastertheboss.com/jboss-server/wildfly-8/configuring-eclipse-to-use-wildfly-8
* https://docs.jboss.org/wildfly/plugins/maven/latest/examples/deployment-example.html
* http://www.mastertheboss.com/jboss-frameworks/maven-tutorials/jboss-maven/configuring-maven-wildfly-plugin
* https://www.mkyong.com/webservices/jax-rs/resteasy-hello-world-example/
* http://getbootstrap.com/css/
* https://maven.apache.org/guides/getting-started/