# Food Ordering System
Personal Project - Food Ordering System

Simple food ordering system as a final project for CMSC22.

As I was thinking on what project I'm going to do, I realized that whenever my family takes food orders for simple occasions we face problems in organizing orders and tallying the number of foods to be cooked. So I decided that I will just make a program that takes orders from the user, compute the total amount, and tallies the number of pieces per food in the menu. I plan on reusing this program for more future orders so the time we spend counting orders will be lessened.

# Requirements:
My Hobby/Interest: Organizing things

Problem: Organize orders from customers

Solution: Tally the total pieces per food ordered by the customer and the overall price.

I used IntelliJ as IDE and JUnit 4 for TDD.

# 1. Design Pattern per category:
a. Creational Pattern

  I decided to use Builder Design Pattern so that I can separate the steps in taking order to different classes (such as the Customer, Order, Sales, and Menu) so that it will be easier to modify each classes in the future. This pattern allows me separate object construction from its representatin. I used user input so that I dont have to code everything everytime we receive orders.

b. Structural Pattern

  Since the all the classes represent a tree structure when executed, I used Composite Design Pattern. The methods and objects are group together to their respective classes, it lets me work as if they were individual objects.

c. Behavioral Pattern

  Iterator Design Pattern is ideal for executing the program because it will iterate through arrays of string and integers. This pattern allows me to travers elements of list without revealing its representation.

# 2. Test-driven development (TDD)
  I used JUnit 4 in IntelliJ for unit testing, and followed the red, green, refactor cycle to complete my project.

# 3. Best Java Coding Practices
  As I was coding, I implemented some of the best coding practiced: I first used tdd to start creating and testing methods,then I used the CamelCase in naming convention and avoided short variable names, fixed the identation every time I refactor, used static methods and variables so it will be easier to access them from different classes, ordered class members by their scope, and avoided empyt catch blocks to continue the loop. After several trial and errors, I added comments and generated javadoc to create the html file. And, that is how I successfully compeleted the program.

