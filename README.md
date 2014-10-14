# About
This demo integrates Swagger UI with Spring Boot


# Run as Spring Boot
* Eclipse > Right Click > Run as Spring Boot App


# Open Browser
Navigate to http://localhost:8080 
Navigate to http://localhost:8080/api-docs 


# Configuration
* Swagger is served from /public using spring boot default
* We could also serve swagger using a WebJar
* Tomcat-embed-jasper is included to render JSP views
* Jackson + @ResponseBody will cause JSON to be returned
* See other configs see application.properties 
