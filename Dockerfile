FROM gradle:7.3.3-jdk11

WORKDIR /www

COPY . .

RUN gradle assemble

RUN gradle build

EXPOSE 8080

ENTRYPOINT ["gradle", "bootRun"]
