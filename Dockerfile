FROM openjdk:16-jdk-alpine
ADD target/Zerver-0.0.1-SNAPSHOT.jar Zerver-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Zerver-0.0.1-SNAPSHOT.jar"]