FROM openjdk:17-oracle
WORKDIR /app
COPY target/a-tale-of-second-app-0.0.1-SNAPSHOT.jar sec-app.jar
ENTRYPOINT ["java", "-jar", "sec-app.jar"]