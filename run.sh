#!/bin/sh
$JDK_HOME/bin/java --module-path devday-service/target/devday-service-1.0-SNAPSHOT.jar:devday/target/devday-1.0-SNAPSHOT.jar:devday-workshop-service/target/devday-workshop-service-1.0-SNAPSHOT.jar:devday-talk-service/target/devday-talk-service-1.0-SNAPSHOT.jar -m de.consol.devday/de.consol.devday.Devday
