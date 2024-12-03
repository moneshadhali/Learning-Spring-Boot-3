
# Notes 

## LESSON 1
Maven is a project management tool that helps developers manage their applications. Its primary uses include:

1. **Dependency Management**: Maven automatically handles downloading and including the necessary libraries (called JAR files) for your project. Instead of manually downloading each JAR from various websites, you just provide Maven with a list of what you need, and it fetches them for you.
2. **Build Automation**: It offers a standardized way to build your projects, allowing you to focus on coding while Maven takes care of the build lifecycle.
3. **Project Structure**: A Maven project follows a predefined directory structure, with a configuration file called `pom.xml` at the project's root. This file outlines your project's dependencies, build instructions, and other configurations. It also includes **GAV** which outlines the project's group name, artifact ID, and version name—important information used when referencing the project as a dependency.

In summary, Maven simplifies the process of managing libraries and building your Java projects efficiently, acting as a “friendly helper” that streamlines development efforts.

---

## LESSON 2
- **`mvnw` and `mvnw.cmd`**: Checks to make sure the computer has Maven installed. If not, it installs Maven (one file is for Windows, and the other is for Mac). It also allows you to run a Maven project.
- **Directory Structure**:
  - `src/main/java`: Where the source code resides.
  - `src/main/resources`: Where you store configuration files and resources your application needs at runtime (e.g., properties files, XML files).
  - `src/test`: Where the test file sources reside.

---

## LESSON 3
**Adding Dependencies**:
- Use `spring-boot-starter-web`.

**Dependencies for web + security**:
- Spring Web
- Spring Security
- Spring Data JPA
- Thymeleaf

---

## LESSON 4
To check what’s inside the starter/dependencies (which is included in pom.xml file):
1. Navigate to `View > Tool Windows > Maven Projects > Dependencies`.

---

## LESSON 5
You can specify the Java version you want to use (in pom.xml file) after `spring-boot-starter-parent` by overriding it in the `<properties>` section, e.g., including:
<java.version>18</java.version>

---

## LESSON 6
**Spring Boot Actuator** is a component of Spring Boot that allows you to monitor and manage your application. Here’s a breakdown of its key features and functionalities:

1. **Monitoring and Management**: Actuator exposes various endpoints that provide vital information about the health, metrics, and status of your application. This is essential for maintaining operational efficiency, especially in production environments.
2. **Automatic Endpoints**: By adding the `spring-boot-starter-actuator` dependency to `pom.xml`, you gain access to several RESTful endpoints without writing additional code. These endpoints are prefixed with `/actuator`. Common endpoints include:
   - `/actuator/health`: Checks and reports the application's health status.
   - `/actuator/info`: Displays arbitrary information related to the application.
3. **Ease of Use**: Actuator provides DevOps functionalities out-of-the-box, enabling quick checks to ensure your application is running as expected and accessing detailed performance metrics.
4. **Customization and Security**:
   - Customize the information provided by the `/actuator/info` endpoint in your application properties.
   - Secure these endpoints to prevent unauthorized access to sensitive application data.

---


## LESSON 7
You can run this project using the command line:
1. Package the app using:
   ```
   mvnw package
   ```
2. Run the app:
   ```
   java -jar project.jar
   ```
3. Run the app using Maven Spring Boot Maven Plugin:
   ```
   mvnw spring-boot:run
   ```
```