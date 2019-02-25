FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/app.jar app.jar
EXPOSE 50051
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=test"]
