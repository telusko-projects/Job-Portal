# Job Portal Project

This project is a job portal application built using Spring Boot, MongoDB, and React, deployed on Amazon Elastic BeanStalk(AWS) under the Telusko Projects.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
  - [Backend (Spring Boot, MongoDB)](#backend)
  - [Frontend (React)](#frontend)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Job Portal Project is a full-stack web application that allows users to browse and apply for job opportunities. The backend is developed using Spring Boot with MongoDB as the database, and the frontend is built using React. The project also includes a RESTful API to facilitate communication between the frontend and backend.

## Features

- User authentication and authorization
- Job listing and search functionality
- User profile management
- Application tracking for job seekers
- Admin dashboard for job providers
- RESTful API for seamless communication

## Prerequisites

Before you begin, ensure you have the following installed:

- [Java Development Kit (JDK-17(mimimum))](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Node.js](https://nodejs.org/)
- [MongoDB](https://www.mongodb.com/try/download/community)
- [Amazon-Web-Services]
- [Git](https://git-scm.com/)

## Setup

### Backend

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/job-portal-backend.git
    ```

2. Navigate to the backend directory:

    ```bash
    cd job-portal-backend
    ```

3. Build and run the Spring Boot application:

    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend

1. Clone the repository:

    ```bash
    git clone https://github.com/telusko-projects/Job-Portal.git
    ```

2. Navigate to the frontend directory:

    ```bash
    cd job-portal-frontend
    ```

3. Install dependencies and start the React application:

    ```bash
    npm install
    npm start
    ```

## Deployment

1. Build the frontend for production:

    ```bash
    npm run build
    ```

2. Deploy the generated build to the AWS.

## Contributing

Contributions are welcome! Please follow the [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [Telusko](LICENSE).
