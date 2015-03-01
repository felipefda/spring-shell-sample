# spring-shell-sample
This is a reference project that uses the Spring Shell (currently version 1.1.0-RELEASE).  It uses maven to compile, test, build and deploy.

## Maven Uses Cases

### Compile / Test / Install
```bash
mvn clean install
```

### Running (through Maven)
```bash
mvn exec:java
```

### Building an executable arfiact
```bash
mvn clean package
```

### Running compiled package
```bash
# Assumption is you've created the package already
java -jar target/spring-shell-sample-1.0-SNAPSHOT.jar
```

## The (Custom) Spring Shell
```shell
hw simple --message "Hello World" --location "My Console"
```

Running this command should produce the following output:

```shell
Message = [Hello World] Location = [My Console]
```
