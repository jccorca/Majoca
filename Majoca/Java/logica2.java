import java.util.Scanner;
public class logica2 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
double peso, gramosalimento;
int opcion;
System.out.println("1 Para 5kg");
System.out.println("2 Para 10kg");
System.out.println("4 Para 20kg");
System.out.println("5 Para 30kg");
System.out.println("6 Para 40kg");
System.out.println("7 Para 50kg");
System.out.println("Seleccione una opción");
opcion= leer.nextInt();
switch (opcion)
{
case 1:
System.out.println("Debe consumir 90-120 g");
break;
case 2:
System.out.println("Debe consumir 150-190 g");
break;
case 3:
System.out.println("Debe consumir 260-330 g");
break;
case 4:
System.out.println("Debe consumir 360-450 g");
break;
case 5:
System.out.println("Debe consumir 450-550 g");
break;
case 6:
System.out.println("Debe consumir 750-900 g");
break;
}
}
}