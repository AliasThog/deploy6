
FROM openjdk:17

COPY ./jar/myapp.jar /app/myapp.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "myapp.jar"]