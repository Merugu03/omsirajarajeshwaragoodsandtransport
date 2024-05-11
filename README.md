# Invoicing System

This is a Spring Boot application for managing invoices. It allows users to generate invoices, view them as PDFs, and manage their invoicing process efficiently.

## Features

- **Invoice Generation**: Generate invoices dynamically based on user input.
- **PDF Generation**: Convert invoices into downloadable PDF files for easy sharing and printing.
- **Invoice Management**: View and manage all generated invoices within the application.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven or Gradle (for dependency management)
- MySQL or Oracle Database (for storing invoice data)

## Installation

1. Clone the repository to your local machine:

    ```bash
    https://github.com/Merugu03/omsirajarajeshwaragoodsandtransport.git
    ```

2. Navigate to the project directory:

    ```bash
    cd omsirajarajeshwaragoodsandtransport
    ```

3. Set up the database:
   
   - **MySQL**: Create a database named `om_srr_invoice`.
   - **Oracle**: Create a database with appropriate configurations.

4. Update `application.properties` with your database credentials:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/<db_name>
    spring.datasource.username= <mysql user name >
    spring.datasource.password= <password >
    ```

5. Run the application:

    ```bash
    # If using Maven
    mvn spring-boot:run

    # If using Gradle
    gradle bootRun
    ```

6. Access the application at `http://localhost:8080`.

## Usage

1. Generate Invoice: Navigate to the invoice generation page and fill in the required details. Click "Generate" to create the invoice.
2. View Invoices: Access the invoices page to view all generated invoices. Click on an invoice to view it as a PDF or download it.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for any improvements or bug fixes.

## License

This project is licensed under the [MIT License](LICENSE).
