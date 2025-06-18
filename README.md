# 🐾 K911 Barkline

**K911 Barkline** is a Kotlin-based backend project built with Spring Boot, MongoDB, and Docker. It's designed as a
hands-on learning playground for a seasoned Java developer (me!) exploring Kotlin, and it's deployable to the cloud via
Render.

---

## 🚀 Live Demo

Deployed on Render: [https://k911-barkline.onrender.com](https://k911-barkline.onrender.com)  
Swagger UI: [https://k911-barkline.onrender.com/swagger-ui.html](https://k911-barkline.onrender.com/swagger-ui.html)

---

## 📚 Kotlin Learning Log

| Date Learned  | Concept                                                  | Notes                                                                                  |
|---------------|----------------------------------------------------------|----------------------------------------------------------------------------------------|
| June 17, 2025 | Empty class with no methods                              | Curly brackets `{}` can be omitted.                                                    |
| June 17, 2025 | Top-level functions                                      | Functions can exist outside classes.                                                   |
| June 17, 2025 | `data class`                                             | Similar to Java Records.                                                               |
| June 17, 2025 | Null safety                                              | Cannot assign `null` without explicitly marking variable as nullable.                  |
| June 17, 2025 | Nullable types                                           | Use `?` at the end of the type (e.g., `var name: String?`).                            |
| June 17, 2025 | `val` vs `var`                                           | `val` is a constant (read-only); `var` can be reassigned.                              |
| June 17, 2025 | No need for `@Getter` with `@Value`                      | In Kotlin + Spring, inject config properties directly in constructor without Lombok.   |
| June 17, 2025 | `@Getter` only needed for Java interop or private fields | Kotlin generates getters by default unless accessing private fields from a Java class. |

---

## 🛠️ Tech Stack

- **Backend**: Kotlin, Spring Boot
- **Database**: MongoDB (MongoDB Atlas)
- **Build Tool**: Gradle
- **Deployment**: Docker + Render
- **Testing & Docs**: JUnit, Swagger

---

## 📦 Local Development

### Prerequisites

- Java 17
- Gradle
- Docker (optional, for containerized local testing)
- MongoDB (local or remote via Atlas)

### Running Locally

```bash
./gradlew bootRun
