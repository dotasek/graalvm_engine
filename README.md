# graalvm_engine

This is a test project to illustrate the inclusion of GraalVM in a JAR file. 

## How to Build this Project

```
mvn clean install
```

## How to run this project

From IntelliJ idea, find `src/main/java/org/sorianopeverari/graalvm_engine/App.java`. Create a new Application run configuration for this class. Include a single CLI argument, which should be a directory containing an ant.xml file. (you can use the `example/` directory in this repo).

When run, this should execute the `ant.xml` script.

Example output (from included `example/ant.xml`:
```
dowork:
[scripttest] Attribute attr1 = test 
[scripttest]   test
Press enter to continue

Process finished with exit code 0
``` 
