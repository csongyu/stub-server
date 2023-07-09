# [stub-server](https://csongyu.github.io/posts/a5eeea58.html)

### [Running as a Standalone Process](https://wiremock.org/docs/running-standalone/)

```bash
nohup java -jar wiremock-jre8-standalone-2.35.0.jar --root-dir wiremock-home > nohup.log 2>&1 &
```

### [Running in Docker](https://wiremock.org/docs/docker/)

```bash
docker run -d -p 8080:8080 --name stub-server -v $PWD/wiremock-home:/home/wiremock wiremock/wiremock:2.35.0
```

### [Using with Spring Boot](https://wiremock.org/docs/configuration/)

```bash
cd ./stub-server-app
mvn clean package
java -jar ./target/stub-server-app-1.0.0.jar
```
