package com.example.task02;

public class Task02 {
    public static String solution(String input) {
        long n = Long.parseLong(input);
        if ((n <= 127) && (n>=-128)) {
            return  "byte";
        } else if ((n <= 32767) && (n>=-32768)) {
            return ("short");
        } else if ((n>= -2147483648)&&(n<=2147483647)) {
            return ("int");
        } else {
            return ( "long");
        }
    }
}


