import java.util.Scanner;

public class Ordem {

    public void mult(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int x = 1;

        while(x < num+1){
            System.out.print(x*num + " ");
            x++;
        }
    }
}
