# Use lightweight JDK image
FROM eclipse-temurin:17-jdk-jammy


# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
