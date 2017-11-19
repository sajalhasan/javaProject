/*
 *Number of vowels in String
 */
package String;
public class Task_07 {
     public static int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
       return count;
    }
    public static void main(String[] args) {
        String str="i am  a good boy";
        System.out.println("Number of Vowel: "+(count(str)+1));
    }
}
