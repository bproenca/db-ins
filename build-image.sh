#!/bin/bash
tag="jvm17azul"

echo "## Package JAR"
./mvnw clean package

echo "## RMI $tag"
docker rmi bproenca/db-ins:$tag

echo "## Build docker image"
docker build -f Dockerfile -t bproenca/db-ins:$tag .
