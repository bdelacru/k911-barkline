# Stage 1: Build the app
FROM gradle:8.5-jdk17-alpine AS builder
WORKDIR /app
COPY --no-cache . .
RUN gradle build -x test

# Stage 2: Run the app
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
