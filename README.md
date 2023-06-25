# booklabs
Spring Boot 3.0 API deployment using Jenkins pipeline and Docker

[booklabs - Spring initializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.1&packaging=jar&jvmVersion=17&groupId=com.jnsdev&artifactId=booklabs&name=booklabs&description=Spring%20Boot%203.0%20API%20deployment%20using%20Jenkins%20pipeline%20and%20Docker&packageName=com.jnsdev.booklabs&dependencies=web,data-jpa,validation,postgresql,lombok,devtools)

## Postgresql
```shell
$ docker run --name postgres_dev -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=bookdb postgres
``` 
