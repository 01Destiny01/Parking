/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerarraysparking;

/**
 *
 * @author DESTINY
 */
public class EjerArraysParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos;
        int opcion;
        int Nplazas;
        Empresa MiEmpresa = new Empresa();
        Nplazas = tools.Numeros.ControlNumeroEnteroConValorMin("Introduce el numero de plazas que quieres que tenga tu parking",1);
        do {
            Menu();
            opcion = tools.Numeros.ControlNumeroEnteroConValorMinYMax("Selecciona una opcion:", 1, 4);
            switch (opcion) {
                case 1:
                    MiEmpresa.inicializar();
                    break;
                case 2:

            }

        } while (opcion != 4);

    }

    private static void Menu() {
        System.out.println("1.Entrar al parking");
        System.out.println("2.Salir del parking");
        System.out.println("3.Ver el estado del parking");
        System.out.println("4.Salir del parking");

    }

}
