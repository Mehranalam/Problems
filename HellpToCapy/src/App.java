import java.util.Scanner;

// this URL problem : https://quera.ir/problemset/contest/8838/
// solve with functional programming ...

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputCapy = new Scanner(System.in);
        String count = inputCapy.nextLine();
        String[] splitData = count.split(" ");
        
        int countOfCopy = Integer.parseInt(splitData[0]);
        
        String text = "";
        
        int n = 0;
        do {
            text = text + "copy of ";
            n++;
        } while (n < countOfCopy);

        System.out.println(text+splitData[1]);
    }
}
