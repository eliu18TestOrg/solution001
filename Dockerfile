FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE
ADD target/*.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

