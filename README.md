# 🧪 Enterprise API Automation Framework

A **Java-based API automation framework** designed to validate enterprise-grade REST APIs using **realistic positive and negative test scenarios**.

This project demonstrates how I design **scalable, maintainable, and production-style API automation**, aligned with real-world QA and SDET practices.

---

## 🚀 What This Framework Covers

- Health check validation
- Booking creation – positive flow
- Booking creation – negative scenarios:
  - Missing mandatory fields
  - Invalid date ranges
  - Price boundary / data quality checks
- Authorized API operations using token-based authentication
- Centralized request configuration
- Reusable payload builders
- Data-quality–focused negative testing (not just pass/fail)

---

## 🛠 Tech Stack

- **Java 21**
- **Rest Assured**
- **JUnit 5**
- **Jackson (JSON serialization)**
- **Maven**
- **Git**

---

## 📁 Project Structure

src/test/java/com/bhumika/api
│
├── base
│ └── BaseTest.java # Global Rest Assured configuration
│
├── tests
│ ├── HealthCheckTest.java
│ ├── CreateBooking_PositiveFlow_Test.java
│ ├── CreateBooking_NegativeFlow_MissingMandatoryFields_Test.java
│ ├── CreateBooking_NegativeFlow_InvalidDateRange_Test.java
│ ├── CreateBooking_NegativeFlow_PriceBoundary_Test.java
│ └── UpdateBooking_Authorized_Test.java
│
├── utils
│ ├── RequestBuilder.java # Centralized request spec
│ ├── BookingPayloadBuilder.java # Reusable payload generation
│ └── AuthTokenProvider.java # Token handling & caching
│
└── pom.xml

---

## 🧠 Key Design Decisions

### 🔹 BaseTest Pattern
- Centralizes base URI, content type, and logging
- Keeps test classes clean and readable

### 🔹 Payload Builder Pattern
- Separates test logic from request construction
- Makes negative testing safe and maintainable

### 🔹 Realistic Negative Testing
- Some APIs accept invalid data and still return 200
- Tests **capture data quality gaps** instead of blindly failing

### 🔹 Token Caching
- Auth token generated once and reused
- Reduces unnecessary authentication calls

---

## ▶️ How to Run the Tests

From the project root:

```bash
mvn clean test

🎯 Why I Built This

To demonstrate how I approach enterprise API testing:

clean structure

reusable components

meaningful assertions

real production behavior handling

This framework reflects how I work in real QA/SDET environments.


---

# ✅ STEP 2 — GitHub Repository Description (short & strong)

### Paste this into **GitHub → About section**

> **Enterprise-grade API automation framework built with Java, Rest Assured, and JUnit 5.  
Covers positive, negative, and authorized API flows using reusable request builders, payload factories, and real-world data quality validations.**

---

# ✅ STEP 3 — Resume / LinkedIn Project Bullets (COPY-PASTE)

Use **2–3 bullets max** 👇

**Option A – Resume bullets**

- Designed and implemented an **enterprise-style API automation framework** using Java, Rest Assured, and JUnit 5, covering positive, negative, and authorized flows  
- Built reusable **request builders and payload factories**, improving test maintainability and reducing duplication  
- Implemented **data-quality–focused negative testing**, capturing real production behavior instead of hard-failing on 200 responses  

**Option B – LinkedIn project description**

> Built an enterprise-grade API automation framework using Java, Rest Assured, and JUnit 5.  
Focused on realistic negative testing, token-based authorization, and reusable test architecture aligned with real QA/SDET environments.

---

