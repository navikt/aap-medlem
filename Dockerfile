FROM eclipse-temurin:17-jdk-alpine
COPY app/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]