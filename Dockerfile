FROM amazoncorretto:17.0.8-alpine3.18
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]