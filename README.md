## Micro1

Simple spring boot microservice that exposes prometheus metrics

Run the spring boot app:

```gradle bootRun```

Build and run the docker image

```shell
./gradlew build
docker build -t registry.gitlab.com/amarinkovic/micro1 .
docker run -it -d --name micro1 -p 8080:8080 registry.gitlab.com/amarinkovic/micro1:latest
```
To build container with jib, use:
```shell
./gradlew jibDockerBuild
```