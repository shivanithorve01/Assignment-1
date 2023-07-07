import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryLoader 
{
    public static void loadDictionary(BloomFilter bloomFilter, String fileName) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                bloomFilter.addWordToFilter(line);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
