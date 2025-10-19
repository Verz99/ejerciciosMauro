import java.util.Scanner;

public class condicionales2 {
    public static void main(String[] args){
        /*
        1. Pedirle al usuario que ingrese dos números enteros
            e indicar si el primer número es divisible por el segundo.
         */
//        int num1 = 0;
//        int num2 = 0;
//        Scanner input =new Scanner(System.in);
//
//        System.out.println("Ingrese el primer número:");
//        num1 = input.nextInt();
//        System.out.println("Ingrese el segundo número:");
//        num2 = input.nextInt();
//
//            if (num1 % num2 == 0){
//                System.out.println("Se puede dividir el 1º número por el 2º");
//            }
//            else {
//                System.out.println("No se pueden dividir esos números");
//            }
        /*
        2. Ingresar un número. Indicar si el número ingresado es par o impar.
         */

//        int num1 = 0;
//        Scanner input =new Scanner(System.in);
//
//        System.out.println("Ingrese un número:");
//        num1 = input.nextInt();
//
//
//        if (num1 % 2 == 00){
//            System.out.println("Tu número es par");
//        } else {
//            System.out.println("Tu múmero es impar");
//        }

        /*
        3. Ingresar un número. Indicar si el número que se ingresó es múltiplo de 5.
         */

//        int num1 = 0;
//        Scanner input =new Scanner(System.in);
//
//        System.out.println("Ingrese un número:");
//        num1 = input.nextInt();
//
//        if (num1 % 5 == 0){
//            System.out.println("Tu número es múltiplo de 5");
//        }else {
//            System.out.println("Tu número no es múltiplo de 5");
//        }

        /*
        4.  Pedirle al usuario que ingrese la posición de 2 jugadores (pedir las coordenadas X e Y por cada jugador).
            Una vez ingresados, mediante un mensaje en la consola, informar si los jugadores se encuentran (o no) en la misma
            posición.
         */

//        int player1X=0;
//        int player1Y=0;
//        int player2X=0;
//        int player2Y=0;
//
//        Scanner input =new Scanner(System.in);
//
//        System.out.println("Ingrese la coordenada del jugador 1 eje X:");
//        player1X = input.nextInt();
//
//        System.out.println("Ingrese la coordenada del jugador 1 eje Y:");
//        player1Y = input.nextInt();
//
//        System.out.println("Ingrese la coordenada del jugador 2 eje X:");
//        player2X = input.nextInt();
//
//        System.out.println("Ingrese la coordenada del jugador 2 eje Y:");
//        player2Y = input.nextInt();
//
//        if (player1X == player2X && player1Y ==  player2Y ){
//            System.out.println("Las coordenadas de los jugadores son similares");
//        }else {
//            System.out.println("Las coordenadas no se encuentran en la misma posición");
//        }

        /*
        Pedirle al usuario que ingrese una letra e indicar
        si la letra ingresada es una vocal o una consonante.
        Vamos a dar por hecho que el usuario siempre va a
        ingresar una letra.
         */

            char letra = '\u0000';
            Scanner input =new Scanner(System.in);

            System.out.println("Ingrese una letra");
            letra = input.next().charAt(0);// No supe como hacer que me tome mayúsculas y minúsculas por igual

            if (letra == 'A'||letra == 'E'||letra == 'I'||letra == 'O'||letra == 'U'){
                System.out.println("Tu Letra es vocal");
            }else {
                System.out.println("Su letra es consonante");
            }












    }
}
