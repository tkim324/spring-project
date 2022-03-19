FROM gradle:7.4.1-jdk17

EXPOSE 8080:8080

COPY ../.. /app
WORKDIR /app
ENTRYPOINT ["gradle", "bootRun"]
