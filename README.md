# hubble-data
The service-layer for the KPMP Atlas Spatial Viewer

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

# Regenerate the Spatial Viewer Search Engine

1. Login to the KE Enterprise Search console (see https://docs.google.com/document/d/1uMb_ooDEU6PDkZOuFQGnPHo07UtnA-mrfwe3lpuEiho)
2. Delete the “spatial-viewer” search engine
3. Create a new “spatial-viewer” search engine
4. SSH to the appropriate KE machine
5. Execute:
    `curl -X GET http://localhost:3040/api/v1/spatial-viewer/load-search`
