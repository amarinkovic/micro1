## Spring Boot Swagger POC

Simple project that auto-generates Swagger API specification based on annotated source

Run the spring boot app:

```gradle bootRun```

Build and run the docker image

```shell
gradle build
docker build -t registry.gitlab.com/amarinkovic/micro1 .
docker run -it -d --name micro1 -p 8080:8080 registry.gitlab.com/amarinkovic/micro1:latest
```

