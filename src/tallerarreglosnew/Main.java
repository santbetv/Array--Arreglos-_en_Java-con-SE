package tallerarreglosnew;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static Scanner teclado = new Scanner(System.in);

    UtilidadArreglosNew Utilidades;

    public static void main(String[] args) {
        System.out.println("\"Ingrese el Numero del Ejercio a Verificar: \"");
        int datoBusqueda = teclado.nextInt();
        switch (datoBusqueda) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
        }
    }

    public static void ejercicio1() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] numeros = Utilidades.llenarArregloEnteros(10, "Ingrese un numero entero");
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(numeros));
        String mayorNumero = Utilidades.obtenerPosicionMayor(numeros);
        JOptionPane.showMessageDialog(null, mayorNumero);

    }

    public static void ejercicio2() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] numeros = Utilidades.llenarArregloEnteros(10, "Ingrese un numero entero");
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(numeros));
        String muestraPrimosMayor = Utilidades.encuentraMayorDeLaposicion(numeros);
        JOptionPane.showMessageDialog(null, muestraPrimosMayor);
    }

    public static void ejercicio3() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] numeros = Utilidades.encontrarPrimosRango(10, 100, 300);
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(numeros));

    }

    public static void ejercicio4() {
        int vector[] = new int[10]; //Declaro, instancio vector
        int enteros = 0; // Variables a utilizar
        int mayor = 0;
        int indice = 0;

        for (int i = 0; i < vector.length; i++) { //For que me lee el vector y me asigna el valor acada posicion.
            System.out.println("Ingrese los 10 numeros enteros: " + "Pos " + i);
            enteros = teclado.nextInt();
            vector[i] = enteros;
        }

        for (int i = 0; i < vector.length; i++) {
            String cad = vector[i] + ""; //Me permite la asignacion de todo el recorrido el vector
            int t = cad.length(); //Recorro todo el vector 
            if (cad.charAt(t - 1) == '4') { //Realizo la comparacion del caracter a buscar
                System.out.println("Las posición que terminan en 4 es o son: " + i);
            }
        }

    }

    public static void ejercicio5() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] numero = Utilidades.llenarArregloEnteros(10, "Ingrese un numero entero: ");
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(numero));
        String retornoDeMayor = Utilidades.mayorNumeroReperido(numero);
        JOptionPane.showMessageDialog(null, retornoDeMayor);

    }

    public static void ejercicio6() {

        int vector[] = new int[10]; //Declaro, instancio vector
        int enteros = 0; // Variables a utilizar
        int valornew = 0;
        int promedio = 0;
        int pos = 0;
        int suma = 0;

        for (int i = 0; i < vector.length; i++) { //For que me lee el vector y me asigna el valor acada posicion.
            System.out.println("Ingrese los 10 numeros enteros: " + "Pos " + i);
            enteros = teclado.nextInt();
            vector[i] = enteros;
            suma = suma + enteros;
        }

        for (int i = 0; i < 1; i++) {
            promedio = suma / 10;
            System.out.println("Suma de vectores: " + (double) promedio);
        }

        vector[0] = promedio;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == promedio) {
                valornew = vector[i];
                pos = i;
            }
        }
        System.out.println("Este numero: " + valornew + " se encuentra en el vector " + " Con pos: " + pos);

    }

    public static void ejercicio7() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] numeros = Utilidades.llenarArregloEnteros(10, "Ingrese un numero entero");
        int[] sumas = Utilidades.obtenerArregloSumaDigitos(numeros);
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(sumas));
        String posMayor = Utilidades.obtenerPosicionMayor(sumas);
        JOptionPane.showMessageDialog(null, posMayor);

    }

    public static void ejercicio8() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] arreglo = Utilidades.llenarArregloEnteros(10, "ingrese numero");
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(arreglo));
        int[] factorial = Utilidades.ObtenerFactorial(arreglo);
        JOptionPane.showMessageDialog(null, "ES FACTORIAL ES: " + Utilidades.mostrarDatosArreglo(factorial));
    }

    public static void ejercicio9() {
        UtilidadArreglosNew Utilidades = new UtilidadArreglosNew();
        int[] arreglo = Utilidades.llenarArregloEnteros(10, "ingrese numero");
        JOptionPane.showMessageDialog(null, Utilidades.mostrarDatosArreglo(arreglo));
        int[] factorial = Utilidades.ObtenerFactorial(arreglo);
        JOptionPane.showMessageDialog(null, "ES FACTORIAL ES: " + Utilidades.mostrarDatosArreglo(factorial));

    }
}
