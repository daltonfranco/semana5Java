public class Fatorial {
    public void fatorial(int h){
        int x = 1;
        long fat  = 1L;

        while(x <= h){
            fat *= x;
            x++;
        }
        System.out.println("O fatorial do numero " + h + " é igual a: " + fat);

        if(fat < 0){
            System.out.println("Error");
        }else{
            System.out.println("Existe esse fatorial");
        }
    }
}
