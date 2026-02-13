import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class EmailsUnicos
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<String> emails = new HashSet<String>();
        int n;
        do {
            System.out.println(" MENU ");
            System.out.println("1.Inserta un Email nuevo: ");
            System.out.println("2.Mostrar los E-Mails Registrados: ");
            System.out.println("3.Comprobar si un e-Mail está registrado: ");
            System.out.println("0.Salir: ");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Ingresa el email: ");
                    String email = sc.nextLine();
                    emails.add(email);
                    if (emails.contains(email)) {
                        System.out.println("El email esta registrado");
                    }
                    break;
                case 2:
                    System.out.println("Estos son los mails registrados: " + emails);
                    break;
                case 3:
                    System.out.println("Introduce el e-mail a comprobar: ");
                    email = sc.nextLine();
                    if (emails.contains(email)) {
                        System.out.println("El email esta registrado");
                    } else
                        System.out.println("El e-mail no esta registrado");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        }
            while (n != 0) ;
            sc.close();

    }
}