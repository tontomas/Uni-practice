import java.util.Scanner;
public class TablaMultiplicar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Porfavor, ingresa un número: ");
        int multiplos = sc.nextInt();
        System.out.print("Porfavor ingresa la cantidad de múltiplos: ");
        int multiplicando = sc.nextInt();
        int sumaTotal = 0;
        
        for (int i = 1; i <= multiplicando; i++) {
            int resultado = i * multiplos;
            sumaTotal += resultado;
            System.out.println(multiplos + " * " + i + " = " + resultado );
        }
        
        System.out.print("Suma total: " + sumaTotal);
    }
}
