# Use a Java base image
FROM openjdk:23-jdk-slim AS build

# Set the working directory in the Docker container
WORKDIR /app

# Copy the Maven Wrapper executable and its support files
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Use the Maven Wrapper to build the application
RUN ./mvnw install -DskipTests

# Start a new build stage for running the application
FROM openjdk:23-jdk-slim
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
