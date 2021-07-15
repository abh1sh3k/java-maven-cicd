FROM tomcat:8.5.69-jdk8

LABEL MAINTAINER="abh1sh3k@yahoo.com"

ADD target/devops.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD [ "catalina.sh", "run" ]