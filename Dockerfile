FROM gradle:8.10-jdk17 AS builder
WORKDIR /sdk
COPY settings.gradle.kts build.gradle.kts ./
COPY src ./src
RUN gradle test --no-daemon