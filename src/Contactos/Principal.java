package Contactos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //array de 50 contactos
        Contacto[] listadoContactos = new Contacto[50];
        // lector de consola
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        int posicion = 0;
        do {
            do {
                System.out.println("1.- Crear contacto ");
                System.out.println("2.- Imprimir lista de contactos");
                System.out.println("3.- Salir");
                System.out.println("Indique la opcion elegida: ");
                opcion = lector.nextInt();
                lector.nextLine();
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1: {
                    if (posicion < 50) {
                        //recogida de los datos por el usuario
                        System.out.println("Indique el nombre");
                        String nombre = lector.nextLine();
                        System.out.println("Indique ek tekefono");
                        String telefono = lector.nextLine();
                        System.out.println("Indique el correo");
                        String correo = lector.nextLine();
                        //creo el objeto contactos
                        Contacto contacto = new Contacto(nombre, telefono, correo);
                        //añado el contacto de Array y aumento la posicion
                        // de escritura del Array
                        listadoContactos[posicion] = contacto;
                        posicion++;
                    } else {
                        System.out.println("La lista esta llena, pase por caja. ");
                    }
                    break;
                }
                case 2: {
                    if (posicion > 0) {
                        for (int i = 0; i < posicion; i++) {
                            System.out.println(listadoContactos[i].toString());
                        }
                    } else {
                        System.out.println("No hay contactos en la lista ");
                    }
                }

            }
        }while(opcion > 0 && opcion < 3);
    
    }
}
