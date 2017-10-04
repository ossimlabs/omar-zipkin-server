# OMAR Turbine Server

## Dockerfile
```
FROM omar-base
COPY omar-zipkin-server-1.0.0-SNAPSHOT.jar /usr/share
VOLUME /dev/random /home /Users
EXPOSE 9411
CMD java -Xms256m -Xmx1024m -Dspring.profiles.active=production -Djava.security.egd=file:/dev/./urandom -Dserver.contextPath=/omar-zipkin-server -jar /usr/share/omar-zipkin-server-1.0.0-SNAPSHOT.jar
```
Ref: [omar-base](../../../omar-base/docs/install-guide/omar-base/)

## JAR
[https://artifactory.ossim.io/artifactory/webapp/#/artifacts/browse/tree/General/omar-local/io/ossim/omar/apps/omar-zipkin-server](https://artifactory.ossim.io/artifactory/webapp/#/artifacts/browse/tree/General/omar-local/io/ossim/omar/apps/omar-zipkin-server)
