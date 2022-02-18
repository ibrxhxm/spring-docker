FROM openjdk:11
MAINTAINER ibrxhxm
VOLUME /tmp
EXPOSE 8080
ADD build/libs/spring-docker-0.0.1-SNAPSHOT.jar spring-docker.jar
ENTRYPOINT ["java","-jar","spring-docker.jar"]