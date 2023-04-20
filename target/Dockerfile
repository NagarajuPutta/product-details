FROM openjdk:11-jdk
EXPOSE 9191
ADD target/product-details.jar product-details.jar
ENTRYPOINT ["java","-jar","/product-details.jar"]