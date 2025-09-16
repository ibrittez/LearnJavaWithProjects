# `LearnJavaWithProjects`

This repository contains the projects I am developing while reading the book:

**Kennedy, D. S., & van Putten, M. (2023).  _Learn Java with Projects: A Concise Practical Guide to Learning Everything a Java Professional Really Needs to Know._  Packt Publishing, India.**

---

## Structure

- Each project lives in its own directory.  
- Project names follow the chapter or concept they are based on.  
- The initial project has been moved into its own folder to make room for more.

Example layout:

```

LearnJavaWithProjects/
├── Ch1_ProjectName/
├── Ch2_ProjectName/
└── ...

```

---

## Requirements

- **Java >= 17** (or the version recommended by the book)
- **Maven** (used as the build tool)

---

## Running a Project

Navigate into the desired project folder (for example ch6) and run:

```bash
mvn clean package
java -cp target/Ch6_DinoTracker-1.0-SNAPSHOT.jar com.mesozoic_eden.app.App
```
