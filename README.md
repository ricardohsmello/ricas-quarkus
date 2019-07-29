# My Hello World from Quarkus

This is an example of rest json using Quarkus.

This repository contains an example of rest-json using Quarkus and a simple web page to interact with our resource.


![Quick Start quarkus](
https://imagizer.imageshack.com/img922/6096/WLCXll.png)

## Stack
- Quarkus
- Quarkus-resteasy-jsonb
- Angular

# Usage
## Running
Navigate until ricas-quarkus root and run:
- ./mvnw compile quarkus:dev
    - ###### Note: To achieve performance and effect when using quarkus, use a GraalVM instead of jvm. Change your JAVA_HOME to use graalVM.
    
![Quick Start quarkus](https://imagizer.imageshack.com/img922/4744/eddw0N.png)
    


## Testing
Type the follow URL on browser
http://localhost:8080/soccerPlayers.html

 - [POST] /soccerPlayers
 - [DELETE] /soccerPlayers
 - [GET] /soccerPlayers 
