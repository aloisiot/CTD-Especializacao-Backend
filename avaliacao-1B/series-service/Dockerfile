FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/series-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8003