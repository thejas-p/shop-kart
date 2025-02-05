# **E-Commerce Backend Project**
 
This is a basic e-commerce backend project built using **Spring Boot**. It provides APIs for managing products, users, and orders.
 
---
 
## **Features**
- **Product Management**:
  - Add, retrieve, and manage products.
- **User Management**:
  - Register and retrieve users.
- **Order Management**:
  - Create and manage orders.
- **Global Exception Handling**:
  - Consistent error responses for all exceptions.
- **Database Integration**:
  - Uses **MySQL database** for development
 
---
 
## **Technologies Used**
- **Spring Boot** - Backend framework.
- **Spring Data JPA** - For database operations.
- **MySQL database** - database for development.
- **Lombok** - For reducing boilerplate code.
- **Postman** - For API testing.
- **Maven** - Build tool.
 
---
 
## **API Endpoints**
 
### **1. Product Management**
| **Endpoint**          | **Method** | **Description**                          |
|-----------------------|------------|------------------------------------------|
| `/products`           | `GET`      | Get all products.                        |
| `/products/{id}`      | `GET`      | Get a product by ID.                     |
| `/products`           | `POST`     | Add a new product.                       |
 
### **2. User Management**
| **Endpoint**          | **Method** | **Description**                          |
|-----------------------|------------|------------------------------------------|
| `/users`              | `POST`     | Register a new user.                     |
| `/users/{id}`         | `GET`      | Get a user by ID.                        |
 
### **3. Order Management**
| **Endpoint**          | **Method** | **Description**                          |
|-----------------------|------------|------------------------------------------|
| `/orders`             | `POST`     | Create a new order.                      |
 
---
 
## **Setup and Run the Project**
 
### **Prerequisites**
- Java 17 or higher.
- Maven 3.x.
- IDE (e.g., IntelliJ IDEA, Eclipse).
 
### **Steps**
1. **Clone the Repository**:
   ```bash
git clone https://github.com/your-username/ecommerce-backend.git
   cd ecommerce-backend
   ```
 
2. **Build the Project**:
   ```bash
   mvn clean install
   ```
 
3. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
 
4. **Access the Application**:
- The application will run on `http://localhost:8080`.
 
