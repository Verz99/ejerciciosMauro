import java.util.Scanner;

public class condicionalesMaurito {
    public static void main(String[] args) {
        /*
         1. Pedirle la vida del personaje al usuario. Mostrar
            un mensaje en la consola que indique si la vida ingresada
            es positiva, negativa o igual a cero.
        */
//        System.out.printf("Ingrese la vida de su personaje:");
        Scanner input1 = new Scanner(System.in);
//        int vida = 0;
//        vida = input1.nextInt();
//
//        if (vida > 0){
//            System.out.println("Tu vida es mayor a cero");
//        }
//            else if (vida == 0){
//            System.out.println("Tu vida es cero... anda al medico");
//        } else if (vida < 0) {
//            System.out.println("Tu vida esta en negativo. Mandale saludos a San pedro");
//        }

//        int num1 = 15;
//        int numIngresado = 0;
//
//        System.out.println("Ingresa un número ");
//        numIngresado = input1.nextInt();
//
//         if (num1 == numIngresado){
//             System.out.println("Tus números son iguales");
//         } else if (num1 > numIngresado) {
//             System.out.println("Tu numero es menor a "+ num1);
//         } else if (num1 < numIngresado) {
//             System.out.println("Tu numero es mayor a "+ num1);
//         }else {
//             System.out.println("Capo pone un número no es tan difícil");
//         }


        /*
        Pedirle dos números al usuario: La vida del
        jugador y la vida del enemigo. Mediante un mensaje en
        consola, indicar cuál es la vida más grande y cuál es la
        vida más chica (o si son iguales).
        */
        int personajeprincipal = 0;
        int enemy = 0;

        System.out.println("Ingrese la vida del personaje principal: ");
        personajeprincipal = input1.nextInt();
        System.out.println("Ingrese la vida del enemigo: ");
        enemy =input1.nextInt();

        if (personajeprincipal > enemy){
            System.out.println("Personaje principal tiene más vida" );
        }
        if (personajeprincipal < enemy){
            System.out.println("Enemigo tiene más vida");
        }
        if (personajeprincipal == enemy){
            System.out.println("Su vida están equiparadas");
        }








    }
}
