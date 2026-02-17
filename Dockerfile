FROM eclipse-temurin:21-jre
COPY prueba-java/target/*.jar app.jar
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]