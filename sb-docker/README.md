## Spring boot, Maven and Docker

##### Commands

<pre>
ashish@LAPTOP-0CGC34A5:/mnt/d/work/git/docker-poc/sb-docker$ ./mvnw spring-boot:build-image
ashish@LAPTOP-0CGC34A5:~$ docker run --name=sb-docker -p8090:8090 -d sb-docker:0.0.1-SNAPSHOT
ashish@LAPTOP-0CGC34A5:~$ docker logs sb-docker -f
</pre>
