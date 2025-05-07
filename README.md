# 🎮 Stick Hero Game (JavaFX)

A simple yet engaging Stick Hero game built using JavaFX, where the player extends a stick to help the character cross randomly generated platforms. The project demonstrates principles of Object-Oriented Programming, animation, design patterns, and user interaction in a Java desktop environment.

---

## Demo

- **Video Demo**: [Google Drive Link](https://drive.google.com/drive/folders/1rIBDO2nllO1CVWYJ2yqsxZJ9VDQ5EDMq?usp=drive_link)  

---

## Introduction

Stick Hero is a Java-based game in which the player must extend a stick to precisely connect one platform to the next. The player presses the spacebar to extend the stick and releases it to make the hero move forward. The game continues until the hero falls short or overshoots a platform.

---

## Features

-  **Simple Controls**: Press spacebar to extend the stick, release to move the hero.
-  **Dynamic Platform Generation**: Each platform is generated randomly to keep the game fresh.
-  **Animated Character**: Basic stick figure animation brings the game to life.
-  **JavaFX UI**: Built entirely with JavaFX and SceneBuilder for a smooth GUI experience.
-  **Scoring System**: Calculates score based on distance traveled.
-  **Fall Mechanism**: Miss a platform and it’s game over.

---

## Installation

1. Clone or download the repository.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA or Eclipse).
3. Make sure JavaFX is set up correctly in your environment.
4. Run `SceneController.java` to launch the game.

---

##  How to Play

- **Press** the spacebar to start extending the stick.
- **Release** the spacebar to rotate the stick and move the hero.
- Land safely on the next platform to continue scoring.
- The game ends if you fall off the platform.

---

##  Game Mechanics

- **Stick Extension**: Triggered by holding the spacebar.
- **Stick Rotation**: Initiated upon releasing the spacebar.
- **Random Platform Generation**: Platforms have variable widths and distances.
- **Scene Transitions**: Smooth transitions between start, game, and end screens.
- **Score Tracking**: Based on successful platform crossings.

---

## Code Structure

###  FXML Files
- `hello-view.fxml` – Main game layout
- `Start.fxml` – Start menu
- `End.fxml` – End screen

###  Key Java Classes
- `SceneController.java` – Main game logic, animations, input handling
- `SceneTransition.java` – Manages transitions between scenes

---

##  Design Patterns

- 🧩 **Singleton Pattern**  
  - Ensures only one instance of `SceneController`
  - Accessed using `getInstance()`

- 🏭 **Factory Method Pattern**  
  - Used for creating game elements (platforms, sticks, etc.)
  - Defined via `GameElementFactory` and `GameElementFactoryImpl`

---

##  Dependencies

- JavaFX SDK (ensure it’s correctly added to your IDE or build path)

---

##  Contributing

Both developers contributed equally to all phases: design, development, and testing.

---

##  License

This project is for academic and demonstration purposes only. No official license yet.

---

##  Contact

For queries or collaboration:
- **Kanak Yadav** – [LinkedIn](https://www.linkedin.com/in/kanak-yadav-16217a258/) | [GitHub](https://github.com/Kanakyadav88)

---

