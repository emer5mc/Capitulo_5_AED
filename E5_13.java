import java.util.Scanner;


public class E5_13{  

    private int suma=0;

    public static void main(String[]arg) {

        int n, m;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un entero n: ");
        n=input.nextInt();
        System.out.print("Ingrese un entero m: ");
        m=input.nextInt();

        E5_13 recursividad = new E5_13();
        recursividad.Multiplicar(n, m, 0);
    }


    public void Multiplicar(int n, int m, int w){
        if (w<m){
            suma=suma+n;
            w++;
            Multiplicar(n,m,w);
        }else{
            System.out.println("El producto es "+suma);
        }



    }
}