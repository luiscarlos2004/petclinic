FROM openjdk:17
LABEL authors="luiscarlos"
ADD target/clinicEc2-0.0.1-SNAPSHOT.jar clinicEc2.jar
ENTRYPOINT ["java","-jar","clinicEc2.jar"]