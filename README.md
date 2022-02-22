
# Bitwise, Encrypt Decrypt Demo

There're 2 methods isEvent and encryptDecrypt.
## Method Definition

`static boolean isEven(int n)` returns true if n is even, else odd

`static String encryptDecrypt(String inputString)` the same function is used to encrypt and decrypt

## Testing

Test the demo follow by the code below,
If you XOR the string 2 times with the same key, you will get the old string back.

```bash
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
```

