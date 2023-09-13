# Apartment Swap Service's JWT authorization API

The microservice aimed to authorize users in Apartment Swap Service system returning JWT Access and Refresh tokens

***
##  Endpoints
### POST auth/
Gets form with existing users correct email and password, and then returns access and refresh tokens
#### Request: 
  * Content-Type: application/x-www-form-urlencoded
  * fields: email, password
#### Successful authorization response: 
  * HTTP status code: 200
  * Content-Type: application/json
  * content: refresh and access JWT
#### Unsuccessful authorization response:
  * HTTP status code: 401
  * Content-Type: application/json
  * content: error info
***
### POST auth/refresh
Gets valid refresh token and returns new access and refresh tokens
#### Request:
  * Content-Type: application/json
  * content: refresh token
#### Successful refresh response: 
  * HTTP status code: 200
  * Content-Type: application/json
  * content: refresh and access JWT
#### Unsuccessful refresh response:
  * HTTP status code: 401
  * Content-Type: application/json
  * content: error info
