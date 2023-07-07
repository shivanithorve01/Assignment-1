import java.util.BitSet;

public class BloomFilter 
{
    private static final int FILTER_SIZE = 10000;
    private BitSet bloomFilter = new BitSet(FILTER_SIZE);

    public boolean checkWord(String word) 
    {
        int[] hashValues = HashCalculator.calculateMD5Hash(word);
        for (int hashValue : hashValues) 
        {
            if (!bloomFilter.get(Math.abs(hashValue % FILTER_SIZE))) 
                return false;
        }
        return true;
    }

    public void addWordToFilter(String word)
    {
        int[] hashValues = HashCalculator.calculateMD5Hash(word);
        for (int hashValue : hashValues) 
        {
            bloomFilter.set(Math.abs(hashValue % FILTER_SIZE), true);
        }
    }
}
