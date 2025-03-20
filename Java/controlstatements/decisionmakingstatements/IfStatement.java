package controlstatements.decisionmakingstatements;

public class IfStatement {
    /*
        * Syntax:
        * 
        * (1)
        * if (condition) {
        *  statement
        * }
        * 
        * (2)
        * if (condition) {
        *  statement
        * } else {
        *  statement
        * }
        * 
        * (3)
        * if (condition) {
        *  statement
        * } else if (condition) {
        *  statement
        * }
        * ...
        * } else if (condition) {
        *  statement
        * }
        * 
        * (4)
        * if (condition) {
        *  statement
        * } else if (condition) {
        *  statement
        * }
        * ...
        * } else if (condition) {
        * } else {
        *  statement
        * }
        * 
        * 
        * 
        * Notes:
        * 
        * (1) Dead code
        * - code that is written but never will be executed
        * - Though it's only a warning, it's good practice to avoid dead code to keep the program clean.
        * Example:
        * - if (false) { // This block will never be executed } 
        * 
        * (2) This is an error in Java
        * if (boolean var = true) {
        *  statement
        * }
        * Explanation:
        * - you cannot declare and initialize a boolean variable inside an if condition.
        * - Java expects a boolean expression (something that evaluates to true or false)
        *   inside the parentheses of the if statement.
        *  
        */

    public static void main(String[] args) {
        System.out.println();

        if (1 > 0) {
            System.out.println("1 > 0 condition is true");
        }
    }
    
}
