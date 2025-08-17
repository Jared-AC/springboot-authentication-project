# Spring Boot Authentication Project

Proyecto de **autenticación de usuarios** con **Spring Boot**, **MySQL** y **Thymeleaf**.  
Permite a los usuarios **registrarse e iniciar sesión** desde una interfaz sencilla y conectada a una base de datos.

---

## 🚀 Tecnologías utilizadas
- **Java 17**
- **Spring Boot 3.3.4**
  - Spring Web
  - Spring Data JPA
  - Spring Security (configurado manualmente)
- **MySQL** (conector `mysql-connector-j`)
- **Thymeleaf** (frontend)
- **Lombok** (para reducir boilerplate en entidades)
- **Maven** (gestión de dependencias)

---

## ⚙️ Requisitos previos
- Tener instalado **Java 17** o superior
- Tener instalado **Maven**
- Tener corriendo un servidor **MySQL**
- Tener configurada una base de datos (ejemplo: `authdb`)

---

## 📂 Configuración
En el archivo `src/main/resources/application.properties` configura tu conexión a la base de datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/authdb
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
