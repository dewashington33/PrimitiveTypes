public class App {
    public static void main(String[] args) throws Exception {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 50000L + 10 * (b + s + i);
        System.out.println(l);

        // now lets do the same but with a short
        short s2 = (short) (1000 + 10 * (b + s + i));
        System.out.println(s2);

        System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        // Challenge
        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;
        float myOtherFloatValue = (float) 5.25; // or 5.25f, you could also just put an f at the end of the number
        double myOtherDoubleValue = 5.25;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("myOtherFloatValue = " + myOtherFloatValue);
        System.out.println("myOtherDoubleValue = " + myOtherDoubleValue);

        // Division
        myIntValue = 5 / 2;
        System.out.println("myIntValue = " + myIntValue);
        myFloatValue = 5f / 2f;
        System.out.println("myFloatValue = " + myFloatValue);
        myDoubleValue = 5d / 2d;
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Challenge
        // 1. create a variable with the appropriate type to store the number of pounds
        // to be converted to kilograms
        // 2. calculate the result i.e. the number of kilograms based on the contents of
        // the variable above and store the result in a 2nd appropriate variable
        // 3. print out the result

        // one pound is equal to 0.45359237 kilograms
        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");

        // char and boolean
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myDecimalChar = 68;
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myDecimalChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        System.out.println(isCustomerOverTwentyOne);

        // String
        String myString = "This is a string";
        System.out.println(myString);
        String myOtherString = "I wish I had a \u00241,000,000.00";
        System.out.println(myOtherString);

        // Operators
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // Abreviating operators
        result = 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        result -= 1; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

    }
}
