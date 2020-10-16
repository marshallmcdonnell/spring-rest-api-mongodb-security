# Spring REST API Example for DF Rappers using MongoDB and Spring Security

This is my example project for a Spring Boot REST API for a CRUD-style application w/ added Spring Security.

It follows [Thomas Gleason's blog tutorial](https://www.codementor.io/@gtommee97/rest-authentication-with-spring-security-and-mongodb-j8wgh8kg7).

## Getting Started

For docker setup, run:

```
docker-compose build && docker-compose up
```

Spin down with:

```
docker-compose down
```

## Security

The [bcrypt hashing function](https://en.wikipedia.org/wiki/Bcrypt) is used for the encryption of User passwords.

To encrypt the password in the seed data for MongoDB (in `dockerfiles/seed-data.js`),
the [devglan online bcrypt hash generator](https://www.devglan.com/online-tools/bcrypt-hash-generator) was used
to create the encrypted version of the password.

The default username and password are are:
 - username: `erugh`
 - password: `dontflop`

To create the authorization header token, use the following command to generate the token:
```
echo -n "<username>:<password>" | base64
```

Thus, for the defaults, you would get the token `ZXVyZ2g6ZG9udGZsb3A=` from:
```
echo -n "eurgh:dontflop" | base64
```

## Example

Example using the default username and password token (lists all current Rappers):

```
curl --request GET --header "Authorization: Basic ZXVyZ2g6ZG9udGZsb3A=" http://bigbird.ornl.gov:8080/rappers
```

### Stack / Tools

Setup was created using [Spring Initializr](https://start.spring.io/)

* Spring Boot
  - Spring WEB
  - Spring Security
* MongoDB 


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

