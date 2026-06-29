
# Task Manager API

A RESTful Task Manager API built with Java and Spring Boot that allows users to create, update, retrieve, and delete tasks while following clean architecture and backend development best practices.

## Features

- Register
- Login
- Create a task
- Get all tasks
- Get a task by ID
- Update a task
- Delete a task
- Input validation
- Global exception handling
- Clean layered architecture
- RESTful API design

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring security
- Spring Data JPA
- MySQL
- Maven
- Hibernate

## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /auth/register | register |
| POST | /auth/login | login |
| POST | /api/tasks | Create Task |
| GET | /api/tasks | Get All Tasks |
| GET | /api/tasks/{id} | Get Task By ID |
| PUT | /api/tasks/{id} | Update Task |
| DELETE | /api/tasks/{id} | Delete Task |


## API Screenshots

### Register
![Register](images/register.png)


## Running the Project

1. Clone the repository
git clone https://github.com/ekabotdev/task-manager-api.git

## Navigate into the project
cd task-manager-api

## Configure your MySQL database
Update the application.properties file

## Run
mvn spring-boot:run

## Future Improvements

-User Authentication (JWT)
-Role-Based Authorization
-Pagination
-Search Tasks
-Task Categories
-Due Dates
-Task Priorities
-Docker Support
-Unit Testing
-Swagger/OpenAPI Documentation


## Author
ekabotdev
Backend Developer
