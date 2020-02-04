package org.spartaglobal.mb;

public class Palindrome {


    public boolean checker(int a) {
        String reverse = "";
        for (int i = Integer.toString(a).length() - 1; i >= 0; i--) {
            reverse += Integer.toString(a).charAt(i);
        }
        return Integer.toString(a).equals(reverse);
    }
}