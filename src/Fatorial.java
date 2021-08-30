public class Fatorial {
    public void fat(int x){

        int h = 1;
        long fat = 1L;

        while(h <= x){
            fat *= h;
            h++;
        }

        if(fat < 0){
            System.out.println("Error --> O fatorial do numero " + x + " não é suportado pelo programa");
        }else{
            System.out.println("O fatorial do numero " + x + " é igual a: " + fat);
        }


    }
}
