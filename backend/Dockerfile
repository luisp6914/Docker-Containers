#Production Docker steps
# Stage 1: Build the application
FROM maven:3.9.9-eclipse-temurin-24-alpine AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:24-jdk-alpine
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

# Local Testing docker set up
# FROM eclipse-temurin:24-jdk-alpine
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java", "-jar", "/app.jar"]