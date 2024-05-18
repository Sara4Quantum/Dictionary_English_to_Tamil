# 📖 Dictionary English - Tamil

### Project Developed by P. Saravanan

---

## 📑 Table of Contents

1. [Overview](#overview)
2. [Purpose](#purpose)
3. [Requirements](#requirements)
4. [Design](#design)
5. [Technical Details](#technical-details)
6. [Usage](#usage)
7. [Dependencies](#dependencies)
8. [Notes](#notes)

---

## 📝 Overview

- **Main Language:** Java
- **Web Framework:** Spring Boot
- **Tools:** SpringToolSuite4

---

## 🎯 Purpose

The English to Tamil dictionary web application is designed to provide users with one or multiple meanings for a single English word, enhancing language comprehension and aiding communication between English and Tamil speakers.

---

## 🛠️ Requirements

1. **Dictionary File**: An English to Tamil dictionary file in text format, containing meanings for 56,862 words.
2. **User Input**: An English word entered by the user.

---

## 🖌️ Design

This project consists of three web pages:

### Home Page
- **Features**:
  - Title: "Dictionary"
  - Subtitle: "English to Tamil"
  - Input Field: "Enter English Word"
  - Button: "Find Meanings"
- **Styling**:
  - Centered content
  - 3D effect on title
  - Oval input field
  - Grey background
  - Green button with hover effect
  - Disclaimer message at the bottom

### Meanings Found Page
- **Features**:
  - Title: "English to Tamil Dictionary"
  - Dynamic Fields: "English word" and "Tamil Meanings"
  - Back button with hover effect
  - Disclaimer message

### Meanings Not Found Page
- **Features**:
  - Title: "English to Tamil Dictionary"
  - Dynamic Field: "English word"
  - Not found message in Tamil and English
  - Back button with hover effect
  - Disclaimer message


---

## 🔍 Technical Details

### Core Classes

1. **`Input_collect`**: Stores user inputs
2. **`Eng_Tamil_Dictionary`**: Finds Tamil meanings of user-entered English words using File IO
3. **`UserInput`**: Interface for saving English words inputted by users to the database
4. **`DictionaryEnglish2TamilApplication`**: Entry point for the Spring Boot application
5. **`Dictionary_Controller`**: Handles HTTP requests and manages data flow



## 🚀 Usage

1. **Run the Application**: Start the "Dictionary_English2Tamil" application.
2. **Navigate**: Go to `localhost:8080/tamildictionary` in your browser to access the homepage.
3. **Enter Input**: Type the English word you want to find the Tamil meaning for.
4. **View Results**: The application will display the meanings or a "not found" message.
5. **Back Button**: Use the "Back" button to return to the homepage from the results page.

---

## 📦 Dependencies

- **Apache Tomcat Jasper**: Provides JSP and JSTL support
- **Spring Boot Starter Data JPA**: For data access using JPA
- **Spring Boot Starter Web**: For developing web applications using Spring MVC
- **H2 Database**: Embedded database for development and testing
- **Spring Boot Starter Test**: For testing Spring Boot applications

Add these dependencies to your `pom.xml`.

---

## 📝 Notes

This application provides meanings for 56,862 words only.

## Detailed 👇 Documentation here       
[Dictionary English - Tamil](Document_of_project.pdf)
