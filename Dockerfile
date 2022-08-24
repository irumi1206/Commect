FROM openjdk:17.0.2-jdk-slim
COPY build/libs/Comect-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]