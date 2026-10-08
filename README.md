# Java Swing & HCI Individual Assignment 1

## Overview
This is a Java Swing GUI application developed as part of the Human-Computer Interaction (HCI) coursework. The application creates an 800x800 window featuring a custom application icon, a structured panel container, a welcome label, and an interactive theme-changing button.

## Author
* **Student Name:** [Olatunde Rahman]
* **Student ID:** [905004640]

## Key Features & Requirements
* **Window Size:** 800x800 pixels (`JFrame`)
* **Custom Icon:** `icon.png` loaded via `ImageIcon`
* **Layout Components:** `JPanel`, `JLabel`, `JButton`
* **Interactivity:** Clicking the button updates the label text and changes the panel background color.

## File Structure
* `SwingAssignment.java` - Main Java source code containing GUI setup and event handling.
* `icon.png` - Application icon image.
* `wireframe.png` - Visual UI wireframe layout.

## How to Run
1. Ensure Java JDK 8 or higher is installed.
2. Place `icon.png` in the same directory as `SwingAssignment.java`.
3. Open the project in IntelliJ IDEA or compile via terminal:
   ```bash
   javac SwingAssignment.java
   java SwingAssignment