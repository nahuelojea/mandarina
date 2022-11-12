FROM openjdk:11
EXPOSE 8080
ADD target/mandarina.jar mandarina.jar
ENTRYPOINT ["java", "-jar", "/mandarina.jar"]