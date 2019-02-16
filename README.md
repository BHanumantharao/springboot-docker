# springboot-docker

# Docker

*Note: If linux need to add (sudo) before command
ex: sudo docker ps //Showing only running containers

```
$ docker  								// to see docker commands
```

```
$ docker --verion 						// to check docker version

$ docker pull ubuntu  					// pull image ubuntu

$ docker images 						// to see images list in docker local container

$ docker run -ti --rm ubuntu /bin/bash 	// start images (default creates container) (this command will terminate container once you exit from container)

$ docker run -ti ubuntu /bin/bash 		// start container terminial interactive mode

$ docker start <container-id>			// re-start docker container

$ docker exec -it <container-id> bash 	// get into docker container shell

$ docker inspect <container-id>			// to get all details like IP, hostname, status, created time ... etc

$ docker ps 							// to check present running container with details

$ docker ps -aq 						// display running container ids only

$ docker stop $(docker ps -aq)			// stop all running containers

$ docker rm $(docker ps -aq)			// remove all containers

$ docker rmi $(docker images -q)		// remove all images

$ docker container stop <container-id> 	// stop docker container

$ docker rm <container-id>				// remove docker container

$ docker ps 							// Showing only running containers
$ docker ps -a 							// All container (running + stopped)
$ docker pa -l 							// latest
$ docker ps -n <int valuse 1,2,3 etc>  	// latest number of created containers
$ docker ps -s 							// Display container with size
$ docker ps -q 							// Only display numeric IDs for containers
$ docker ps -a | tail -n 1 				// oldest container

$ docker run -ti --name "hanudocker" --hostname "hanutechsol.com" ubuntu /bin/bash  // create/start container with customised details

$ docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube:latest   // start sonar in container
$ curl http://localhost:9000

$ docker build -t springbootdocker .  // build docker image

$ docker run -p 8080:8080 springbootdocker // run the container

```