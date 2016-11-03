FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /tmp

ADD exchange-rate-application-1.0-SNAPSHOT.jar app.jar
ADD wait-for-db.sh wait-for-db.sh

RUN apk update && apk add postgresql-client
RUN sh -c 'touch /app.jar'

CMD java -Djava.security.egd=file:/dev/./urandom -Dspring.datasource.url="jdbc:postgresql://${DS_HST}:5432/${DS_DBN}" -Dspring.datasource.username=${DS_USR} -Dspring.datasource.password=${DS_PWD} -jar /app.jar
