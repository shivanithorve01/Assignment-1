import java.util.Scanner;

public class Main 
{
    
    //Driver Code
    public static void main(String[] args) 
    {
        BloomFilter bloomFilter = new BloomFilter();
        DictionaryLoader.loadDictionary(bloomFilter,"wordlist.txt");

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
}