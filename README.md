Spring BPMN
===========

This is just the Spring integration with Camunda example thrown together with minor
adjustments to help me understand how to run Camunda Process Engine embedded in a 
web app using Spring.

Build
-----

`mvn clean install`

Deploy
------

`cp target/loanapproval-spring-0.1.0-SNAPSHOT.war $TOMCAT_HOME/webapps`

Verification
------------
You should see the following in $TOMCAT_HOME/logs/catalina.out:

```
...
INFO: ProcessEngine engine created
Running loanApproval process...
Spring Bean invoked.
...
```