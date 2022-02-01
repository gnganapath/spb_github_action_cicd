From openjdk: 11
EXPOSE 8080
ADD target/spb-github-actions-cicd-docker.jar spb-github-actions-cicd-docker.jar
ENTRYPOINT ["java", "-jar", "/spb-github-actions-cicd-docker.jar"