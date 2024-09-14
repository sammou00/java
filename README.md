# Java Backend Development Course

## Course Overview

This 12 weeks course will introduce students to Java for backend development, with a focus on essential language concepts, database access using JPA, and building RESTful APIs using **Spring Boot**. By the end, students will be able to develop a basic, full-featured backend service.

## Week 1

### Introduction to Java & OOP

- Java Overview and Setup (JDK, IDE)
- Basic Syntax (Variables, Data Types, Operators)
- Control Structures (If-else, Switch, Loops)
- Object-Oriented Programming (Classes, Objects, Methods)
- Encapsulation, Inheritance, Polymorphism, Abstraction

### Week 1 Task

Create a simple Java program demonstrating basic OOP principles.

---

## Week 2

### Java Collections & Data Structures

- Arrays and Strings
- Java Collections (List, Set, Map)
- Common Implementations (ArrayList, LinkedList, HashMap, HashSet)
- Iterating over Collections (For, For-each)

### Week 2 Task

Write a program to manage a list of students using Java Collections.

---

## Week 3

### Exception Handling & File I/O

- Java Exception Handling (try-catch, throw, throws)
- Custom Exceptions
- File Handling Basics (Reading/Writing Files)
- Intro to Serialization & Deserialization

### Week 3 Task

Create a program that reads from a file and writes processed output to a new file.

---

## Week 4

### Introduction to Databases & JPA

- Basics of Relational Databases
- Introduction to JPA (Java Persistence API)
- Database Tables & Entity-Relationship Mapping
- Setting up a Simple Console App using JPA (Entity Creation, Table Generation)

### Week 4 Task

Create a basic Java console app that maps entities to a database table using JPA.

---

## Week 5

### JPA, Entities & CRUD Operations

- Defining Entities (@Entity, @Table, @Id)
- CRUD Operations with JPA (Create, Read, Update, Delete)
- Relationships between Entities (One-to-Many, Many-to-One)

### Week 5 Task

Expand the console app to implement CRUD operations for managing entities in the database.

---

## Week 6

### Maven Basics & Project Setup

- Introduction to Maven (POM file, Dependencies)
- Using Maven to Build Projects
- Basic Project Setup with Maven (Dependencies for JPA, Spring Boot)

### Week 6 Task

Set up a Maven project with basic dependencies and build it using Maven.

---

## Week 7

### Introduction to Spring Boot & Dependency Injection

- Introduction to Spring Framework & Spring Boot
- Spring Boot Annotations (@SpringBootApplication, @Autowired)
- Understanding Dependency Injection
- Creating a Basic Spring Boot Application

### Week 7 Task

Build a basic Spring Boot application with dependency injection.

---

## Week 8

### REST APIs with Spring Boot

- Introduction to RESTful Web Services
- Spring Boot REST Controllers (@RestController, @RequestMapping)
- Handling HTTP Methods (GET, POST, PUT, DELETE)
- Validating Requests with @Valid

### Week 8 Task

Develop a REST API to manage a simple resource, like a product or student.

---

## Week 9

### Spring Data JPA & Database Integration

- Introduction to Spring Data JPA
- Connecting Spring Boot with JPA Repositories
- Query Methods and Custom Queries
- Database CRUD Operations via REST

### Week 9 Task

Integrate a database with the REST API and perform CRUD operations using Spring Data JPA.

---

## Week 10

### Security, Testing & Deployment

- Introduction to Spring Security (Authentication & Authorization)
- JWT (JSON Web Tokens) for Securing APIs
- Testing REST APIs (JUnit, MockMvc)
- Packaging and Deploying Spring Boot Applications

### Week 10 Task

Secure the REST API with Spring Security and JWT, then deploy it to a cloud platform like Heroku or AWS.

---

For the project in the last two weeks, here's a suggestion that ties together everything the students have learned:

---

## Week 11 & 12: Final Project – Building a RESTful Web Service with User Authentication

### Project Overview

Students will develop a full-featured **Book Management System** that allows users to manage a library of books. The system will include user authentication, CRUD operations for managing books, and interaction with a database using Spring Data JPA. They will also secure the API using **Spring Security** and **JWT**, and deploy the application on a cloud platform (e.g., Heroku or AWS).

### Project Features

1. **User Authentication**:
   - Implement user registration and login using **Spring Security** and **JWT**.
   - Secure the API endpoints to ensure only authenticated users can access them.

2. **Book Management API**:
   - Create CRUD endpoints for managing books (adding, updating, deleting, and fetching book details).
   - Each book should have attributes like `title`, `author`, `isbn`, `publishedDate`, and `genre`.
   - Implement **pagination** and **filtering** for book lists.

3. **Database Integration**:
   - Use **Spring Data JPA** to store user and book data in a database (e.g., PostgreSQL, MySQL).
   - Establish relationships between users and the books they manage.

4. **Validation**:
   - Validate request bodies for creating or updating books (e.g., checking required fields, valid ISBN format).

5. **Testing**:
   - Write unit and integration tests using **JUnit** and **MockMvc** for the API endpoints.

6. **Deployment**:
   - Package and deploy the application to a cloud platform (e.g., **Heroku** or **AWS**).
   - Configure environment variables and ensure the application runs in production mode.

### Week 11: Building Core Features

- Set up the Spring Boot project with required dependencies.
- Implement user registration and login with Spring Security and JWT.
- Build the book management API with CRUD functionality.
- Connect the application to a database and use Spring Data JPA to manage entities.

### Week 12: Testing, Security, and Deployment

- Add request validation for book management endpoints.
- Write unit and integration tests for the API.
- Implement security using Spring Security and JWT.
- Deploy the application to a cloud platform and ensure it's accessible online.

---
