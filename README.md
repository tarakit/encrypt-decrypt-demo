
# Bitwise, Encrypt Decrypt Demo

There're 2 methods isEvent and encryptDecrypt.
## Method Definition

`static boolean isEven(int n)` returns true if n is even, else odd

## isEvent(int n)

```bash
 static boolean isEven(int n)
    {
        // n&1 is 1, then odd, else even
        // return ((n & 1)!=1);
        // return ((n ^ 1) == n + 1);
        return ((n | 1) > n);
    }
```

this method use to find odd or even number

- ((n & 1)!=1)
- ((n ^ 1) == n + 1)
- ((n | 1) > n)

All of them equal to (n % 2) == 0

`static String encryptDecrypt(String inputString)` the same function is used to encrypt and decrypt

```bash
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
```

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

