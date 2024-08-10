# Pancard Generator

## Overview

The `Pancard` program is a simple Java application that generates a random PAN (Permanent Account Number) card number based on user input. This example demonstrates basic Java programming concepts such as user input handling, random number generation, and string manipulation.

## Features

- **User Input:** Prompts the user to enter their name.
- **PAN Generation:** Creates a PAN card number consisting of:
  - Four random alphabetical characters.
  - The uppercase first letter of the user's name.
  - A random 4-digit number.
  - A single random alphabetical character.
- **Output:** Displays the generated PAN card number.

## Prerequisites

- **Java Development Kit (JDK):** Ensure JDK 8 or higher is installed on your system.

## Getting Started

### Clone or Download

1. Clone or download the repository containing `Pancard.java`.

### Compilation and Execution

1. **Compile the Program:**
   ```bash
   javac Pancard.java
2. **Run the Program:**
   ```bash
   java Pancard
   
## Code Explanation

### Imports

- **`java.util.*`:** Imports utility classes such as `Scanner`, `Random`, and `Set`.

### User Input

- **`Scanner`:** Uses `Scanner` to read the user's name from the console.

### PAN Generation

- **First Character:** Extracts the first character of the user's name and converts it to uppercase.
- **Random Characters:** Generates a random string of 4 alphabetical characters.
- **Random Number:** Generates a random 4-digit number.
- **Last Character:** Generates a random single alphabetical character.
- **Combination:** Constructs the PAN card number by concatenating the random string, uppercase first character, random number, and the last random character.

### Output

- **Prints the generated PAN card number** enclosed in a `Set` for demonstration purposes. Using a `Set` ensures that the output is unique and eliminates duplicate entries, though in this case, it contains only one entry.

### Sample Output
Enter your Name :
John
Generated Pan Card Number :[ABCDJ1234E]
