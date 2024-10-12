<p align="center">
    <h1 align="center">CURRENCY-CONVERSION-APP</h1>
</p>

<p align="center">
	<img src="https://img.shields.io/github/last-commit/kchaudhari0/Currency-conversion-app?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/kchaudhari0/Currency-conversion-app?style=flat&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/kchaudhari0/Currency-conversion-app?style=flat&color=0080ff" alt="repo-language-count">
</p>
<p align="center">
		<em>Built with the tools and technologies:</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
    <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff" alt="Spring Boot">
    <img src="https://img.shields.io/badge/H2-SQL-Blue?style=flat" alt="H2 SQL Database">
    <img src="https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=fff" alt="Docker">
    <img src="https://img.shields.io/badge/YAML-CB171E.svg?style=flat&logo=YAML&logoColor=white" alt="YAML">
    <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white" alt="IntelliJIDEA">
</p>

<br>

#####  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
    - [ Prerequisites](#-prerequisites)
    - [ Installation](#-installation)
    - [ Usage](#-usage)
    - [ Tests](#-tests)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
---

##  Overview

`❯ Currency Conversion App built using Microservices`

This application provides a service for converting between different currencies. It leverages a microservices architecture, with separate services for currency exchange rates and currency conversion calculations.

---

##  Features
- **Currency Conversion:** Convert an amount from one currency to another using real-time exchange rates.
- **Microservices Architecture:**  The application is divided into independent, loosely coupled services for better maintainability and scalability.
- **API Gateway:** Provides a single entry point for all clients to access the microservices.
- **Service Discovery (Eureka):** Services register themselves with a Eureka server, allowing for dynamic service discovery and load balancing.
- **Resilience (Circuit Breaker):**  Implements circuit breaker patterns to handle failures gracefully and prevent cascading failures.

---

##  Repository Structure

```sh
└── Currency-conversion-app/
    ├── api-gateway
    │   ├── .gitignore
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    │       ├── main
    │       └── test
    ├── currency-conversion-service
    │   ├── .gitignore
    │   ├── currency_conversion_service-openapi.yaml
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    │       ├── main
    │       └── test
    ├── currency-exchange-service
    │   ├── .gitignore
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    │       ├── main
    │       └── test
    ├── docker-compose.yml
    └── naming-server
        ├── pom.xml
        ├── src
        │   ├── main
        │   └── test
        └── target
            └── classes
```

---

##  Modules

- **naming-server:** This module acts as the Eureka server for service discovery.
- **currency-exchange-service:** This service manages currency exchange rates. It exposes an API to retrieve the exchange rate for a given currency pair.
- **currency-conversion-service:** This service performs the actual currency conversion. It fetches the exchange rate from the `currency-exchange-service` and calculates the converted amount.
- **api-gateway:** This module acts as an API gateway, routing requests to the appropriate microservices.

##  Getting Started

###  Prerequisites

- **Java:** Version 17 or higher.
- **Maven:** For building and managing dependencies.
- **Docker (Optional):** For running the application in a containerized environment.
###  Installation

Build the project from source:

1. Clone the Currency-conversion-app repository:
```sh
❯ git clone https://github.com/kchaudhari0/Currency-conversion-app
```

2. Navigate to the project directory:
```sh
❯ cd Currency-conversion-app
```

3. Install the required dependencies:
```sh
❯ mvn clean install
```

###  Usage

To run the project, execute the following command:

```sh
❯ Run the project using Docker compose file: docker-compose up

 This command will build and start all the services defined in the `docker-compose.yml` file.
```
#### Running Locally (Without Docker)

1. **Start the Naming Server:**
    - Navigate to the `naming-server` directory.
    - Run `mvn spring-boot:run`

2. **Start the Currency Exchange Service:**
    - Navigate to the `currency-exchange-service` directory.
    - Run `mvn spring-boot:run`

3. **Start the Currency Conversion Service:**
    - Navigate to the `currency-conversion-service` directory.
    - Run `mvn spring-boot:run`

4. **Start the API Gateway:**
    - Navigate to the `api-gateway` directory.
    - Run `mvn spring-boot:run`
###  Tests

Execute the test suite using the following command:

```sh
❯ mvn test
```
##  Project Roadmap

- **[Optional] Implement API versioning.**
- **[Optional] Add security features like authentication and authorization.**
- **[Optional] Implement a distributed tracing system for better monitoring and debugging.**

---

##  Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Report Issues](https://github.com/kchaudhari0/Currency-conversion-app/issues)**: Submit bugs found or log feature requests for the `Currency-conversion-app` project.
- **[Submit Pull Requests](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/kchaudhari0/Currency-conversion-app/discussions)**: Share your insights, provide feedback, or ask questions.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/kchaudhari0/Currency-conversion-app
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/kchaudhari0/Currency-conversion-app/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=kchaudhari0/Currency-conversion-app">
   </a>
</p>
</details>

---

