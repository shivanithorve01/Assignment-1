import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.Scanner;


public class BloomFilter 
{
    private static final int FILTER_SIZE = 10000; // Size of the Bloom filter bit array
    private BitSet bloomFilter = new BitSet(FILTER_SIZE);
    
    //Driver Code
    public static void main(String[] args) 
    {
        BloomFilter bloomFilter = new BloomFilter();
        bloomFilter.loadDictionary("wordlist.txt");

        char ch;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Enter a word to check if it already exists in the dictionary : ");
                String wordToCheck = input.next(); 
                boolean existsInDictionary = bloomFilter.checkWord(wordToCheck);

                if(existsInDictionary)
                    System.out.println("Word : " + wordToCheck + " may exists in the dictionary");
                else
                    System.out.println("Word : " + wordToCheck + " does not exists in the dictionary");
                

                System.out.print("\nDo you want to continue ? (Type y or n) :\n");
                ch = input.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
        input.close();
    }
    //Reads from wordlist.txt and adds the words to bloom filter
    private void loadDictionary(String fileName) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                addWordToFilter(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Adds a single word to bloom filter
    private void addWordToFilter(String word) 
    {
        int[] hashValues = calculateMD5Hash(word);
        for (int hashValue : hashValues) {
            bloomFilter.set(Math.abs(hashValue % FILTER_SIZE), true);
        }
    }

    //Checks if word already exists in the wordlist
    private boolean checkWord(String word) 
    {
        int[] hashValues = calculateMD5Hash(word);
        for (int hashValue : hashValues) {
            if (!bloomFilter.get(Math.abs(hashValue % FILTER_SIZE))) {
                return false; // Word is definitely not in the dictionary
            }
        }
        return true; // Word may or may not be in the dictionary
    }

    //Calculates the MD5 hash values for a given input string.
    private int[] calculateMD5Hash(String input) 
    {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();

            int[] hashValues = new int[4];
            for (int i = 0; i < 4; i++) {
                int hash = 0;
                for (int j = 0; j < 4; j++) {
                    hash <<= 8;
                    hash |= (digest[i * 4 + j] & 0xFF);
                }
                hashValues[i] = hash;
            }
            return hashValues;
        } 
        catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
            return null;
        }
    }
}
 
