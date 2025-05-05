
# TaskPro - Project Management API

## Overview

TaskPro is a simple project management API built with **Spring Boot**. It allows users to **create**, **retrieve**, **update**, and **delete** project data through RESTful endpoints.

---

## Endpoints

### 1. Create a Project

**Endpoint:** `POST /projects`
**Description:** This endpoint allows you to create a new project.

**Request Body (JSON):**

```json
{
    "name": "TaskPro",
    "description": "Track your tasks"
}
```

**Response (JSON):**

```json
{
    "name": "TaskPro",
    "description": "Track your tasks"
}
```

**Example Request Using `curl`:**

```bash
curl -X POST http://localhost:8080/projects \
     -H "Content-Type: application/json" \
     -d '{"name": "TaskPro", "description": "Track your tasks"}'
```

---

### 2. Get All Projects

**Endpoint:** `GET /projects`
**Description:** This endpoint retrieves a list of all the projects stored in the system.

**Response (JSON):**

```json
[
    {
        "name": "TaskPro",
        "description": "Track your tasks"
    },
    {
        "name": "Another Project",
        "description": "Manage tasks for another project"
    }
]
```

**Example Request Using `curl`:**

```bash
curl http://localhost:8080/projects
```

---

### 3. Get a Project by ID

**Endpoint:** `GET /projects/{id}`
**Description:** This endpoint retrieves a project by its ID.

**Response (JSON):**

```json
{
    "name": "TaskPro",
    "description": "Track your tasks"
}
```

**Example Request Using `curl`:**

```bash
curl http://localhost:8080/projects/1
```

---

### 4. Update a Project

**Endpoint:** `PUT /projects/{id}`
**Description:** This endpoint updates an existing project. You can modify the `name` and `description` of the project.

**Request Body (JSON):**

```json
{
    "name": "Updated TaskPro",
    "description": "Updated task tracking"
}
```

**Response (JSON):**

```json
{
    "name": "Updated TaskPro",
    "description": "Updated task tracking"
}
```

**Example Request Using `curl`:**

```bash
curl -X PUT http://localhost:8080/projects/1 \
     -H "Content-Type: application/json" \
     -d '{"name": "Updated TaskPro", "description": "Updated task tracking"}'
```

---

### 5. Delete a Project

**Endpoint:** `DELETE /projects/{id}`
**Description:** This endpoint deletes a project by its ID.

**Response (JSON):**

```json
{
    "message": "Project deleted successfully"
}
```

**Example Request Using `curl`:**

```bash
curl -X DELETE http://localhost:8080/projects/1
```

---

## Setup and Installation

### Prerequisites

Before running the application, ensure you have the following installed:

* Java 17
* Maven (for building the project)
* Spring Boot

### Steps to Run the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/TaskPro.git
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


---

### Example Diagram of Flow:

**1. User sends a POST request to `/projects` with JSON data.**
**2. Spring Boot maps this data into a DTO object (`ProjectRequestDTO`).**
**3. The `create()` method in the controller calls the service to save the project.**
**4. The project is added to an in-memory list and returned to the client.**

---

Let me know if you need any further updates or explanations!
