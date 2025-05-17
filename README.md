# 🎓 StudentDB - Spring Boot CRUD Application

A simple Spring Boot web application to manage student information using CRUD operations.  
Built for learning and practicing Spring Boot basics. 🚀

## ✨ Features

- ➕ Add new student  
- 📋 View list of students  
- ✏️ Update student details  
- ❌ Delete student  
- 🌐 HTML front-end with basic styling and JavaScript interaction

## 🛠️ Tech Stack

- ☕ Java  
- 🧰 Spring Boot  
- 💾 Spring Data JPA  
- 🎨 Thymeleaf (HTML templates)  
- 🐬 MySQL 🛢️ 

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/studentdb/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── StudentDbApplication.java
│   └── resources/
│       ├── templates/
│       │   ├── index.html
│       │   ├── add-student.html
│       │   └── update-student.html
│       └── application.properties
```

## ▶️ How to Run

1. 📥 Clone the repository  
2. 🧑‍💻 Open in your IDE (NetBeans / IntelliJ / Eclipse)  
3. ⚙️ Configure your database in `application.properties`  
4. 🔥 Run the application

```bash
./mvnw spring-boot:run
```

🖥️ Visit: `http://localhost:8080`

## 🗃️ Example DB Config (MySQL)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

## 📄 License

This project is for educational purposes only.  
Made with ❤️ for learning Spring Boot.
