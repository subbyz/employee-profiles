FROM openjdk:8
ADD target/employee-profiles-docker.jar employee-profiles-docker.jar
EXPOSE 9055
ENTRYPOINT ["java", "-jar", "employee-profiles-docker.jar"]