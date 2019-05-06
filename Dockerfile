FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/springboot-karma-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} karma.jar
ENTRYPOINT ["java","-jar","/karma.jar"]
