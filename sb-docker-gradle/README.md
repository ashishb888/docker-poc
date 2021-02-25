##Spring boot & Docker

##### Commands

<pre>

ashish@LAPTOP-0CGC34A5:/mnt/d/work/git/docker-poc/sb-docker-gradle$ ./gradlew bootBuildImage
ashish@LAPTOP-0CGC34A5:~$ docker run --name=sb-docker-gradle -p8090:8090 -d sb-docker-gradle:0.0.1-SNAPSHOT
ashish@LAPTOP-0CGC34A5:~$ docker logs sb-docker-gradle -f
ashish@LAPTOP-0CGC34A5:~$ dive sb-docker-gradle:sb-docker-gradle

</pre>