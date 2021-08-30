import java.util.Scanner;

public class Condicao {

    public void condicao(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println(num);

        while(num != 1){
            if(num%2 == 0){
                num /= 2;
                System.out.println(num);
            }else{
                num = (num*3) + 1;
                System.out.println(num);
            }
        }

    }
    
}
