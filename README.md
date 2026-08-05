Student Name: PARIKSHITH D

Email: parikshith.official.in@gmail.com

Team Number: 05

GitHub Username: https://github.com/Parigowda007/Second-PRD

Requirement Number: 03

Project Title: Mock Test Attempt Manager

Repository URL: https://github.com/Parigowda007/Second-PRD

Submission Time: 8.00 pm

Submission Status: Submitted







🎯 Mock Test Attempt Manager


A Java console application that manages a student's mock-test attempts, evaluates performance, tracks the best score, and determines whether the student has successfully cleared the mock test.

This project demonstrates fundamental Java programming concepts, including loops, operators, conditional statements, and decision-making logic.










📌 Problem Statement


Create a Java program that manages a student's mock-test attempts.

The student is allowed a maximum of 3 attempts to achieve the required passing score.

The program evaluates each attempt and stops evaluating once the student passes.

⚙️ Rules
Passing score: 60
Maximum attempts: 3
Stop evaluating when the student passes
Track the student's best score
Display the number of remaining attempts
Display the final result and recommendation









📊 Hard-Coded Test Data

The program uses hard-coded values for three mock-test attempts.

Each attempt contains:

Score
Correct answers
Incorrect answers

Example:

Attempt	Score	Result
1	48	❌ Failed
2	57	❌ Failed
3	68	✅ Passed









✨ Features

The application displays:

Attempt number
Score
Correct answers
Incorrect answers
Pass/Fail status
Best score
Remaining attempts
Final result
Recommendation
The program automatically stops evaluating further attempts once the student achieves the passing score.









🧠 Java Concepts Used

This project demonstrates the following Java concepts:

while / do-while loop
Increment operator (++)
Decrement operator (--)
Assignment operators
Relational operators
Logical operators
Nested conditions
Ternary operator










🔄 Program Flow

START
  |
  v
Initialize Mock Test Data
  |
  v
Start Attempt
  |
  v
Evaluate Score
  |
  +------ Score >= 60? ------+
  |                          |
  NO                        YES
  |                          |
  v                          v
Display Failed          Display Passed
  |                          |
  v                          v
Reduce Remaining        Update Best Score
Attempts                     |
  |                          v
  v                     Stop Evaluation
More Attempts?
  |
  +---- YES ---> Next Attempt
  |
  NO
  |
  v
Display Final Result
  |
  v
END










💻 Sample Output

MOCK TEST ATTEMPT REPORT

Attempt 1
Score: 48
Result: Failed
Remaining Attempts: 2

Attempt 2
Score: 57
Result: Failed
Remaining Attempts: 1

Attempt 3
Score: 68
Result: Passed

Best Score: 68
Final Result: MOCK TEST CLEARED
Message: Student passed on attempt 3.











🚀 How to Run

1. Clone the repository
git clone <your-repository-url>
2. Open the project
Open the project folder using any Java-supported IDE such as:

IntelliJ IDEA
Eclipse
VS Code
Gravity IDE
3. Compile
javac Main.java
4. Run
java Main
Replace Main.java with your actual Java class/file name if it is different.











📂 Project Structure

Mock-Test-Attempt-Manager/
│
├── Main.java
└── README.md











🎯 Learning Outcomes
Through this project, I practiced:

Implementing decision-making logic in Java
Working with loops
Using increment and decrement operators
Using relational and logical operators
Implementing nested conditions
Tracking values such as best score
Controlling program execution based on conditions
Building a structured Java console application













🛠️ Technologies Used
Java Git GitHub

Language: Java
Version Control: Git
Repository Hosting: GitHub







👨‍💻 Author
Parikshith D

GitHub: Parigowda007

⭐ If you found this project useful, consider giving the repository a star!
