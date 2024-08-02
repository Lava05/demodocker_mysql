FROM openjdk:17
ADD target/demo2.jar demo2.jar
ENTRYPOINT ["java","-jar","/demo2.jar"]
