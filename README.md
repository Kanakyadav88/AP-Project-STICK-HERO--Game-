                                                    ** Stick Hero Game**
This JavaFX application implements a simple Stick Hero game where the player extends a stick to 
cross platforms.

LINK TO THE Video: 
https://drive.google.com/drive/folders/1rIBDO2nllO1CVWYJ2yqsxZJ9VDQ5EDMq?usp=drive_link

GIF Link :
https://github.com/Kanakyadav88/AP-Project-STICK-HERO--Game-/assets/119087399/c751d756-d61b-42d9-9a7c-68b368da29d7

                                                    **Introduction**
Stick Hero is a game where the player controls a character attempting to cross platforms by 
extending a stick. The goal is to reach as far as possible by accurately extending the stick to the next 
platform.

                                                     **Features**
• Simple Controls: The game features straightforward controls. Press the spacebar to extend 
the stick and release it to make the character move.
• Dynamic Platform Generation: Platforms are randomly generated, providing a unique 
gameplay experience in each session.
• Animated Character: The character is animated, providing a visually engaging experience.

                                                     **Installation**
1. Download from Google Classroom.
2. Open the project in your preferred Java development environment.
3. Run the SceneController.java file to launch the game.
   
                                                      **How to Play**
• Press the spacebar to extend the stick.
• Release the spacebar to make the character move.
• Aim to land the character on the next platform.
• Repeat the process to advance and score points.

                                                     **Game Mechanics**
1. Stick Extension:
• The player can extend the stick by pressing and holding the spacebar.
• The stick height increases while the spacebar is held.
2. Stick Rotation:
• Upon releasing the spacebar, the stick rotates, and the character moves forward.
3. Platform Generation:
• Platforms are randomly generated with varying widths.
• The goal is to land the character accurately on the next platform.
4. Score Calculation:
• The score is determined by the distance travelled by the character.
5. Fall Mechanism:
• If the character falls, short or extends beyond the platform, the game ends.
6. Platform Shifting:
• After successfully crossing a platform, the game shifts to a new set of platforms.

                                                      **Code Structure: **
Design Patterns Used
• Singleton Pattern
Purpose: Ensures that there is only one instance of SceneController.
Implementation: Utilizes a private constructor and a static method (getInstance()) to return the 
single instance.
• Factory Method Pattern
Purpose: Abstracts the creation of game elements (rectangles, circles, etc.), allowing flexibility in 
instantiation.
Implementation: GameElementFactory interface and GameElementFactoryImpl class provide 

                                                        **methods for creating game elements**
• FXML Files:
• hello-view.fxml: Contains the main game layout.
• End.fxml: Represents the end screen.
• Start.fxml: Displays the start screen.

**• Java Classes:**
• SceneController.java: Controls the game logic, animations, and transitions.
• SceneTransition.java: Manages scene transitions for the Stick Hero game.

**Dependencies**
• JavaFX: The game utilizes the JavaFX library for building the graphical user interface.
Contributing:
Both partners contributed equally to the design, development, and testing phases.

