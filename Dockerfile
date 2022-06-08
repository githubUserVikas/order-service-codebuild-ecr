FROM openjdk:8
EXPOSE 8080
ADD target/order-service-codebuild-ecr.jar order-service-codebuild-ecr.jar
ENTRYPOINT ["java","-jar","/order-service-codebuild-ecr.jar"]
