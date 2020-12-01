![Issues](https://img.shields.io/github/issues/ricardohsmello/ricas-financas) 
![Forks](https://img.shields.io/github/forks/ricardohsmello/ricas-financas) 
![Stars](https://img.shields.io/github/stars/ricardohsmello/ricas-financas) 
![Release Version](https://img.shields.io/github/release/ricardohsmello/ricas-financas)

[![Build Status](https://travis-ci.org/ricardohsmello/ricas-financas.svg?branch=main)](https://travis-ci.org/ricardohsmello/ricas-financas)
[![Coverage Status](https://coveralls.io/repos/github/ricardohsmello/ricas-financas/badge.svg?branch=main)](https://coveralls.io/github/ricardohsmello/ricas-financas?branch=main)

# Ricas Finanças

## Built With

- [`Java 11`](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html/) - Language
- [`Spring-boot`](https://spring.io/projects/spring-boot) - Framework
- [`ArchUnit`](https://www.archunit.org) - Unit test your Java architecture 

 # Usage
## Cloning the repo

First of all we need clone the repo:
```
$ git clone https://github.com/ricardohsmello/ricas-financas.git
```
## Running sonarqube 

```
$ cd jacoco-sonarqube-spring-boot
$ docker-compose up -d
$ mvn sonar:sonar -Dsonar.projectKey=br.com.ricas:ricas-financas -Dsonar.host.url=http://localhost:7000
```

If everything its correct, the sonar will be available on: 

```
http://localhost:7000/
```

![Sonarqube](https://s1.imghub.io/9QW8d.png)

## Running Jacoco

```
$ mvn clean test
$ cd jacoco-sonarqube-spring-boot/target/site/jacoco

```

![Jacoco](https://s1.imghub.io/9lJvu.png)

## Endpoints
### findAll Finances
http://localhost:8080/api/finances/finance

```
{
    "description": "Gasolina do carro x",
    "value": 128.90,
    "dateTime": "2020-11-27T16:22:42.138Z",
    "category": {             
        "type": 0,
        "name": "Combustível"
    } 
}

```
### findAllByType Finances
http://localhost:8080/api/finances/finance/{EXPENSE}OR{REVENUE}

```
{
    "description": "Gasolina",
    "value": 128.9,
    "dateTime": "2020-11-27T00:00:00",
    "category": {
        "name": "Combustível",
        "type": 0,
        "uuid": "ffb822be-22f0-4793-9f4b-bcc3ad040043"
    },
    "uuid": "5c38ab57-cea6-4478-b11e-7637639092ed"
}

```
