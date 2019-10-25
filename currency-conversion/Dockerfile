# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="rakeshv.com@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port available to the world outside this container
EXPOSE 8100 8101 8102 8787

ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"

ARG JAR_FILE=target/currency-conversion.jar

# Add the application's jar to the container
ADD ${JAR_FILE} currency-conversion.jar

# Run the jar file
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /currency-conversion.jar"]
