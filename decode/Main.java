import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(decode("mer" ,6015));
    }

    public static String decode(String letters , int decodepattern){
        String lettersWord = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> splitData = new ArrayList<String>();
        String[] data = lettersWord.split("");
        for (int i = 0;i < data.length;i++){
            splitData.add(data[i]);
        }
        String decode = "";
        for (String i:
                letters.split("")) {
            int pattern = splitData.indexOf(i) * decodepattern % 26;
            decode += splitData.get(pattern);
        }

        return decodepattern + decode;
    }


}
