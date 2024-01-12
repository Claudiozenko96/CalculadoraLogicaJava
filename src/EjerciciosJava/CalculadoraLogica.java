package EjerciciosJava;

import java.util.Scanner;

public class CalculadoraLogica {

    public void presentacion(){
        System.out.print(
                "\tIngrese una opcion\n" +
                        "1.Sumar\n" +
                        "2.Restar\n" +
                        "3.Dividir\n"+
                        "4.Multiplicar\n"+
                        "5.Elevado al exponente\n"+
                        "6.Raiz Cuadrada\n"+
                        "7.Raiz Cubica\n"+
                        "8.Salir\n");
        System.out.print(">>");
    }

    public void sumar(){
        int n1,n2, suma;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        System.out.print("ingrese el 2do nro: ");
        n2 = in.nextInt();
        suma = n1 + n2;
        System.out.println("El valor de la suma es: " + suma +"\n");
    }

    public void restar(){
        int n1,n2, resta;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        System.out.print("ingrese el 2do nro: ");
        n2 = in.nextInt();
        resta = n1 - n2;
        System.out.println("El valor de la Resta es: " + resta +"\n");
    }

    public void dividir(){
        float n1,n2, dividir;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        System.out.print("ingrese el 2do nro: ");
        n2 = in.nextInt();
        dividir = n1 / n2;
        System.out.println("El valor de la Resta es: " + dividir +"\n");
    }

    public void multiplicar(){
        int n1,n2, multiplicacion;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        System.out.print("ingrese el 2do nro: ");
        n2 = in.nextInt();
        multiplicacion = n1 * n2;
        System.out.println("El valor de la Resta es: " + multiplicacion +"\n");
    }


    public void exponente(){
        int n1,elevacion,exponente;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        System.out.print("ingrese el numero que quieres elevar: ");
        elevacion = in.nextInt();
        exponente = (int) Math.pow(n1, elevacion);
        System.out.println("El valor de " + n1 + " elevado a " + elevacion + " es " + exponente +"\n");
    }

    public void raizCuadrada(){
        double n1, raizCuadrada;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        raizCuadrada = Math.sqrt(n1);
        System.out.println("El valor de la Raiz cuadrada de " + n1 + " es: "+ raizCuadrada +"\6n");
    }

    public void raizCubica(){
        double n1, raizCubica;
        Scanner in = new Scanner(System.in);
        System.out.print("ingrese el 1er nro: ");
        n1 = in.nextInt();
        raizCubica = Math.cbrt(n1);
        System.out.println("El valor de la Raiz cubica de " + n1 + " es: "+ raizCubica +"\n");
    }



    public static void main(String[] args) {
        CalculadoraLogica  calculadora = new CalculadoraLogica();
        int opciones ;
        Scanner input = new Scanner(System.in);
        do {
            //esta es una funcion que muestra las opciones por consola
            calculadora.presentacion();

            opciones = input.nextInt();
            switch (opciones){
                case 1:
                    calculadora.sumar();
                    break;

                case 2:
                    calculadora.restar();
                    break;

                case 3:
                    calculadora.dividir();
                    break;

                case 4:
                    calculadora.multiplicar();
                    break;

                case 5:
                    calculadora.exponente();
                    break;

                case 6:
                    calculadora.raizCuadrada();
                    break;

                case 7:
                    calculadora.raizCubica();
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No Puedes ingresar ese numero");
                    break;
            }

        }while (opciones != 8);
    }
}
