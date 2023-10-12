FROM adoptopenjdk/openjdk11:alpine
COPY target/*.jar /app/app.jar

EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/app.jar"]


