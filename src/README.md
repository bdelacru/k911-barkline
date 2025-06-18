# K911 Barkline 🐶🚨

A playful yet powerful backend project built with **Kotlin + Spring Boot + MongoDB** that simulates emergency dog
alerts, integrates real-world **Chicago crime data**, and sends real-time **voice calls via Sinch API**. Inspired by
safety, fun, and technical learning.

---

## 🌟 What This Project Does

* 📢 **Voice Alerts with Sinch**: Mickey and Motly (my dogs) can send voice alerts to verified phone numbers using the
  Sinch TTS API.
* 📉 **Chicago Crime Data Integration**: Pulls real-time crime incidents from the City of Chicago's public data portal.
* 🛋️ **Emergency Call Routing**: Records "emergency" reports triggered by endpoints and stores them in MongoDB.
* 📊 **Safety Analytics** *(Coming Soon)*: Ranks neighborhoods for dog walks based on recent crime activity.

---

## 🧳 Lessons Learned

* **Kotlin with Spring Boot**: Built this project entirely in Kotlin to strengthen my fluency in a modern, expressive
  JVM language.
* **MongoDB with Spring Data**: Learned how to store and retrieve dynamic documents, perfect for real-time events like
  emergency calls.
* **RESTful API Design**: Implemented well-structured endpoints with DTOs, validation, and Swagger integration.
* **Sinch Voice API**: Gained hands-on experience with secure API authentication, TTS calls, and real-world telecom use
  cases.
* **Error Handling + Observability**: Built in resilience for failure scenarios and practiced defensive coding for
  3rd-party API calls.

---

## Kotlin Learning Log (What I Learned as a Java Developer Learning Kotlin Hands-On)

| Date Learned | Concept                                                  | Notes                                                                                  |
|--------------|----------------------------------------------------------|----------------------------------------------------------------------------------------|
| 2025-06-17   | Empty class with no methods                              | Curly brackets `{}` can be omitted.                                                    |
| 2025-06-17   | Top-level functions                                      | Functions can exist outside classes.                                                   |
| 2025-06-17   | `data class`                                             | Similar to Java Records.                                                               |
| 2025-06-17   | Null safety                                              | Cannot assign `null` without explicitly marking variable as nullable.                  |
| 2025-06-17   | Nullable types                                           | Use `?` at the end of the type (e.g., `var name: String?`).                            |
| 2025-06-17   | `val` vs `var`                                           | `val` is a constant (read-only); `var` can be reassigned.                              |
| 2025-06-17   | No need for `@Getter` with `@Value`                      | In Kotlin + Spring, inject config properties directly in constructor without Lombok.   |
| 2025-06-17   | `@Getter` only needed for Java interop or private fields | Kotlin generates getters by default unless accessing private fields from a Java class. |

---

## 🔧 Tech Stack

| Layer           | Tooling                    |
|-----------------|----------------------------|
| Language        | Kotlin                     |
| Backend         | Spring Boot (Gradle + KTS) |
| Database        | MongoDB (Docker)           |
| API Integration | Sinch Voice TTS API        |
| External Data   | City of Chicago SODA API   |
| Docs            | Swagger UI via Springdoc   |

---

## 🎓 Endpoints Overview

| Endpoint                     | Method | Description                       |
|------------------------------|--------|-----------------------------------|
| `/api/voice-alert`           | POST   | Sends a TTS voice alert via Sinch |
| `/api/emergency/report`      | POST   | Stores a new emergency call       |
| `/api/emergency/calls`       | GET    | Lists all stored emergency calls  |
| `/api/chicago/recent-crimes` | GET    | Returns recent Chicago crime data |

---

## 🌍 How to Run Locally

1. **Start MongoDB (Docker)**

   ```bash
   docker run -d -p 27017:27017 --name mongo-dev mongo
   ```

2. **Set Environment Variables** Create a `.env` file or configure IntelliJ environment with:

   ```env
   SINCH_KEY=your_key_here
   SINCH_SECRET=your_secret_here
   SINCH_FROM_PHONE=+11234567890
   ```

3. **Run the App**

   ```bash
   ./gradlew bootRun
   ```

4. **View Swagger Docs**
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 💬 Why This Project Stands Out

* Combines **serious tech skills** with a **lighthearted theme** (dogs saving the day!)
* Shows initiative in learning **voice APIs**, **real-time data ingestion**, and **backend design**
* Built with production-ready practices: `.gitignore`, secrets management, layered architecture
* Demonstrates ability to self-learn and deliver full-stack backend functionality end-to-end

---

## 🚀 What's Next

* Observability tools integrated
* Chaos Monkey tools integrated
* UI

---

## 👉 Special Thanks

To Mickey and Motly, the inspiration for every bark, squirrel alert, and snack demand that led to `/emergency/report`.

---

## 💼 For Interviewers

This project demonstrates my ability to:

* Work with real-world APIs and asynchronous events
* Translate playful ideas into working technical features
* Build, deploy, and debug Kotlin-based Spring Boot apps
* Connect code with user-facing value — even if that user is a Shih Tzu

---

> ⭐ Interested in a demo or code walkthrough? I'm happy to chat!

---

**Repo**: [github.com/bdelacru/k911-barkline](https://github.com/bdelacru/k911-barkline)
