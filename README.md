# Full Stack Portfolio

## Description:

This is the Docker Containers part of the application that allows me to demonstrate my skills in Full stack development. 
I will be using technologies like Spring Boot, PostgreSQL, and Render. Spring boot backend will be deployed by using docker and 
PostgreSQL will be managed by Render's services.

## Database:

The application will be using MySQL relational database to store information and project details.

### `Running the database`
- `Open` new terminal
- `CD` into to the database folder by running this command at the root of the project `cd ./database`
- `Run` the database container by using the command `docker run <image name>`
- `Interact` with the container by running `docker exec -it <container ID> /bin/bash`
- `Login` to mysql with the command `mysql -p<password> -uroot`
- `View` databases run `show databases;`
- `Use` the database by running `use <database name>;`
- `View` tables run `show tables;`
- `exit` MySQL and bash with the command `exit` on both.
- `Stop` the container with the command `docker stop <container ID>`

## Database Update:

The application now uses a PostgreSQL relational database to store information and project details. This migration was made to facilitate containerized deployment without running into payment restrictions. MySQL presented a paywall when deploying on Render.com, so switching to PostgreSQL allowed me to leverage free educational resources for deployment.

### `Running the database container`
- `Open` new terminal
- `Run` the database container by using the command `docker run <image name>`
- `Find` the PostgreSQL container by using the `docker ps` command
- `Interact` with the container by running `docker exec -it <container_name> psql -U <postgres_user> -d <database_name>`
- `View` databases run `\dt;`
- `exit` the databse with `\q`

## Backend: 

The backend is developed using Java with Spring Boot, and Maven is used for dependency and build management.

### `Running the backend container`
- `Open` new terminal
- `CD` into to the backend folder by running this command at the root of the project `cd ./backend`
- `Run` the database container by using the command `docker run <image name>`

## Docker-Compose
The application tested and developed using docker-compose, which allows me to easily manage and run multiple containers, specifically, 
the database and backend of the application. The docker-compose file is located at the root directory of the project.

### `Running the docker-compose file`
- `CD` into to the root directory of the project
- `Run` the docker-compose file with the command `docker-compose up`
- `Stop` the docker-compose file with the command `docker-compose down`