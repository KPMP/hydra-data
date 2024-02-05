# hydra-data
The service-layer for the KPMP Atlas Repository

# Test

`./gradlew test`

# Clear gradlew cache
If you have having troubles seeing changes during development, you can try to clear the gradle cache by running the following command:

`./gradlew clean`

# Build

`./gradlew build docker`

# Restart Spring

`docker kill spring`

`cd ~/proj/heavens-docker/atlas/knowledge-environment`

`docker-compose -f docker-compose.dev.yml up -d`

# View Spring Logs

`docker-compose -f docker-compose.dev.yml logs --f spring`

# Connect to QA database

1. Update .env ENV_MYSQL_HOST to the IP address of QA KE
2. Update .env ENV_MYSQL_PASSWORD to the password for QA KE
3. Add your IP address to a new security group called sg-0597e054f11d2e31a (Developer to KE Mariadb) 
4. Restart your knowledge-environment (don't worry that you have your own copy of mariadb, it'll be ignored)

# Regenerate the Atlas Repository Search Engine

1. Login to the KE Enterprise Search console (see https://docs.google.com/document/d/1uMb_ooDEU6PDkZOuFQGnPHo07UtnA-mrfwe3lpuEiho)
2. Delete the "repository" search engine
3. Create a new "repository" search engine
4. SSH to the appropriate KE machine
5. Execute:
    `curl -X GET http://localhost:3050/api/v1/repository/load-search`

# Pushing images to Docker
This repository is equipped to build and push an image to docker hub when pushing to the repository (except for master and develop). The image will be named whatever is specified in the `build.gradle` file. For the GitHub action to push the docker image, the image name MUST be identical between `build.gradle` and the workflow file found in `.github/workflows/build-gradle-project.yml`
