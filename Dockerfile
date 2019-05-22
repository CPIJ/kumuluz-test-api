FROM maven:3.6.1-alpine

WORKDIR /app/

COPY src /app/src
COPY pom.xml /app/

RUN mvn clean package

EXPOSE 8080

CMD java -jar /app/target/api-1.0-SNAPSHOT.jar