# My Codex Test

This project includes a simple Spring Boot application with a login API.

## Building and Running

```
mvn spring-boot:run
```

The application exposes a `POST /login` endpoint that accepts a JSON body:

```
{
  "username": "user",
  "password": "password"
}
```

It returns a JSON response indicating whether the login is successful.
