# toppan

This is a CRUD web application that uses React for the frontend, Spring Boot for the backend, and PostgreSQL for the database. The application is containerized using Docker for easy setup and deployment.

## Prerequisites

- Docker (https://www.docker.com/products/docker-desktop)
- Docker Compose (included in Docker Desktop for Windows and macOS, separate installation required for Linux)

## Getting Started

To set up and run the application locally, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/wkkang-t/toppan.git
cd your-repo

2. Build the Docker images:
docker-compose build

3. Start the containers:
docker-compose up

4. Wait for the containers to start and the application to be ready. The frontend will be available at `http://localhost:3000`, and the backend API will be available at `http://localhost:8080`.

5. To stop the containers and remove them:
docker-compose down

Application Structure
The application is split into three main parts:

1frontend1: Contains the React application source code.
1backend1: Contains the Spring Boot application source code.
Each part is containerized using Docker, and the containers are managed using Docker Compose.

Frontend
The frontend is built using React and TypeScript. The source code is located in the `frontend` directory. To start the development server, navigate to the `frontend` directory and run:
npm start

Backend
The backend is built using Spring Boot and Java. The source code is located in the `backend` directory. To start the development server, navigate to the `backend` directory and run:
./mvnw spring-boot:run

Contributing
To contribute to this project, create a new branch, make your changes, and submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

This README.md file provides a brief introduction to the project and explains how to set up and run the application locally using Docker. You can further customize the content to fit your specific requirements and project structure.
