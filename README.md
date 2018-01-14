# Java 9 Modules Example with Maven and JUnit
This simple project shows how Maven can be used to build Java 9 modules. 

It uses the `ServiceLoader` to load loosely coupled services from other modules.
It also demonstrates how methods in non-exported packages can be unit-tested from the 
Unnamed Module simply by *not* modularizing the test sources.


Read more in our blog post: [Getting Started with Java 9 Modules]

## Prerequisites:
* Maven >= 3.0.0
* JDK 9

## Running the example
* `mvn clean package`
* `.\run.cmd` or `./run.sh`

## Known issues
* At the moment, the project does not compile in Eclipse due to a known issue in JDT. See this [thread on the m2e-users mailing list for more details and a workaround].

[Getting Started with Java 9 Modules]: https://labs.consol.de/development/2017/02/13/getting-started-with-java9-modules.html
[thread on the m2e-users mailing list for more details and a workaround]: https://dev.eclipse.org/mhonarc/lists/m2e-users/msg05698.html
