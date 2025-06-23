FROM 522814735019.dkr.ecr.us-east-1.amazonaws.com/base-images:openjdk-17-slim 
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
