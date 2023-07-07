import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalculator 
{
    public static int[] calculateMD5Hash(String input) 
    {
        try 
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();

            int[] hashValues = new int[4];
            for (int i = 0; i < 4; i++) 
            {
                int hash = 0;
                for (int j = 0; j < 4; j++) 
                {
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
