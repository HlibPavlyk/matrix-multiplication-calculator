# Matrix Multiplication Calculator (Lab 1 Java Software Development)

This project performs operations on matrices, including multiplication and calculating the sum of the smallest elements in each row of the resulting matrix. Users can input matrices manually or generate them randomly with specified dimensions.

## Assignment

Define **C5** as the remainder of dividing the student's record book number 13879064 by 5, **C7** as the remainder of dividing the student's record book number 13879064 by 7, and **C11** as the remainder of dividing the student's record book number 13879064 by 11.

Based on **C5**, determine the action performed with the matrix/matrices:

| C5  | Action with Matrices                              |
|-----|---------------------------------------------------|
| 4   | C = A * B, where * denotes matrix multiplication |

Based on **C7**, determine the type of matrix elements:

| C7  | Type of Matrix Elements |
|-----|-------------------------|
| 3   | `int`                   |

Based on **C11**, determine the action with matrix C:

| C11 | Action with Matrix C                                  |
|-----|-------------------------------------------------------|
| 1   | Compute the sum of the smallest elements of each row of matrix C |

**Variant:**

- **C5 = 4**: Perform matrix multiplication \( C = A \times B \).
- **C7 = 3**: Matrices contain elements of type `int`.
- **C11 = 1**: Compute the sum of the smallest elements of each row of matrix C.

## Features

- **Matrix Input Options**: Choose to input matrices manually or generate them randomly.
- **Integer Elements**: Matrices contain integer elements.
- **Matrix Multiplication**: Multiply two matrices ( C = A * B ).
- **Calculation on Resulting Matrix**: Compute the sum of the smallest elements in each row of matrix C.
- **Exception Handling**: Robust error handling for invalid inputs and incompatible matrix dimensions.
- **Code Standards**: Adheres to Java Code Conventions.

## Requirements

- **Java Development Kit (JDK) 8** or higher installed on your system.
- **Git** (optional, for cloning the repository).

## How to Run

### Clone the Repository (Optional)

If the project is hosted on GitHub, clone it using:

```bash
git clone https://github.com/HlibPavlyk/matrix-multiplication-calculator.git
cd matrix-multiplication-calculator/src
```

Alternatively, you can download the source code files directly.

### Compile the Source Code

Open a terminal or command prompt in the project directory and compile the Java files:

```bash
javac Main.java MatrixUtils.java
```

### Run the Program

After successful compilation, run the program using:

```bash
java Main
```

## Usage Instructions

1. **Starting the Program**:
   - Run `java Main` in your terminal.

2. **Matrix A Input**:
   - **Option Selection**:
     - Enter `1` to input Matrix A manually.
     - Enter `2` to generate Matrix A randomly.
   - **Manual Input**:
     - Enter the number of rows and columns.
     - Input each element as prompted.
   - **Random Generation**:
     - Enter the number of rows and columns.
     - The matrix will be filled with random integers between -10 and 10.

3. **Matrix B Input**:
   - Repeat the same steps as Matrix A for Matrix B.

4. **Matrix Multiplication**:
   - The program multiplies Matrix A and Matrix B to produce Matrix C.
   - Compatibility check: The number of columns in Matrix A must equal the number of rows in Matrix B.

5. **Results Display**:
   - **Matrix C**: The result of the multiplication is displayed.
   - **Sum Calculation**: The program calculates and displays the sum of the smallest elements from each row of Matrix C.

## Example Session

```
Select an option for Matrix A:
1 - Enter manually
2 - Generate randomly
2
Enter dimensions of Matrix A to generate (rows and columns):
3 2
Generated Matrix A:
     -3     5
      7    -1
      0     4
Select an option for Matrix B:
1 - Enter manually
2 - Generate randomly
2
Enter dimensions of Matrix B to generate (rows and columns):
2 3
Generated Matrix B:
      2    -6     1
     -3     0     5
Matrix C (Result of A * B):
     21   -18    22
     23   -42     2
    -12     0    20
Sum of the smallest elements of each row in Matrix C: -60
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


Feel free to reach out for any questions or suggestions regarding this project.
