import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // pedir  Medida em M
    float m; 
    float cm;
    Scanner S =new Scanner(System.in);
    System.out.println("Insira a medida em M");
    m= S.nextFloat();
    cm= m*100;
    //Calcular m para cm (*100)
    System.out.println("resultado da conversão 'm'-'cm' = " + cm ) ;

    }
}
