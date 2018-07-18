package com.Catalin;

public class Main {

    public static void main(String[] args) {

        //width of 16 (2 bytes)
        char myChar = 's';
        char mySecondChar = '\u00A9'; //this is only one character, unicode.
        /** Char can be a number, letter, special character or unicode character.
         * https://unicode-table.com/en/
         * Char does not accept two elements.
         * Char is defined between single quotes.
         */
        System.out.println("Unicode output was: " + mySecondChar);

        boolean myBoolean = false;
        boolean isMale = true;
        /** Booleans only accept 2 values, true and false.
         */

        //Challenge
        char myRegistered = '\u00AE';
        System.out.println("Unicode output was: " + myRegistered);
    }
}
