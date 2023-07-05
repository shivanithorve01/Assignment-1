import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCodeLines {
    public static void main(String[] args) throws Exception {

        String fileName = "C:/Users/Z004TU1V/Documents/New folder/Count code lines/CountCodeLines/src/Test.java"; // Java file
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            String line;
            boolean insideCommentBlock = false;
            
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                
                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }
                
                if (insideCommentBlock) {
                    if (line.contains("*/")) {
                        insideCommentBlock = false;
                    }
                    continue; // Skip lines inside comment blocks
                }
                
                if (line.startsWith("//")) {
                    continue; // Skip single-line comments
                }
                
                if (line.startsWith("/*")) {
                    if (!line.contains("*/")) {
                        insideCommentBlock = true;
                    }
                    continue; // Skip lines starting a comment block
                }
                
                lineCount++;
            }
            
            System.out.println("Number of lines of code: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


