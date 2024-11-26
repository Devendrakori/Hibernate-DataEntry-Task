# Hibernate-DataEntry-Task

## Description

This project demonstrates how to use **Hibernate ORM** for managing entities and performing data entry operations. The project contains a multi-layered architecture with five key packages: `entity`, `dao`, `service`, `controller`, and `client`. It handles the insertion of `Person`, `Address`, and `VoterCard` entities, ensuring proper validation such as duplicate checks for `voterid` during data entry.

## Features

- **Bidirectional relationships** between `Person` and `Address`.
- **Voter ID Duplicate Check**: Ensures unique `voterid` when inserting a `Person`.
- **Hibernate-based Data Management**: Handles database operations (CRUD) with Hibernate.
- **Multi-layered architecture**: Separated into different layers for better modularity and maintainability.

## Technologies Used

- Java 8+
- Hibernate ORM 5.x
- MySQL (or any relational database)
- Maven for dependency management

## Project Structure
```bash
hibernate-dataentry-task/
│
├── src/                           
│   └── main/                       
│       └── java/                   
│           └── com/                
│               └── java/           
│                   ├── client/        
│                   ├── controller/    
│                   ├── dao/           
│                   ├── entity/       
│                   ├── service/       
│                   └── utility/       
├── src/main/resources/                     
│                └── hibernate.cfg.xml       
├── src/test/java/com/java/                                                  
├── src//test/java/com/resources/                           
├── target/                         
└── pom.xml        
```
### Key Packages and Classes

- **`entity/`**: Contains the entity classes representing the database tables.
  - `Person.java`: Entity class for the `Person` table.
  - `Address.java`: Entity class for the `Address` table.
  - `VoterCard.java`: Entity class for the `VoterCard` table.

- **`dao/`**: Contains Data Access Object (DAO) classes to interact with the database.
  - `PersonDAO.java`: Handles database operations for the `Person` entity.
  - `AddressDAO.java`: Handles database operations for the `Address` entity.
  - `VoterCardDAO.java`: Handles database operations for the `VoterCard` entity.

- **`service/`**: Contains service classes that handle business logic.
  - `PersonService.java`: Contains logic for processing `Person` entities.
  - `VoterCardService.java`: Contains logic for processing `VoterCard` entities.

- **`controller/`**: Contains controller classes that handle user input and communicate with the service layer.
  - `PersonController.java`: Handles operations related to `Person` entities.

- **`client/`**: Client classes for interacting with the system.
  - `MainClient.java`: Entry point for the application to perform CRUD operations.

- **`utility/`**: Contains utility classes for common functionality.
  - `HibernateUtil.java`: Manages Hibernate sessions and configuration.

## Installation and Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/yourusername/hibernate-dataentry-task.git
cd hibernate-dataentry-task
## Step 2: Configure Database Connection

Update the `hibernate.cfg.xml` file located in `src/main/resources` with your database connection details. 

### Example `hibernate.cfg.xml` Configuration:

```xml
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <!-- JDBC Database connection settings -->
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:port/your_database</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">password</property>

        <!-- Enable Hibernate's automatic session context management -->
        <property name="hibernate.current_session_context_class">thread</property>

        <!-- Echo all executed SQL to stdout -->
        <property name="hibernate.show_sql">true</property>

        <!-- Drop and re-create the database schema on startup -->
        <property name="hibernate.hbm2ddl.auto">update</property>

        <!-- Mention annotated class -->
        <mapping class="com.java.entity.Person"/>
        <mapping class="com.java.entity.Address"/>
        <mapping class="com.java.entity.VoterCard"/>
    </session-factory>
</hibernate-configuration>
 ```

### Step 4: Build and Run the Project

To build and run the project, use Maven. Follow the steps below:

### Prerequisites:

Ensure that you have Maven installed on your machine. If not, follow these steps to install Maven:
- Download Maven from the official website: [Apache Maven Download](https://maven.apache.org/download.cgi).
- Extract the files and set the `MAVEN_HOME` environment variable to point to the extracted folder.
- Add the `bin` directory to your `PATH`.

You can verify the installation by running the following command in your terminal:

```bash
mvn -v
```
## Contact Information

For further questions or support, feel free to reach out:

- **Email**: [Devendraofficial841.com](Devendraofficial841.com)
- **GitHub**: [[https://github.com/Devendrakori](https://github.com/Devendrakori)
- **LinkedIn**: [[https://linkedin.com/in/Devendra-kori](https://linkedin.com/in/Devendra-kori)






