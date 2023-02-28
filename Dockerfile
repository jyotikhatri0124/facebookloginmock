FROM openjdk:8-jre
ADD target/userprofile-0.0.1-SNAPSHOT.jar mock-demo.jar
ENTRYPOINT ["java", "-jar","mock-demo.jar"]
EXPOSE 8080