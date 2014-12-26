# About
This demo integrates Swagger UI with Spring Boot


# Run as Spring Boot
* Eclipse > Right Click > Run as Spring Boot App


# Open Browser
* Navigate to <http://localhost:8080/webjars/swagger-ui/2.0.24/index.html>
* Swagger API  <http://localhost:8080/api-docs>


# Configuration
* Swagger is served from a webjar 
* Tomcat-embed-jasper is included to render JSP views
* Jackson + @ResponseBody will cause JSON to be returned
* See other configs see application.properties 
* I haven't yet figured out how to change swagger's default base URL  
