
# TaskPro - Project Management API


## Learning Checklist
- [x] Java 17
- [ ] Core Concepts
   - [x] Servlet
   - [x] Convention over Configuration
   - [x] Inversion of Control (IoC)
   - [x] IoC Container
   - [x] Dependency Injection
   - [x] Application Context
   - [x] Bean
   - [x] DispatcherServlet
   - [ ] Interceptor
   - [x] Filter
- [x] Server-Side (using Template Engine)
   - [ ] / (Portfolio Homepage)
   - [ ] Practice Thymeleaf Tags (e.g. th:if, th:each, etc.)
- [ ] REST API
   - [X] /api/projects (CRUD for Projects)
   - [ ] Secure Endpoints
   - [x] Input Validation
   - [x] API Documentation: Swagger
   - [x] API Paging and Sorting
- [x] application.properties
   - [ ] @ConfigurationProperties
   - [ ] @Value
   - [ ] yaml/yml format
- [ ] Exception
   - [x] Custom Exception Class
   - [x] Global Exception Handler
- [x] Logging
   - [x] Framework
      - [x] Logback
      - [x] Facade: SLF4J
   - [x] Logging Levels
   - [x] Configure Logging using application.properties
   - [ ] Configure Logback using XML
- [ ] External Service Call
- [ ] Boilerplate Code Reduce
   - [x] Mapper for Mapping
   - [x] Lombok for Generating Getters and Setters
- [ ] Spring Security
   - [ ] Basic Auth
   - [ ] JWT
- [ ] Database
   - [x] H2 (In-Memory Database)
   - [ ] PostgreSQL
- [x] Spring Profiles (local, dev, prod)
- [ ] Deployment
   - [x] Platform as-a Service (PaaS): [Render](https://portfolio-6nv7.onrender.com/)
   - [ ] Infrastructure as-a-Service (IaaS): Virtual Machine

## Setup and Installation

### Prerequisites

Before running the application, ensure you have the following installed:

* Java 17
* Maven (for building the project)
* Spring Boot

### Steps to Run the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/Didar1313/TaskPro.git
   ```

2. Navigate into the project directory:

   ```bash
   cd TaskPro
   ```

3. Build and run the project:

   ```bash
   mvn spring-boot:run
   ```

4. The application will start running on `http://localhost:8080`.

---

## Technologies Used

* **Spring Boot**: A framework to build the backend API.
* **Maven**: For building the project.
* **Java**: Programming language used for developing the backend.

---

## Project Structure

```
TaskPro
├── controller
│   └── ProjectController.java
├── dto
│   └── ProjectRequestDTO.java
├── model
│   └── Project.java
├── service
│   └── ProjectService.java
└── application.properties
```



