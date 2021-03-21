```
 _                     _           _ _                       
| |__   ___        ___| |__   __ _| | | ___ _ __   __ _  ___ 
| '_ \ / _ \_____ / __| '_ \ / _` | | |/ _ \ '_ \ / _` |/ _ \
| |_) |  __/_____| (__| | | | (_| | | |  __/ | | | (_| |  __/
|_.__/ \___|      \___|_| |_|\__,_|_|_|\___|_| |_|\__, |\___|
                                                  |___/      

```
<hr>

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK 11](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
*   [Spring Cloud](https://spring.io/projects/spring-cloud) - Spring Cloud provides tools for developers to quickly build some of the common patterns in distributed systems (e.g. configuration management, service discovery, circuit breakers, intelligent routing, micro-proxy, etc)
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.
   

## Running the application locally

here are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.proximity.app` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml and run the command to install all the dependencies
```
mvn clean install
```
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (App.java file in  package `com.proximity.app` )
- Right Click on the file and Run as Java Application


Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

After this you can access the application from following url:
```shell
http://localhost:8080/swagger-ui.html
```


- Open Command Prompt and Change directory (cd) to folder containing pom.xml and run the command to run all the tests
```
mvn test
```
    

## packages

- `model` — to hold our entities.
- `service` — to hold our business logic.
- `controller` — to listen to the client.
- `exceptions` - exception handling logic.
- `resources/` - Contains all the static resources, templates and property files.
- `resources/application.properties` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.

- `test/` - contains unit tests

- `pom.xml` - contains all the project dependencies


## User Stories
- As an instructor, I can upload a webinar. :white_check_mark:
- As an instructor, I can create, edit, delete course. :white_check_mark:
- As an instructor, I can create, edit, delete subjects. :white_check_mark:
- As an instructor, I can create, edit, delete tags. :white_check_mark:
- As an instructor, I can upload a video. :white_check_mark:
- As an instructor, I can add new tag while uploading video or webinar. :hourglass_flowing_sand:
- As an instructor, I can see the most viewed videos, courses and webinars. :hourglass_flowing_sand:
- As a student, I can see list of webinars & videos. :white_check_mark:
- As a student, I can search webinars & videos by title. :hourglass_flowing_sand:
- As a student, I can filter webinars & videos by course, subjects, tags. :hourglass_flowing_sand:
- As a student, when I am playing a video or a webinar, I can get personalized suggestions of courses/webinars. :hourglass_flowing_sand: