# swift-courier is Spring Boot MongoDB Example

This is a simple Spring Boot application that demonstrates how to use MongoDB as the database. The application performs basic CRUD operations on a `Customer` entity.

## Prerequisites

- Java 17 or later
- Maven 3.6.3 or later
- MongoDB 4.0 or later

## Getting Started

### Clone the Repository

git clone https://github.com/asrafshaikh/swift-courier.git
cd swift-courier

Setup MongoDB
Make sure MongoDB is installed and running on your machine. By default, MongoDB runs on port 27017.

Configure Application Properties
The application is configured to connect to a MongoDB instance running on localhost at the default port 27017. You can change the MongoDB connection settings in the src/main/resources/application.properties file.

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=test

### Build and Run the Application

Build the project: mvn clean install

Run the application: mvn spring-boot:run



