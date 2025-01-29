FROM openjdk:21-jdk
ARG JAR_FILE
COPY ${JAR_FILE} request-credit-service.jar
ENTRYPOINT ["java","-jar","/request-credit-service.jar"]