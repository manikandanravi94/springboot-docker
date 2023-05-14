# springboot-docker
sample for spring-boot docker implementation
Docker sample application

Docker sample commands:

Docker file commands:

1. From --> to pull the image from docker hub
2. Add  --> copy the jar from target folder from app to docker root path of the container
3. Expose --> expose a port on which the app will be exposed from docker
4. Entrypoint --> it is used to run the app when the container is started

Docker CLI commands:

1. docker build -f Dockerfile -t <image name> .(. represent the current folder)
2. docker images    [once built docker image will be created.. to list down the images..]
3. docker run -p 8086:8086 -d image-name --> -p is the port where the port is mapped with local to the docker port -d run the container in detached mode
4. docker containter ls --> list the containers
5. docker stop containerid --> vl stop the running container
6. docker logs -f conatinerid --> vl see the container logs which are running in the detached mode
7. history --> vl list the docker command history which we used so far
8. docker image rm --> vl remove the image
9. docker container rm --> vl remove the container
10. docker rm --> vl remove the unused container if it is pointing any images

MYSQL container command: <> --> these items can be replace during runtime as per wish

1. docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=<password> -e MYSQL_USER_NAME=<username> -e MYSQL_USER_PASSWORD=<user-password> -d <image name>

2. docker exec -it <image name> bash --> it wil get the bash terminal inside the container once the container is started

3. mysql -u root -p --> it is used to login into the mysql using cli

4. then we can execute any cli commands like the following one -> show databases; create table; select;alter

We can integrate spring boot with mysql container with the below docker command and appropriate application property files to be changed
--link is the argument used to link both containers

1. docker run -p 8086:8086 --name springboot-mysql-container --link mysql-standalone-local:mysql -d docker-springboot-mysql --> we can use the link command to link one container to the another one
