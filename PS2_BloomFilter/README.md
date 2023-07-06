# **BloomFilter**

The `BloomFilter` Java class provides functionality to read a dictionary of words from a text file, construct a Bloom filter using MD5 hash functions, and check whether a given word exists in the dictionary using the Bloom filter.

### Class Overview

```java
public class BloomFilter
```

### Methods

1. `public static void main(String[] args)`

   - Description: The main method of the class where the program execution starts.
   - Usage: It demonstrates how to use the Bloom filter to check if a word exists in the dictionary.
   - Parameters: `args` - Command-line arguments (not used in this implementation).

2. `private void loadDictionary(String fileName)`

   - Description: Reads words from the specified text file and adds them to the Bloom filter.
   - Usage: The method is called in the main method to populate the Bloom filter with dictionary words.
   - Parameters:
     - `fileName` - A string representing the path of the text file containing dictionary words.

3. `private void addWordToFilter(String word)`

   - Description: Adds a word to the Bloom filter.
   - Usage: The method is called by `loadDictionary` to add individual words to the Bloom filter.
   - Parameters:
     - `word` - A string representing the word to be added to the Bloom filter.

4. `private boolean checkWord(String word)`

   - Description: Checks if a word exists in the dictionary using the Bloom filter.  
     This function checks if a word exists in the Bloom filter. It calculates the MD5 hash values of the word and checks the corresponding bits in the bloomFilter array. If any of the bits are false, it means the word is definitely not in the filter, and it returns false. If all the bits are true, it returns true, indicating that the word may or may not be in the filter
   - Usage: The method is called in the main method to check whether a word exists in the dictionary.
   - Parameters:
     - `word` - A string representing the word to be checked.

5. `private int[] calculateMD5Hash(String input) throws NoSuchAlgorithmException`

   - Description: Calculates the MD5 hash values for a given input string.
   - Usage: The method is used internally to compute hash values for words being added to the Bloom filter.  
     The input string is converted to bytes, and the MD5 algorithm updates the digest with these bytes. The resulting digest is then split into four 32-bit integers, which are returned as the hash values.
   - Parameters:
     - `input` - A string for which the MD5 hash needs to be calculated.
   - Returns: An array of four integers representing the MD5 hash values.

***
<br/>

## **Bloom Filter Principle**

A Bloom filter is a space-efficient probabilistic data structure used to test the membership of an element in a set. It trades off accuracy for memory efficiency. The Bloom filter is initialized with a bit array of fixed size (`FILTER_SIZE` in this implementation), and multiple hash functions are used to set bits in the array for each word added to the filter.

### **Usage**

1. Place the `wordlist.txt` file in the same directory as the Java source file (`BloomFilter.java`).

2. Compile the Java source file using the command:
   ```
   javac BloomFilter.java
   ```

3. Run the Java program using the command:
   ```
   java BloomFilter
   ```

4. The program will ask for user input for a new word. Enter the new word in a string format.

    ```
   Enter a word to check if it already exists in the dictionary :   
   ```

5. The program will read the words from the "wordlist.txt" file, construct the Bloom filter, and then check if the specified word exists in the dictionary using the Bloom filter.


6. The program will display the result on the console. If the word is found in the dictionary (possibly with false positives), it will print:

   ```
   "Word : [wordToCheck] may exists in the dictionary"
   ```

   Otherwise, it will print:

   ```
   "Word : [wordToCheck] does not exists in the dictionary"
   ```

   ### Output

      ![image](https://github.com/shivanithorve01/Assignment-1/assets/81226536/3f8f8438-08cc-404c-8cac-3851dfbeb7d8)
 

 
