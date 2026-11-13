import java.util.Scanner;
public class logica4 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
String tamaño;
double descuento,precio_por_noche = 0.0, subtotal = 0.0, totalfinal = 0.0;
int noches;
System.out.println("Ingrese el tamaño de su perro pequeño/mediano/grande");
tamaño = leer.next();
System.out.println("Ingrese el número de noches por hospedaje");
noches = leer.nextInt();
switch (tamaño)
{
case "pequeño":
precio_por_noche = 45000.0;
break;
case "mediano":
precio_por_noche = 55000.0;
break;
case "grande":
precio_por_noche = 65000.0;
break;
default:
System.out.println("Tamaño no válido, ingrese un tamaño de las tres opciones");

precio_por_noche = 0.0;
}
subtotal=precio_por_noche*noches;
totalfinal=subtotal;
if (noches>7)
{
descuento = subtotal * 0.10;
totalfinal = subtotal - descuento;
System.out.println("Se aplicó un 10% del descuento por estadía mayor");
}
System.out.println("Cotizaciones: ");
System.out.println("Precio base por noche: "+precio_por_noche);
System.out.println("Subtotal: "+subtotal);
System.out.println("Valor total a pagar: "+totalfinal);
}
}