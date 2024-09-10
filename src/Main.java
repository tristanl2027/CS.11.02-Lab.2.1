/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tristan Lui
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String morning) {
        String morningGreeting = "Toby Fox";
        return "早上好, " + morning + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String afternoon) {
        String afternoonGreeting = "Mac Miller";
        return "下午好, " + afternoon + "!";
    }

    // 5. triple
    public static String triple(String oohbaby) {
        return oohbaby + oohbaby + oohbaby;
    }

    // 6. half
    public static Double half(int a) {
        return a / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(Double a) {
        return (int) (a + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(Double a) {
        return (int) (a - 0.5);
    }
}
