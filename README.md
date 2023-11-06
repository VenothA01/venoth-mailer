# venoth-Mailer

Brief description of your project.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Testing](#testing)
- [Deployment](#deployment)
- [Built With](#built-with)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Prerequisites

- Java Development Kit (JDK) - [Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Apache Maven - [Download](https://maven.apache.org/download.cgi)
- Your preferred IDE (e.g., IntelliJ, Eclipse, Visual Studio Code)

## Getting Started

These instructions will help you set up and run the project on your local machine.

### Installation

Clone the repository to your local machine:

```sh
git clone https://github.com/your-username/your-project.git
```

Build the application

```
mvn clean install
```

Start the application

```aidl
mvn spring-boot:run
```

Endpoints
Document the API endpoints and their functionalities.

POST /email: Description of the endpoint is given below

```aidl

curl -X 'POST' \
'http://localhost:8100/email' \
-H 'accept: application/json' \
-H 'Content-Type: application/json' \
-d '{
"subject": "Test Email",
"text": "Test Message",
"to": "venothanand29@gmail.com"
}'

```

Testing

```aidl
mvn test
```

## Deployment
Additional notes about how to deploy this on a live system will go here.

## Built With

Spring Boot - The web framework used
Maven - Dependency Management



