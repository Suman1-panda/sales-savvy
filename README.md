# 🚀 Sales Savvy - Spring Boot REST API

## 📌 Project Overview

Sales Savvy is a Java Spring Boot backend application designed to manage sales records efficiently.  
It provides REST APIs to perform basic operations like creating, viewing, and deleting sales data with MySQL database integration.

---

## ✨ Key Features

✔ Add Sales Record  
✔ View All Sales  
✔ View Sales by ID  
✔ Delete Sales Record  
✔ REST API Backend  
✔ Spring Boot MVC Architecture  
✔ MySQL Database Integration  
✔ Maven Build Tool  

---

## 🏗️ Project Structure
sales-savvy/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── salessavvy/
│   │   │           └── sales_savvy/
│   │   │               ├── ApiTester.java
│   │   │               └── SalesSavvyApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── salessavvy/
│                   └── sales_savvy/
│
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

---

## ⚙️ How to Run Project

### 1️⃣ Clone Repository
git clone https://github.com/Suman1-panda/sales-savvy.git
cd sales-savvy

---

### 2️⃣ Configure Database

File:
src/main/resources/application.properties

Add:
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/sales_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

### 3️⃣ Build Project
mvn clean install

---

### 4️⃣ Run Project
mvn spring-boot:run

OR run directly:
SalesSavvyApplication.java

---

### 5️⃣ Open Browser
http://localhost:8081

---

## 🧠 Main Classes

SalesSavvyApplication.java → Main Spring Boot Application  
ApiTester.java → Used for API testing and debugging  

---

## 📚 Technologies Used

Java 17+  
Spring Boot  
Spring Data JPA  
MySQL  
Maven  

---

## 🚀 Future Improvements

✔ Add Controller Layer  
✔ Add Service Layer  
✔ Add Repository Layer  
✔ Complete CRUD APIs  
✔ Add Swagger Documentation  
✔ Add JWT Authentication  
✔ Deploy on Cloud (AWS / Render)  

---

## 🎯 Learning Outcomes

✔ Spring Boot Development  
✔ REST API Design  
✔ Maven Project Structure  
✔ MySQL Integration  
✔ Backend Development Skills  

---

## 👤 Author

Suman Panda  
💻 Java Full Stack Developer (Fresher)  
📍 India
