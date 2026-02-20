FROM eclipse-temurin:17-jdk

COPY target/demo-app.jar /user/app

WORKDIR /user/app

EXPOSE 8080

ENTRYPOINT ["java","-jar","demo-app.jar"]
