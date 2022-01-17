/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerarraysparking;

/**
 *
 * @author DESTINY
 */
public class Empresa {

    String[] Parking;

    public Empresa() {

        Parking = new String[100];

    }

    public Empresa(int nplazas) { //nunero de plazas que va a tener el parking, lo cual nos lo introducira el usuario
        Parking = new String[nplazas];

    }
    public void inicializar(){
    for(int pos=0;pos<Parking.length;pos++) {
    Parking[pos] = "libre";
    
    
    }
    }
    public void estado(){
    for(int pos =0; pos<Parking.length; pos++) {
        System.out.println("Plaza Numero :"+ (pos)+ ""+Parking[pos]);
    
    
    }
    }

    
    
    
    
    
    
    
    }

