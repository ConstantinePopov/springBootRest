FROM openjdk:18-jdk-alpine3.13

EXPOSE 8080

COPY target/springBootRest-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]