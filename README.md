Two-Dimensional Arrays in Java
📌 Overview
This project demonstrates how to declare, initialize, and traverse a two-dimensional array in Java.

The program creates a 2D integer array (matrix) and uses nested for loops to print each element row by row.

📂 Package
day7

📄 Class
TwoDimensionalArrays

🧠 Concepts Covered
This example demonstrates:

Declaring and initializing a two-dimensional array

Understanding rows and columns

Using the length property of an array

Traversing a 2D array using nested for loops

Printing array elements in a matrix format

💻 Code
package day7;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        // Declare and initialize 2-dimensional arrays

        int matrix[][] = {
            {10, 20, 13},
            {12, 30, 25},
            {56, 8, 31},
            {5, 70, 43}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

🔍 How It Works
The following 2D array is created:

10  20  13
12  30  25
56   8  31
 5  70  43

The array contains 4 rows and 3 columns.

Outer Loop
for (int i = 0; i < matrix.length; i++)

The outer loop goes through each row of the matrix.

matrix.length returns the number of rows, which is 4.

Inner Loop
for (int j = 0; j < matrix[i].length; j++)

The inner loop goes through each element within the current row.

matrix[i].length returns the number of elements in that particular row.

Printing the Elements
System.out.print(matrix[i][j] + " ");

This prints each element followed by a space.

After completing each row:

System.out.println();

moves the cursor to the next line.

▶️ Expected Output
10 20 13
12 30 25
56 8 31
5 70 43

🛠️ Requirements
Java Development Kit (JDK)

Any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

Basic understanding of Java arrays and for loops

🎯 Learning Objective
The main goal of this example is to understand how two-dimensional arrays work in Java and how nested loops can be used to access every element in a matrix.

📚 Example Structure
TwoDimensionalArrays
        │
        └── matrix
             ├── Row 0 → 10 20 13
             ├── Row 1 → 12 30 25
             ├── Row 2 → 56 8 31
             └── Row 3 → 5 70 43
