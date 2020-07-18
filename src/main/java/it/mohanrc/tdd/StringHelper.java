package it.mohanrc.tdd;

public class StringHelper {

    public String swapLast2Character(String input) {

        /*
        * Swap last two characters of a string
        * If the input is A/null/empty then it should return the same input
        * */

        //All Fail
        /*return null;*/

        //Refactor 1
        //Passing Test Case 1
        /*char firstChar = input.charAt(0);
        char secondChar = input.charAt(1);
        return ""+secondChar+firstChar;*/

        //Refactor 2
        //Passing Test Case 1, 2
        /*int length = input.length();
        String str = input.substring(0, length-2);
        char firstChar = input.charAt(length-2);
        char secondChar = input.charAt(length-1);
        return str+secondChar+firstChar;*/

        //Refactor 3
        //Passing Test Case 1, 2, 3, 4
        /*int length = input.length();
        if(length > 1) {
            String str = input.substring(0, length-2);
            char firstChar = input.charAt(length-2);
            char secondChar = input.charAt(length-1);
            return str+secondChar+firstChar;
        }
        return input;*/

        //Refactor 4
        //Passing Test Case 1, 2, 3, 4, 5
        if(input != null && input.length() > 1) {
            int length = input.length();
            String str = input.substring(0, length-2);
            char firstChar = input.charAt(length-2);
            char secondChar = input.charAt(length-1);
            return str+secondChar+firstChar;
        }
        return input;
    }

    public String removeSpecificCharacterInFirstTwoPosition(String input, String characterToRemove) {
        /*
         * Remove the first two position from the given string which are matched with specific character
         * If the input is BBLA/A/null/empty then it should return the same input
         * */

        //All Fail
        /*return null;*/

        //Refactor 1
        //Passing Test Case 1, 2, 5, 6
        /*return input.replace(characterToRemove, "");*/

        //Refactor 2
        //Passing Test Case 1, 2, 3, 4
        /*String firstTwoChar = input.substring(0, 2);
        String lastTwoChar = input.substring(2);
        return firstTwoChar.replace(characterToRemove, "")+lastTwoChar;*/

        //Refactor 3
        //Passing Test Case 1, 2, 3, 4, 5, 6
        /*if(input.length() > 2) {
            String firstTwoChar = input.substring(0, 2);
            String lastTwoChar = input.substring(2);
            return firstTwoChar.replace(characterToRemove, "")+lastTwoChar;
        } else {
            return input.replace(characterToRemove, "");
        }*/

        //Refactor 4
        //Passing Test Case 1, 2, 3, 4, 5, 6, 7
        if(input == null) return input;
        if(input.length() > 2) {
            String firstTwoChar = input.substring(0, 2);
            String lastTwoChar = input.substring(2);
            return firstTwoChar.replace(characterToRemove, "")+lastTwoChar;
        } else {
            return input.replace(characterToRemove, "");
        }
    }
}
