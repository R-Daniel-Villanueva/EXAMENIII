FROM openjdk:8-jre-slim
ENV JAR_FILE SPRINGBOOT/beca-service/beca-web/target/beca-web-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]