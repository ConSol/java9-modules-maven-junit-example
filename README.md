# Java 9 Modules Example with Maven and JUnit
This simple project shows how Maven can be used to build Java 9 modules. 

It uses the `ServiceLoader` to load loosely coupled services from other modules.
It also demonstrates how methods in non-exported packages can be unit-tested from the 
Unnamed Module simply by *not* modularizing the test sources.


Read more in our blog post: [Getting Started with Java 9 Modules]

## Hints

The notes above about failing compiles has been fixed with the maven-compiler-plugin version 3.7.0 which is configured in this build.

## Prerequisites:
* Maven >= 3.0.0
* JDK 9

## Running the example
* `mvn clean package`
* `.\run.cmd` or `./run.sh`

[Getting Started with Java 9 Modules]: https://labs.consol.de/development/2017/02/13/getting-started-with-java9-modules.html
