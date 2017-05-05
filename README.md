# Java 9 Modules Example with Maven and JUnit
This simple project shows how Maven can be used to build Java 9 modules. 

It uses the `ServiceLoader` to load loosely coupled services from other modules.
~~It also demonstrates how methods in non-exported packages can be unit-tested from the 
Unnamed Module simply by not modularizing the test sources.~~ 
Note: currently, tests do not compile with maven-compiler-plugin 3.6.1 due to a breaking change in jdk-ea167. 
Hence `testSourceDirectory` entries are commented, hoping for an imminent fix.

## Prerequisites:
* Maven >= 3.0.0
* JDK 9 Early Access >= 152

## Running the example
* `mvn clean install`
* `.\run.cmd` or `./run.sh`