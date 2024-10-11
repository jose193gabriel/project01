import java.util.*;
public class AplicacionRatones{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ratones raton1 = new Ratones("Ratón 1");
        Ratones raton2 = new Ratones("Ratón 2");
        System.out.print("Ingresa la tasa de crecimiento para el Ratón 1 (%): ");
        double tasa1=scan.nextDouble();
        raton1.setTasaCrecimiento(tasa1);
        System.out.print("Ingresa la tasa de crecimiento para el Ratón 2 (%): ");
        double tasa2=scan.nextDouble();
        raton2.setTasaCrecimiento(tasa2);
        for (int i=1;i<=5;i++){
            System.out.println("Día "+i);
            raton1.crecerUnDia();
            raton2.crecerUnDia();
            raton1.mostrarDatos();
            raton2.mostrarDatos();
        }
    }
}
         
