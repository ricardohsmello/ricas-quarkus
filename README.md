# My Hello World from Quarkus

This is an example of rest json using Quarkus.

This repository contains an example of rest-json using Quarkus and a simple web page to interact with our resource.

## Built With
- Quarkus
- Quarkus-resteasy-jsonb
- Angular

# Usage
Navigate until ricas-quarkus root and run:
```
- ./mvnw compile quarkus:dev
```
  - ###### Note: To achieve performance and effect when using quarkus, use a GraalVM instead of jvm. Change your JAVA_HOME to use graalVM.
    
![Quick Start quarkus](https://imagizer.imageshack.com/img922/4744/eddw0N.png)
    
## Running
Type the follow URL on browser
- ##### Interactive web page
```
    - http://localhost:8080/soccerPlayers.html
 ``` 
 ![Quick Start quarkus](
https://imagizer.imageshack.com/img922/6096/WLCXll.png)
- ##### Rest-json
```
    - http://localhost:8080/soccerPlayers
 ```
[{"player":"Neymar Jr","team":"Paris Saint-Germain"},{"player":"Cristiano Ronaldo","team":"Juventus"},{"player":"Lionel   Messi","team":"Barcelona"},{"player":"Steven Gerrard","team":"Liverpool"}]
- ##### HTTP Methods
    - [POST] /soccerPlayers
    - [DELETE] /soccerPlayers
    - [GET] /soccerPlayers 

