FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD exchange-rate-application-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -Dspring.datasource.url=$DS_URL -Dspring.datasource.username=$DS_USR -Dspring.datasource.password=$DS_PWD -jar /app.jar
