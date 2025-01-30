<p align="center">
    <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">API-TESTING-WIREMOCK-PRACTICE</h1></p>
<p align="center">
	<em><code>❯ REPLACE-ME</code></em>
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
  - [ Project Index](#-project-index)
- [ Getting Started](#-getting-started)
  - [ Prerequisites](#-prerequisites)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Testing](#-testing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)

---

##  Overview

This project tests a **Spring Boot REST service** handling **Credit Requests** that depends on an unimplemented Credit Score service. We use **WireMock to stub the Credit Score service** for testing the Credit Request service in isolation.

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
```


###  Project Index
<details open>
	<summary><b><code>CREDIT-SCORE-WIREMOCK-PRACTICE/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build.gradle'>build.gradle</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/docker-compose.yml'>docker-compose.yml</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/settings.gradle'>settings.gradle</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- request-credit-service Submodule -->
		<summary><b>request-credit-service</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/Dockerfile'>Dockerfile</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/build.gradle'>build.gradle</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>build</b></summary>
				<blockquote>
					<details>
						<summary><b>tmp</b></summary>
						<blockquote>
							<details>
								<summary><b>bootJar</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/build/tmp/bootJar/MANIFEST.MF'>MANIFEST.MF</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>compileJava</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/build/tmp/compileJava/previous-compilation-data.bin'>previous-compilation-data.bin</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>org</b></summary>
										<blockquote>
											<details>
												<summary><b>example</b></summary>
												<blockquote>
													<table>
													<tr>
														<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/RequestCreditService.java'>RequestCreditService.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													</table>
													<details>
														<summary><b>config</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/config/AppConfig.java'>AppConfig.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>controller</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/controller/CreditRequestController.java'>CreditRequestController.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>model</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/model/CreditResponse.java'>CreditResponse.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/model/CreditResponseBuilder.java'>CreditResponseBuilder.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/model/CreditRequest.java'>CreditRequest.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/model/CreditScoreResponse.java'>CreditScoreResponse.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>service</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/request-credit-service/src/main/java/org/example/service/CreditService.java'>CreditService.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- build Submodule -->
		<summary><b>build</b></summary>
		<blockquote>
			<details>
				<summary><b>resources</b></summary>
				<blockquote>
					<details>
						<summary><b>test</b></summary>
						<blockquote>
							<details>
								<summary><b>wiremock</b></summary>
								<blockquote>
									<details>
										<summary><b>__files</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/resources/test/wiremock/__files/credit_score_response_sufficient.json'>credit_score_response_sufficient.json</a></b></td>
												<td><code>❯ REPLACE-ME</code></td>
											</tr>
											<tr>
												<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/resources/test/wiremock/__files/credit_score_response_insufficient.json'>credit_score_response_insufficient.json</a></b></td>
												<td><code>❯ REPLACE-ME</code></td>
											</tr>
											</table>
										</blockquote>
									</details>
									<details>
										<summary><b>mappings</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/resources/test/wiremock/mappings/credit_score_service_stub.json'>credit_score_service_stub.json</a></b></td>
												<td><code>❯ REPLACE-ME</code></td>
											</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>test-results</b></summary>
				<blockquote>
					<details>
						<summary><b>test</b></summary>
						<blockquote>
							<details>
								<summary><b>binary</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/test-results/test/binary/results.bin'>results.bin</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/test-results/test/binary/output.bin.idx'>output.bin.idx</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/test-results/test/binary/output.bin'>output.bin</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>tmp</b></summary>
				<blockquote>
					<details>
						<summary><b>compileTestJava</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/build/tmp/compileTestJava/previous-compilation-data.bin'>previous-compilation-data.bin</a></b></td>
								<td><code>❯ REPLACE-ME</code></td>
							</tr>
							</table>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<details>
						<summary><b>resources</b></summary>
						<blockquote>
							<details>
								<summary><b>wiremock</b></summary>
								<blockquote>
									<details>
										<summary><b>__files</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/src/test/resources/wiremock/__files/credit_score_response_sufficient.json'>credit_score_response_sufficient.json</a></b></td>
												<td><code>❯ REPLACE-ME</code></td>
											</tr>
											<tr>
												<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/src/test/resources/wiremock/__files/credit_score_response_insufficient.json'>credit_score_response_insufficient.json</a></b></td>
												<td><code>❯ REPLACE-ME</code></td>
											</tr>
											</table>
										</blockquote>
									</details>
									<details>
										<summary><b>mappings</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/src/test/resources/wiremock/mappings/credit_score_service_stub.json'>credit_score_service_stub.json</a></b></td>
												<td><code>❯ REPLACE-ME</code></td>
											</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>config</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/src/test/java/config/Configuration.java'>Configuration.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/src/test/java/config/TestConfig.java'>TestConfig.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>rest_client</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='/Users/biancacezara/IdeaProjects/credit-score-wiremock-practice/blob/master/src/test/java/rest_client/RestClient.java'>RestClient.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

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
