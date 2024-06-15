FROM java:17

EXPOSE 8500


ADD target/jenkins-project.jar jenkins-project.jar

ENTRYPOINT ["java","-jar","jenkins-project.jar"]





