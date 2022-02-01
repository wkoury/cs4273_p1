## Deployment

We have a deployment of our Docker container [here](http://35.202.121.123/).

## Local Development
Assuming you have Gradle installed on your machine or VM...

To compile:
```
gradle build
```

To run the server:
```
gradle bootRun
```

## Docker
There is also a Dockerfile for this repository. We are using Docker instead of a shell script to generate a container with the required dependencies.

To build the docker image:
```
make
```

To run the docker image:
```
make docker-run
```

Alternatively, to do both sequentially (so you don't have to type 2 commands):
```
make docker
```

## IP Address
http://35.202.121.123/
