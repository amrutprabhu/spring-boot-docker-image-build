# 3 Ways to Build Docker Images for Spring Boot Applications

I have three mechanisms in the same pom file which are put under different maven profiles.

- Building Image with Spring Boot Build Plugin
  
    ```shell
    mvn clean verify spring-boot:build-image
    ```

- Building Image with Fabri8 :

    ```shell
    mvn clean verify -DskipTests -Pbuild-with-fabric-8
    ```


- Building Image with JIB : 

    ```shell
    mvn clean verify -DskipTests -Pbuild-with-jib
    ```

