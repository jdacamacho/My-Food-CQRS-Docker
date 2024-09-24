FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/my-food-0.0.1.jar
COPY ${JAR_FILE} app_my_food.jar
EXPOSE 4000
ENTRYPOINT ["java", "-jar", "app_my_food.jar"]