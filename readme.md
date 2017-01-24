# Proof of concept of spring boot app

## Description 
A web application proof of concept with Spring-boot, freemarker, Hibernate


## Usage

cd to work directory
git clone git@github.com:abdoulinho00/springBoot-medidoc.git
cd springBoot-medidoc
mvn clean package

either execute 
mvn spring-boot:run or java -jar target/spring-boot-test-v1.0.jar

if you want to run in debug

java -jar target/spring-boot-test-v1.0.jar --debug

in your browser access via http://localhost:8080


## Cloud Foundry deploy
mvn clean package

After you login into cloudfoundry via "cf login"

cf push springbootest -p target/spring-boot-test-v1.0.jar


## To do
* Add some test classes
* Add test coverage
* Add message key support

