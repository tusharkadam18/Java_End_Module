import java.io.*;
public class IOFileTest {
    public static void main(String[] args) throws Exception {
        PrintWriter dest = new PrintWriter(new FileWriter("IOFileTest.txt"));
        PrintWriter newdest = new PrintWriter(new FileWriter("Result.txt"));
        BufferedReader source = new BufferedReader(new FileReader("E:\\JAVA_PROG\\Java End Module\\src\\IOFileTest.java"));
        String line = source.readLine();
        int count_line = 0, count_word = 0, count_char = 0, count_vowel = 0;
        while (line!=null){
            dest.println(line);
            count_line++;
            String[] arr = line.split(" +");
            count_word = count_word + arr.length;
            String[] arr1 = line.split("");
            count_char = count_char+ arr1.length;
            for (String s : arr) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                        count_vowel ++;
                    }
                    if (s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                        count_vowel ++;
                    }
                }
            }
            line = source.readLine();
        }
        newdest.println("The Number of Line in the code are: " + count_line);
        newdest.println("The number words in the code are : " + count_word);
        newdest.println("The number of characters in the code are: " + count_char);
        newdest.println("The Number of vowels in the code are: " + count_vowel);
        newdest.println("Name: Tushar Sugriv Kadam");
        newdest.println("Roll number: 220950320059");
        newdest.close();
        source.close();
        dest.close();
    }
}