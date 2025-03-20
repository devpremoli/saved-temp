package controlstatements.decisionmakingstatements;

public class SwitchStatement {

    /*
     * Explanation:
     * - switch statement is used to execute one block of code out of multiple options 
     *   based on the value of a variable.
     * - an alternative to using multiple if-else-if conditions, 
     *   especially when you are checking the same variable for different values.
     * 
     * 
     * Notes:
     * - switch expression must be of byte, short, char, int, long (also their Wrapper type), enums or String.
     * - switch statement is fall-through. It means it executes all statements after the first match if 
     *   a break statement is not present.
     * - default keyword is used to specify a code block when no case value is matched. The default keyword is optional, 
     *   but it should be used in the switch case statement.
     * 
     * Syntax:
     * switch (expression) {
     *     case value1:
     *         // action to be executed if expression equals value1
     *         break; // exit the switch statement after executing the matched case
     *     case value2:
     *         // action to be executed if expression equals value2
     *         break;
     *     // Add as many cases as needed for other possible values
     *     default:
     *         // action to be executed if none of the cases match
     * }
     */
    public static void main(String[] args) {

        // Example 1: Using switch with int
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is unknown");
        }

        // Example 2: Using switch with String
        String day = "Tuesday";
        switch (day) {
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            default:
                System.out.println("Unknown day");
        }

        // Example 3: Using switch with enum
        Day today = Day.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Unknown day");
        }
    }

    // Enum definition for days of the week
    enum Day {
        MONDAY, WEDNESDAY, FRIDAY
    }        
    
}
