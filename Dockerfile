FROM ne1itcprhas62.ne1.savvis.net:4567/devbaseimages/development_base_images/java8:2020Q2
VOLUME /tmp
ADD /target/fizzbuzz-0.0.1-SNAPSHOT.jar.jar app.jar
ENTRYPOINT ["java", "-Xmx750m", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

# FROM openjdk:8-jdk-alpine
# VOLUME /tmp
# ADD target/fizzbuzz-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]

