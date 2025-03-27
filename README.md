<p align="center">
    <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">API-TESTING-WIREMOCK-PRACTICE</h1></p>
<p align="center">
	<em><code>❯ WEB SERVICE TESTING USING SPRING-BOOT, WIREMOCK AND REST-ASSURED</code></em>
</p>
<p align="center">
	<!-- local repository, no metadata badges. --></p>
<p align="center">Built with the tools and technologies:</p>
<p align="center">
	<img src="https://img.shields.io/badge/JUnit5-25A162.svg?style=default&logo=JUnit5&logoColor=white" alt="JUnit5">
	<img src="https://img.shields.io/badge/Org-77AA99.svg?style=default&logo=Org&logoColor=white" alt="Org">
	<img src="https://img.shields.io/badge/Gradle-02303A.svg?style=default&logo=Gradle&logoColor=white" alt="Gradle">
	<img src="https://img.shields.io/badge/Docker-2496ED.svg?style=default&logo=Docker&logoColor=white" alt="Docker">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=default&logo=openjdk&logoColor=white" alt="java">
</p>
<br>

##  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Project Structure](#-project-structure)
- [ Getting Started](#-getting-started)
  - [ Prerequisites](#-prerequisites)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Testing](#-testing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)

---

##  Overview

This project tests a **Spring Boot REST service** handling **Credit Requests** that depends on an unimplemented Credit Score service. It uses **WireMock to stub the Credit Score service** for testing the Credit Request service in isolation.

**Docker Compose** is used to run the Spring Boot service and the WireMock stubbing server in separate containers. **RestAssured** is used to send test requests to the Credit Request service.

---

##  Features

- **WireMock** for stubbing the Credit Score service.
- **Spring Boot** for the Credit Request service.
- **Docker Compose** for containerized service setup.
- **RestAssured** for API testing.

---

##  Project Structure

```sh
└── credit-score-wiremock-practice/
    ├── build.gradle
    ├── docker-compose.yml
    ├── request-credit-service
    │   ├── Dockerfile
    │   ├── build.gradle
    │   └── src
    ├── settings.gradle
    └── src
        ├── main
        └── test
            ├── config
            ├── rest_client
            └── tests
            └── wiremock
                └── __files
                └── mappings
```



---
##  Getting Started

###  Prerequisites

Before getting started with credit-score-wiremock-practice, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java
- **Package Manager:** Gradle
- **Container Runtime:** Docker


###  Installation

Install credit-score-wiremock-practice using one of the following methods:

**Build from source:**

1. Clone the credit-score-wiremock-practice repository:
```sh
❯ git clone https://github.com/Cezara910/mock-api-testing-with-springboot.git
```

2. Navigate to the project directory:
```sh
❯ cd credit-score-wiremock-practice
```

###  Usage
Run credit-score-wiremock-practice using the following command:

- Start containers and run tests **Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Gradle-02303A.svg?style={badge_style}&logo=gradle&logoColor=white" />](https://gradle.org/)

```sh
❯ gradle clean build
```

- Stop containers after running tests
```sh
❯ gradle composeDown
```

###  Testing
Run the test suite using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Gradle-02303A.svg?style={badge_style}&logo=gradle&logoColor=white" />](https://gradle.org/)

```sh
❯ gradle test
```

##  License

This project is protected under the [SELECT-A-LICENSE](https://choosealicense.com/licenses) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

##  Acknowledgments


---
