import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        //Declaramos las variables

        int numMayor , numMaxIntentos , azarNumero , numUsuario ,  intentos = 0, partidasJugadas = 0 , partidasGanadas = 0 , partidasPerdidas = 0;
        char respuesta1 , respuesta1Mayus , respuesta2 , respuesta2Mayus;

        System.out.println("            _  _         _                       _                                             \n" +
                "           | |(_)       (_)                     | |                                            \n" +
                "  __ _   __| | _ __   __ _  _ __    __ _    ___ | |  _ __   _   _  _ __ ___    ___  _ __  ___  \n" +
                " / _` | / _` || |\\ \\ / /| || '_ \\  / _` |  / _ \\| | | '_ \\ | | | || '_ ` _ \\  / _ \\| '__|/ _ \\ \n" +
                "| (_| || (_| || | \\ V / | || | | || (_| | |  __/| | | | | || |_| || | | | | ||  __/| |  | (_) |\n" +
                " \\__,_| \\__,_||_|  \\_/  |_||_| |_| \\__,_|  \\___||_| |_| |_| \\__,_||_| |_| |_| \\___||_|   \\___/ \n" +
                "      ....:::ISAIAS SEGURA BERNA:::.......:::ADIVINA EL NUMERO:::....                                                                             \n" +
                "                                                                                               ");



            do {
                System.out.println("-------------------------------------------------------");
                System.out.println("ADIVINA EL NÚMERO");
                System.out.println("-------------------------------------------------------");


                do {
                    System.out.print("Introduce el numero máximo a adivinar(1 Minimo): ");
                    numMayor = sc.nextInt();
                } while (numMayor <= 0);

                do {
                    System.out.print("Introduzca el numero máximo de intentos(1 Minimo): ");
                    numMaxIntentos = sc.nextInt();
                } while (numMaxIntentos<=0);


                do {
                    partidasJugadas++;
                    azarNumero = rnd.nextInt(1 , numMayor + 1);

                    System.out.println("Adivina el numero entre 1 y " + numMayor + ". Tienes " + numMaxIntentos + " intentos");
                    System.out.println();

                    do {
                        intentos++;
                        if (intentos != numMaxIntentos) {
                            System.out.print("Intento " + intentos + " : ");
                            numUsuario = sc.nextInt();
                            System.out.println(" ");
                        } else {
                            System.out.print("Ultimo intento " + intentos + " : ");
                            numUsuario = sc.nextInt();
                            System.out.println(" ");
                        }



                        if (numUsuario < azarNumero) {
                            System.out.println("Mas alto");

                        } else if (numUsuario > azarNumero) {
                            System.out.println("Mas bajo");

                        } else {
                            System.out.println("Lo has acertado!!!!");
                            partidasGanadas++;
                        }

                        sc.nextLine();


                    }while (intentos<numMaxIntentos && numUsuario != azarNumero);

                    intentos = 0;

                    if (numUsuario != azarNumero) {
                        System.out.println("Has perdido!! El numero era el " + azarNumero);
                        partidasPerdidas++;
                    }

                    System.out.println(" ");
                    System.out.println("Partidas jugadas: " + partidasJugadas + " - Ganadas -> " + partidasGanadas + " Perdidas -> " + partidasPerdidas);
                    System.out.println(" ");

                    //primera pregunta
                    System.out.print("Volver a jugar (S/N)?: ");
                    respuesta1 = sc.next().charAt(0);
                    respuesta1Mayus = Character.toUpperCase(respuesta1);
                    if (respuesta1Mayus == 'N') {
                        System.out.println("Fin del juego espero que te haya gustado");
                        System.exit(0);

                    }

                    //Segunda pregunta
                    System.out.print("Modificar la configuracion del juego (S/N)?: ");
                    respuesta2 = sc.next().charAt(0);
                    respuesta2Mayus = Character.toUpperCase(respuesta2);

                } while (respuesta2Mayus == 'N');
            } while (respuesta2Mayus == 'S');









    }
}