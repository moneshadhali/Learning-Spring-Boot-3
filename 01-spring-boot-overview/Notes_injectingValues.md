# Using Properties in Spring Boot

## Step 1: Define Properties
Define your custom properties in the following file: `resources/application.properties`.

### Example:
```properties
# Define my properties
coach.name = Mickey Mouse
team.name = The Mouse Club
```

---

## Step 2: Inject Properties
In your Java file (e.g., `src/main/java`), inject the properties defined in `application.properties` using the `@Value` annotation.

### Example:
```java
@Value("${coach.name}")
private String coachName;

@Value("${team.name}")
private String teamName;
```

---

## Step 3: Expose a New Endpoint
Create a new endpoint to expose the property values.

### Example:
```java
@GetMapping("/teaminfo")
public String getTeamInfo() {
    return "Coach: " + coachName + ", Team name: " + teamName;
}
```

---

## Step 4: Access the Endpoint
Start the Spring Boot application and navigate to the following URL to view the team information:
```
http://localhost:8080/teaminfo
```

The response will look something like this:
```
Coach: Mickey Mouse, Team name: The Mouse Club
```
