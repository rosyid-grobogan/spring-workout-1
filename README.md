# Workout for Master Java Web Services and REST API with Spring Boot

## RESTful Web Services

## Social Media Application Resource Mapprings
## User -> Posts

* Retrieve all Users    - GET       /users
* Create a User         - POST      /users
* Retrieve one Users    - GET       /users/{id} -> /users/5
* Delete a User         - DELETE    /users/{id} -> /users/5

##  Exercise User Post Resource and Exception Handling
* Retrieve all posts for a User     - GET       /users/{id}/posts
* Create a posts for a User         - POST      /users/{id}/posts
* Retrieve details of a post        - GET       /users/{id}/posts/{post_id}

## Error in the Log
```
Resolved exception caused by Handler execution:
``` 

## Internationalization
### Configuration
- LocaleResolver
    - Default Locale - Locale.US
- ResourceBundleMessageSource

### Usage
- Autowire MessageSource
- @RequestHeader(value = "Accept-Language, required = false) Locale locale
- messageSource.getMessage("helloWorld.message", null, locale) 

## Application.properties
```
logging.level.org.springframework = info
#This is not really needed as this is the default after 2.0.0.RELEASE
spring.jackson.serialization.write-dates-as-timestamps=false
spring.messages.basename=messages
management.endpoints.web.exposure.include=*
spring.security.user.name=username
spring.security.user.password=password
spring.jpa.show-sql=true
spring.h2.console.enabled=true
```

## Addtion for Dependencies in pom.xml
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-hateoas</artifactId>
</dependency>

<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-rest-hal-browser</artifactId>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.4.0</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.4.0</version>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>

```

## Swagger
### Document API
```
localhost:8080/v2/api-docs
```
### Swagger UI
```
localhost:8080/swagger-ui.html
```