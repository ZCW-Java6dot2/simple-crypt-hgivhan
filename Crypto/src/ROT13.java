import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private Character cs;
    private Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
        cs = 'a';
        cf = 'n';
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'm'){
                ch+= 13;
            } else if(ch >= 'A' && ch <= 'M'){
                ch+=13;
            } else if (ch >= 'n' && ch <= 'z'){
                ch-=13;
            } else if (ch >= 'N' && ch <= 'Z'){
                ch-=13;
            }
           sb.append(ch);
        }
        return sb.toString();
    }
//        int difference = 26 - (cf - cs);
//        char[] charArray = text.toCharArray();
//        int index = 0;
//        for (char c : charArray) {
//            if (c >= 65 && c <= 90) {
//                else if (c >= 97 77 <= 122)
// ASCII - https://www.programiz.com/java-programming/examples/alphabet#:~:text=In%20Java%2C%20the%20char%20variable,z%20is%20stored%20as%20122


    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int startIndex = 0;
        StringBuilder sb = new StringBuilder();
        //String result = "";
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++){
            if (str[i] == c){
                startIndex = i; // set start index to 'c'
            }
        }
        //loop thru and fill first half of string with last bit of array
        for (int i = startIndex; i < str.length; i++){
            sb.append(str[i]);
        }

        for(int i = 0; i <startIndex; i++){
            sb.append(str[i]);

        }
        //loop thru and fill last half part of array

        return sb.toString();
    }

}
