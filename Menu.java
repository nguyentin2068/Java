import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList {
    Scanner sc = new Scanner(System.in);
    public int getUserChoice(){
        for (int i=0; i<this.size(); i++){
            System.out.println((i+1) + "- " + this.get(i));
        }
        System.out.print("Choose option:");
        return Integer.parseInt(sc.nextLine());
    }
}
