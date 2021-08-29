import java.util.Scanner;

public class Condicao {
    public void cond(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num);

        while(num != 1){
            if(num%2 == 0){
                num /= 2;
                System.out.println(num);
            }else{
                num = (3 * num) + 1;
                System.out.println(num);
            }
        }
    }
}
