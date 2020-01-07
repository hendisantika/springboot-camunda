# Spring Boot and Camunda BPM

This project illustrates the use of Camunda BPM with Spring Boot and for this purpose
demonstrates ATM workflow (one way of representing it).


## Project Structure

Into the resource folder there is one more folder (bpmn) that contains all business process
models. For this purpose it contains only one - **atm.bpmn**. You can put your custom models inside
that folder.


## Camunda Docs

This project contains set of Camunda APIs that you can use for your business models. All APIs
are developed in background. You can find the useful docs about it on this link:
```https://docs.camunda.org/manual/7.5/reference/rest/```


## ATM business process model

On the image bellow you can see the business process that will be demonstrated
in this project.

![alt text](https://github.com/hedza06/spring-boot-camunda/blob/master/src/main/resources/images/atm_process_image.png)


## Running the project

1. Create database with name ``camunda``
2. Open terminal and navigate to project directory
3. Run command: ```mvn clean install -DskipTests```
4. Run your app.


## Process Management with Camunda REST API

- Getting list of deployed processes  
Method: **GET**  
Endpoint: **http://localhost:8080/rest/process-definition**

- Start process instance  
Method: **POST**  
Endpoint: **http://localhost:8080/rest/process-definition/{process_id}/start**  
Request payload: **Could be initial variables or empty payload**

- Getting list of active process instances  
Method: **GET**  
Endpoint: **http://localhost:8080/rest/process-instance**

- Getting list of user tasks  
Method: **GET**  
Endpoint: **http://localhost:8080/rest/task**

- Submit user task form  
Method: **POST**  
Endpoint: **http://localhost:8080/rest/task/{task_id}/submit-form**  
Request payload:  
```{"variables": { "variable1": { "value": "some_value" }}, { "variable2": { "value": "some_value" } }}```


## Packaging application

1. Open your terminal and navigate to project directory
2. Run command: ```mvn clean package -DskipTests```
