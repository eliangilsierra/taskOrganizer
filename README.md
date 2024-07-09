# Task Organizer

Task Organizer is a web application built with Angular and Spring Boot, designed to manage tasks efficiently. It provides functionalities such as task creation, updating, prioritization, reminders, and user authentication.

## Features

- **CRUD Operations:** Create, Read, Update, and Delete tasks.
- **User Authentication:** Secure access with user login and authentication mechanisms.
- **Task Prioritization:** Assign priority levels to tasks for better management.
- **Reminders:** Set reminders for tasks to stay organized.

## Technologies Used

### Frontend

- Angular
- TypeScript
- HTML/CSS

### Backend

- Spring Boot
- Java

### Database

- MySQL

## Installation

Follow these steps to get Task Organizer running locally:

1. **Clone Repository:**


2. **Backend Setup:**

- Navigate to `taskorganizer-backend` directory.
- Configure `application.properties` with your database settings.
- Build and run the Spring Boot application.

  ```bash
  cd taskorganizer-backend
  # Edit application.properties
  mvn spring-boot:run
  ```

3. **Frontend Setup:**

- Navigate to `taskorganizer-frontend` directory.
- Install dependencies and start the Angular application.

  ```bash
  cd ../taskorganizer-frontend
  npm install
  npm start
  ```

4. **Access the Application:**

Open your web browser and go to `http://localhost:4200` to view Task Organizer.

## Contributing

Contributions are welcome! If you have suggestions or found a bug, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.
