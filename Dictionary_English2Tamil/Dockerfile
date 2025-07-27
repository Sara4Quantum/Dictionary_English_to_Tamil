# Stage 1: Build the application using Maven and Java 8
FROM maven:3.8.5-openjdk-8-slim AS build
WORKDIR /app

# Copy your Maven project files
COPY pom.xml .
COPY src ./src

# Build the project (creates JAR in /app/target)
RUN mvn clean package -DskipTests

# Stage 2: Run the built JAR using OpenJDK 8
FROM openjdk:8-jdk-slim
WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]
