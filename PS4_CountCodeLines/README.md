# **[Kata13: Counting Code Lines](http://codekata.com/kata/kata13-counting-code-lines/)**

Line Counter is a Java program that counts the number of lines of code in a Java file, excluding single-line comments, multi-line comments, and blank lines.

## Table of Contents
- [Usage](#usage)
- [How it Works](#how-it-works)
- [Example](#example) 

## **Usage**

1. Ensure you have Java installed on your system.
2. Replace path of `"Test Java File.java"` in the `CountCodeLines.java` file with the path to the Java file you want to analyze.
3. Compile and run the `CountCodeLines.java` program using your preferred Java compiler or IDE.
4. The program will read the specified Java file, count the lines of code, and display the total count.

```bash
javac CountCodeLines.java
java CountCodeLines
```

## **How it Works**

The Java file is read line by line by the program using a BufferedReader. The boolean variable _insideCommentBlock_ is used to keep track of whether a user is currently inside a multi-line comment block.


1. Skip lines that are entirely blank or contain only whitespace characters.
2. Comments that begin on a single line with // are ignored.
3. The same rule applies to multi-line comments that begin with /* and end with */.
4. The program sets _insideCommentBlock_ to true for multi-line comments that begin with /* but do not terminate on the same line and skips lines until it reaches the end of the comment block.
5. All other lines are counted as code lines and are treated as such.

## **Example**

Consider a Java file named [Test.java](https://github.com/shivanithorve01/Assignment-1/blob/main/PS4_CountCodeLines/Test.java) with the following content:


    
    /*****
    This is a test program with 5 lines of code
    *  \/* no nesting allowed!
        //*****//***/// Slightly pathological comment ending...
    
    public class Test {
        public static final void main(String [] args) { // gotta love Java
                // Say hello
            System./*wait*/out./*for*/println/*it*/("Hello/*");
        }
    
        }
    

Output for [CountCodeLines.java](https://github.com/shivanithorve01/Assignment-1/blob/main/PS4_CountCodeLines/CountCodeLines.java) program run on [Test.java](https://github.com/shivanithorve01/Assignment-1/blob/main/PS4_CountCodeLines/Test.java) will give output as :

    
        Number of lines of code: 5

