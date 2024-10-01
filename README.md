<p align="center">
  <img src="https://img.icons8.com/?size=512&id=55494&format=png" width="20%" alt="CURRENCY-CONVERSION-APP-logo">
</p>
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
	<img src="https://img.shields.io/badge/YAML-CB171E.svg?style=flat&logo=YAML&logoColor=white" alt="YAML">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
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
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)

---

##  Overview

<code>❯ REPLACE-ME</code>

---

##  Features


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

<details closed><summary>.</summary>

| File | Summary |
| --- | --- |
| [docker-compose.yml](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/docker-compose.yml) | <code>❯ REPLACE-ME</code> |

</details>

<details closed><summary>api-gateway</summary>

| File | Summary |
| --- | --- |
| [mvnw.cmd](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/api-gateway/mvnw.cmd) | <code>❯ REPLACE-ME</code> |
| [mvnw](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/api-gateway/mvnw) | <code>❯ REPLACE-ME</code> |

</details>

<details closed><summary>api-gateway.src.main.java.com.project.microservice.api_gateway</summary>

| File | Summary |
| --- | --- |
| [ApiGatewayApplication.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/api-gateway/src/main/java/com/project/microservice/api_gateway/ApiGatewayApplication.java) |

</details>

<details closed><summary>api-gateway.src.main.java.com.project.microservice.api_gateway.Configuration</summary>

| File | Summary |
| --- | --- |
| [ApiGatewayConfiguration.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/api-gateway/src/main/java/com/project/microservice/api_gateway/Configuration/ApiGatewayConfiguration.java)  |

</details>

<details closed><summary>api-gateway.src.main.java.com.project.microservice.api_gateway.Logging</summary>

| File | Summary |
| --- | --- |
| [LogFilter.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/api-gateway/src/main/java/com/project/microservice/api_gateway/Logging/LogFilter.java)  |

</details>

<details closed><summary>api-gateway.src.test.java.com.project.microservice.api_gateway</summary>

| File | Summary |
| --- | --- |
| [ApiGatewayApplicationTests.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/api-gateway/src/test/java/com/project/microservice/api_gateway/ApiGatewayApplicationTests.java) |

</details>

<details closed><summary>naming-server.src.main.java.com.project.microservice.naming_server</summary>

| File | Summary |
| --- | --- |
| [NamingServerApplication.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/naming-server/src/main/java/com/project/microservice/naming_server/NamingServerApplication.java) |

</details>

<details closed><summary>naming-server.src.test.java.com.project.microservice.naming_server</summary>

| File | Summary |
| --- | --- |
| [NamingServerApplicationTests.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/naming-server/src/test/java/com/project/microservice/naming_server/NamingServerApplicationTests.java)  |

</details>

<details closed><summary>currency-exchange-service</summary>

| File | Summary |
| --- | --- |
| [mvnw.cmd](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/mvnw.cmd) |
| [mvnw](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/mvnw)  |

</details>

<details closed><summary>currency-exchange-service.src.main.resources</summary>

| File | Summary |
| --- | --- |
| [data.sql](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/main/resources/data.sql) |

</details>

<details closed><summary>currency-exchange-service.src.main.java.com.project.microservices.currency_exchange_service</summary>

| File | Summary |
| --- | --- |
| [CurrencyExchangeServiceApplication.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/main/java/com/project/microservices/currency_exchange_service/CurrencyExchangeServiceApplication.java)|

</details>

<details closed><summary>currency-exchange-service.src.main.java.com.project.microservices.currency_exchange_service.Repository</summary>

| File | Summary |
| --- | --- |
| [CurrencyExchangeRespository.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/main/java/com/project/microservices/currency_exchange_service/Repository/CurrencyExchangeRespository.java) |

</details>

<details closed><summary>currency-exchange-service.src.main.java.com.project.microservices.currency_exchange_service.Controller</summary>

| File | Summary |
| --- | --- |
| [CurrencyExchangeController.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/main/java/com/project/microservices/currency_exchange_service/Controller/CurrencyExchangeController.java)  |
| [CircuitBreakerController.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/main/java/com/project/microservices/currency_exchange_service/Controller/CircuitBreakerController.java) |

</details>

<details closed><summary>currency-exchange-service.src.main.java.com.project.microservices.currency_exchange_service.Beans</summary>

| File | Summary |
| --- | --- |
| [CurrencyExchange.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/main/java/com/project/microservices/currency_exchange_service/Beans/CurrencyExchange.java) |

</details>

<details closed><summary>currency-exchange-service.src.test.java.com.project.microservices.currency_exchange_service</summary>

| File | Summary |
| --- | --- |
| [CurrencyExchangeServiceApplicationTests.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-exchange-service/src/test/java/com/project/microservices/currency_exchange_service/CurrencyExchangeServiceApplicationTests.java) |

</details>

<details closed><summary>currency-conversion-service</summary>

| File | Summary |
| --- | --- |
| [mvnw.cmd](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/mvnw.cmd) |
| [currency_conversion_service-openapi.yaml](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/currency_conversion_service-openapi.yaml) |
| [mvnw](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/mvnw)  |

</details>

<details closed><summary>currency-conversion-service.src.main.java.com.project.microservices.currency_conversion_service</summary>

| File | Summary |
| --- | --- |
| [CurrencyConversionServiceApplication.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/src/main/java/com/project/microservices/currency_conversion_service/CurrencyConversionServiceApplication.java)  |

</details>

<details closed><summary>currency-conversion-service.src.main.java.com.project.microservices.currency_conversion_service.Controller</summary>

| File | Summary |
| --- | --- |
| [CurrencyConversionController.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/src/main/java/com/project/microservices/currency_conversion_service/Controller/CurrencyConversionController.java)  |

</details>

<details closed><summary>currency-conversion-service.src.main.java.com.project.microservices.currency_conversion_service.Proxy</summary>

| File | Summary |
| --- | --- |
| [CurrencyExchangeProxy.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/src/main/java/com/project/microservices/currency_conversion_service/Proxy/CurrencyExchangeProxy.java)  |

</details>

<details closed><summary>currency-conversion-service.src.main.java.com.project.microservices.currency_conversion_service.Beans</summary>

| File | Summary |
| --- | --- |
| [CurrencyConversion.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/src/main/java/com/project/microservices/currency_conversion_service/Beans/CurrencyConversion.java)  |

</details>

<details closed><summary>currency-conversion-service.src.test.java.com.project.microservices.currency_conversion_service</summary>

| File | Summary |
| --- | --- |
| [CurrencyConversionServiceApplicationTests.java](https://github.com/kchaudhari0/Currency-conversion-app/blob/main/currency-conversion-service/src/test/java/com/project/microservices/currency_conversion_service/CurrencyConversionServiceApplicationTests.java) |

</details>

---

##  Getting Started

###  Prerequisites

**Java**: `version x.y.z`

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
❯ java -jar target/myapp.jar
```

###  Tests

Execute the test suite using the following command:

```sh
❯ mvn test
```

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


##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

---
