import java.util.Scanner;
public class logica3 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int meses;
int dinero_agregado = 5000;
System.out.println("Ingrese su dinero");
dinero_agregado= leer.nextInt();
System.out.println("Ingrese cuantos meses lleva en el plan");
meses= leer.nextInt();
if (meses >= 6) {
if (dinero_agregado >= 5000) {
System.out.println("Sube al plan Dops");
} else {
System.out.println("No cumple con el dinero requerido");
}
} else {
System.out.println("No cumple con los 6 meses");
}
}
}