# Invoice Processing System

A full-stack web application for managing invoices efficiently using **React.js**, **Spring Boot**, and **MySQL**. The application provides a clean and responsive interface for creating, viewing, and deleting invoices while demonstrating modern full-stack development practices and RESTful API integration.

---

## 🚀 Features

- Create new invoices
- View all stored invoices
- Delete invoices
- Responsive user interface using Material UI
- RESTful API integration
- Persistent data storage with MySQL
- Spring Data JPA and Hibernate for database operations
- Clean and modular project architecture

---

## 🛠️ Tech Stack

### Frontend
- React.js
- Material UI
- Axios
- JavaScript
- HTML5
- CSS3

### Backend
- Spring Boot
- Spring Data JPA
- Hibernate
- Java

### Database
- MySQL

### Tools & Technologies
- Git
- GitHub
- Maven
- Eclipse STS
- Visual Studio Code
- Postman

---

## 📂 Project Structure

```
Invoice-Processing-System
│
├── client/
│   ├── public/
│   ├── src/
│   ├── package.json
│   └── ...
│
├── server/
│   ├── src/
│   ├── pom.xml
│   └── ...
│
└── README.md
```

---

## ⚙️ Getting Started

### Prerequisites

Make sure the following are installed:

- Java 17 or later
- Maven
- Node.js
- npm
- MySQL

---

## Installation

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/Invoice-Processing-System.git
```

```bash
cd Invoice-Processing-System
```

---

### 2. Configure MySQL

Create a database.

```sql
CREATE DATABASE invoice_db;
```

Update the database configuration inside:

```
server/src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/invoice_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3. Run the Backend

```bash
cd server
mvn spring-boot:run
```

The backend will start on

```
http://localhost:8080
```

---

### 4. Run the Frontend

Open another terminal.

```bash
cd client
npm install
npm start
```

The frontend will start on

```
http://localhost:3000
```

---

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/invoices` | Retrieve all invoices |
| POST | `/api/invoices` | Create a new invoice |
| DELETE | `/api/invoices/{id}` | Delete an invoice |

---

## 🗃️ Database

The project uses **MySQL** for persistent storage.

Spring Data JPA and Hibernate are used to perform CRUD operations without writing SQL queries manually.

---

## 🏗️ Architecture

```
                React Frontend
                       │
                Axios HTTP Requests
                       │
                Spring Boot REST API
                       │
             Spring Data JPA / Hibernate
                       │
                    MySQL Database
```

---

## ✨ Learning Outcomes

This project helped strengthen my understanding of:

- Full-stack application development
- REST API design and implementation
- React component-based architecture
- State management in React
- Spring Boot fundamentals
- Spring Data JPA and Hibernate
- Database design using MySQL
- Client-server communication using Axios
- Git and GitHub version control

---

## 🚀 Future Enhancements

- Update/Edit invoice functionality
- User authentication using Spring Security
- JWT-based authorization
- Invoice search and filtering
- Pagination
- Invoice PDF generation
- Dashboard with analytics
- Docker containerization
- CI/CD pipeline
- Cloud deployment

---
