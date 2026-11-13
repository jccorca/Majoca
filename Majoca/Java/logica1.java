import java.util.Scanner;
public class logica1 {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
String usuarioCorrecto = "user1";
String contraseñaCorrecta = "87654321";
String usuario, contraseña;
int intentos = 0, intentosmax = 3;
while (intentos < intentosmax) {
System.out.println("Ingrese su usuario");
usuario = leer.next();
System.out.println("Ingrese su contraseña");
contraseña = leer.next();
if (usuario.equals(usuarioCorrecto) &&

contraseña.equals(contraseñaCorrecta))

{
System.out.println("Ha iniciado sesión exitosamente");
}
else
{
intentos++;
int intentos_restantes = intentosmax - intentos;
if (intentos_restantes > 0)
{
System.out.println("Usuario o contraseña incorrectos, le quedan:" +intentos_restantes+ "intentos .\n");

}
else
{
System.out.println("Sistema bloqueado, has agotado tus tres intentos");
}
}
}
}
}