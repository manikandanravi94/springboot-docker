FROM openjdk:8
ADD target/docker-spring-boot-mysql.jar docker-spring-boot-mysql.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot-mysql.jar"]