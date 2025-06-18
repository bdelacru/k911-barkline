# Use an official JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Argument for the JAR file path
ARG JAR_FILE=build/libs/*.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]
