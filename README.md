# Student CRUD Application

This is a simple Java web application that demonstrates CRUD (Create, Read, Update, Delete) operations for managing student records. The project follows the MVC (Model-View-Controller) design pattern and uses JDBC (Java Database Connectivity) to interact with the database.

## Features

- Add new students
- View the list of students
- Update student details
- Delete student records

## Technologies Used

- **Programming Language:** Java
- **Framework:** Servlet and JSP
- **Database:** MySQL (or any other JDBC-supported database)
- **Design Pattern:** MVC

## Prerequisites

Before running the project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Tomcat (or any other Java EE-compliant server)
- MySQL database (or equivalent JDBC-compatible database)
- IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans)

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/student-crud-app.git
   cd student-crud-app
   ```

2. **Database Configuration**
   - Create a database named `studentdb`.
   - Run the following SQL script to create the `students` table:
     ```sql
     CREATE TABLE students (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(100) NOT NULL,
         age INT NOT NULL,
         address VARCHAR(255) NOT NULL
     );
     ```
   - Update the database connection details in `db.properties` (or directly in your DAO class):
     ```properties
     db.url=jdbc:mysql://localhost:3306/studentdb
     db.username=your-username
     db.password=your-password
     ```

3. **Build and Deploy**
   - Import the project into your IDE.
   - Add the MySQL JDBC driver to the project classpath.
   - Build the project and deploy it to your Tomcat server.

4. **Run the Application**
   - Start the Tomcat server.
   - Open your browser and navigate to: `http://localhost:8080/KDBCMVCApp`

## Folder Structure

```
student-crud-app/
|-- src/
|   |-- model/         # Contains data models (e.g., Student class)
|   |-- dao/           # Contains database access classes
|   |-- controller/    # Contains servlet controllers
|-- web/
|   |-- WEB-INF/
|       |-- web.xml    # Deployment descriptor
|   |-- views/         # Contains JSP files for the UI
|-- db.properties      # Database configuration file
|-- README.md          # Project documentation
```

## Future Enhancements

- Add input validation and error handling.
- Add pagination for the student list.
- Secure the application using authentication and authorization.

## Contributions

Contributions are welcome! Please fork this repository and submit a pull request with your changes.

## Contact

For any queries or feedback, feel free to contact me at [balajichilveri1000@gmail.com].

