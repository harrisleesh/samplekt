FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
ARG JAR_FILE=./build/libs/samplekt-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} sample-kotlin-app.jar
ENTRYPOINT ["java", "-jar", "/sample-kotlin-app.jar"]