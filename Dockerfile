FROM amazoncorretto:11-allpine-jdk
MAINTAINER Perla
COPY target/Portfolio-0.0.1-SNAPSHOT.jar  perla-portfolio.jar
ENTRYPOINT ["java","-jar","/perla-portfolio.jar"]
