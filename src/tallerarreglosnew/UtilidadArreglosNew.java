package tallerarreglosnew;

import javax.swing.JOptionPane;
import javax.swing.*;

public class UtilidadArreglosNew {

    public static int sumarDigitos(int numero) {

        int suma = 0;
        while (numero > 10) {
            suma = suma + (numero % 10);
            numero = numero / 10;
        }

        suma = suma + numero;
        return suma;

    }

    public static int[] obtenerArregloSumaDigitos(int[] numeros) {
        int[] sumaDigitos = new int[numeros.length];
        for (int i = 0; i < sumaDigitos.length; i++) {
            sumaDigitos[i] = sumarDigitos(numeros[i]);
        }
        return sumaDigitos;

    }

    public static String mostrarDatosArreglo(int[] arreglo) {
        String texto = "";
        for (int i = 0; i < arreglo.length; i++) {
            texto += "\n arr[" + i + "]= " + arreglo[i];
        }
        return texto;
    }

    public static String obtenerPosicionMayor(int[] arreglo) {
        ///logica que recorra un arreglo retorne la posicion donde esta el mayor
        int indice = 0;
        int mayor = 0;
        String mensaje = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                indice = i;
                mensaje = "El numero mayor es: " + mayor + "\t" + "La posicion del mayor es: " + indice;
            }
        }
        return mensaje;
    }

    public static boolean esPrimo(int numero) {
        int contDivisores = 0;
        for (int i = numero / 2; i >= 1; i--) {
            if (numero % i == 0) {
                contDivisores++;
            }
        }
        return contDivisores == 1;
    }

    public static int[] encontrarPrimosRango(int cuantos, int rangoIni, int rangoFinal) {
        int[] primos = new int[cuantos];
        int cont = 0;
        for (int i = rangoIni; i <= rangoFinal; i++) {
            if (esPrimo(i)) {
                primos[cont] = i;
                cont++;
            }
            if (cont == cuantos) {
                break;
            }
        }
        return primos;
    }

    public static int encontrarPimosSinRango(int[] arreglo) {
        int con = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (esPrimo(i)) {
                con++;
            }
            if (con == arreglo.length) {
                break;
            }
        }
        return con;
    }

    public static String encuentraMayorDeLaposicion(int[] arreglo) {
        String mensaje = "";
        int mayor = 0;
        int indice = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (esPrimo(arreglo[i])) {
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                    indice = i;
                    mensaje = "El mayor valor es: " + mayor + "\n" + "El la posición del mayor es: " + indice;
                }
            }
        }
        return mensaje;
    }

    public static int[] posicionesNumerosTerminados4(int[] arreglo) {

        int catidadtotal = 0;
        int mensaje = 0;
        int cont = 0;
        int cantidad = arreglo.length;
        int[] terminadosen4 = new int[cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            String cantiadad = arreglo[i] + "";
            int todoRecorrido = cantiadad.length();
            if (cantiadad.charAt(todoRecorrido - 1) == '4') {
                terminadosen4[cont] = i;
            }
        }
        return terminadosen4;
    }

    public static String mayorNumeroReperido(int[] arreglo) {

        int mayor = 0;
        int indice = 0;
        int con = 0;
        String mensaje = "";
        arreglo[0] = mayor;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                indice = i;
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == mayor) {
                con++; //Se cuenta el numero mayor del vector
            }
        }

        mensaje = "El numero mayor es: " + mayor + "\n" + "Y se repite: " + con;

        return mensaje;
    }

    public static String promedioDeDatosEnteros(int[] arreglo) {

        int valornew = 0;
        int promedio = 0;
        int pos = 0;
        int suma = 0;
        String mensaje = "";

        for (int i = 0; i < 1; i++) {
            promedio = suma / 10;
            System.out.println("Suma de vectores: " + (double) promedio);
        }

        arreglo[0] = promedio;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == promedio) {
                valornew = arreglo[i];
                pos = i;
            }
        }
        mensaje = "Este numero: " + valornew + " se encuentra en el vector " + " Con pos: " + pos;
        return mensaje;
    }

    public static int CalcularFactorial(int numero) {

        int factorial = 1;
        for (int i = numero; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int[] ObtenerFactorial(int[] arreglo) {

        int[] vector = new int[arreglo.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = CalcularFactorial(arreglo[i]);
        }
        return vector;
    }

    public static String numerosEntreEnteros(int[] numero) {
        String msj = "";

        for (int i = 0; i < numero.length; i++) {
            System.out.print("\n los numeros entre 1 y " + numero[i] + " son: ");
            for (int j = 2; j < numero[i]; j++) {
                System.out.print("" + j + " ,");

            }

        }

        return msj;

    }

    public static int[] llenarArregloEnteros(int cuantos, String mensaje) {
        int[] arreglo = new int[cuantos];
        for (int i = 0; i < cuantos; i++) {
            arreglo[i] = leerEntero(mensaje + " (" + (i + 1) + " de " + cuantos + ")");

        }
        return arreglo;
    }

    public static int leerEntero(String mensaje) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }

    private int x;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
