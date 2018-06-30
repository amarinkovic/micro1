FROM java:8u111-jre-alpine
COPY build/libs/micro1-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT exec java -Xms512m -Xmx515m -XX:MaxMetaspaceSize=256m -server -Dspring.config.location=classpath:/,/app/ -jar app/app.jar
