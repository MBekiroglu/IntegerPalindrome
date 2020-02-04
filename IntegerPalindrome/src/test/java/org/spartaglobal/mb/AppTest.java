package org.spartaglobal.mb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {
    Palindrome palindrome = new Palindrome();


    @Test
    public void check121IsAPalindrome() {
        assertEquals(true, palindrome.checker(121));
    }

    @Test
    public void checkThatNotATruePalindromeReturnsFalse() {
        assertEquals(false, !palindrome.checker(121));
    }

    @Test
    public void check123IsNotAPalindrome() {
        assertEquals(false, palindrome.checker(123));
    }

    @Test
    public void checkSingleDigitsWork() {
        assertEquals(true, palindrome.checker(1));
    }

    @Test
    public void checkLongValuesWork() {
        assertEquals(true, palindrome.checker(1234554321));
    }

    @Test
    public void checkTenDigitValuesWork() {
        assertEquals(false, palindrome.checker(1234567891));
    }

    @Test
    public void checkOddNumbers() {
        assertEquals(true, palindrome.checker(131));
    }

    @Test
    public void checkEvenNumbers() {
        assertEquals(true, palindrome.checker(222));
    }

    @Test
    public void checkHugeNumbers() {
        assertEquals(false, palindrome.checker(Integer.MAX_VALUE));
    }

    @Test
    public void checkNumbersOutTheBoundaries() {
        assertEquals(false, palindrome.checker(Integer.MAX_VALUE + 90000));
    }
}
