package com.company;

public class Main {
    // Returns true if n is even, else odd
    static boolean isEven(int n)
    {
        // n&1 is 1, then odd, else even
        // return ((n & 1)!=1);
        // return ((n ^ 1) == n + 1);
        return ((n | 1) > n);
    }
    // The same function is used to encrypt and
    // decrypt
    static String encryptDecrypt(String inputString)
    {
        char xorKey = 'P';

        // Define String to store encrypted/decrypted String
        String outputString = "";

        // perform XOR operation of key
        // with every character in string
        for (int i = 0; i < inputString.length(); i++)
        {
            outputString += Character.toString(inputString.charAt(i) ^ xorKey);
        }
        System.out.println(outputString);
        return outputString;
    }

    public static void main(String[] args)
    {
        String sampleString = "Welome to KSHRD Center";

        // Encrypt the string
        System.out.println("Encrypted String");
        String encryptedString = encryptDecrypt(sampleString);

        // Decrypt the string
        System.out.println("Decrypted String");
        encryptDecrypt(encryptedString);

        // n is the number to test
        int n = 100;
        System.out.print(isEven(n) == true ? "Even" : "Odd");
    }
}