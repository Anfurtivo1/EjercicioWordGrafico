/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4interfaz;

import java.util.StringTokenizer;

/**
 *Hilo que cuenta las palabras
 * @author Andrés
 */
public class Hilo1 extends Thread{
    private String cadena;

    public Hilo1(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public void run(){
        try{
            //StringTokenizer cuentaIntros = new StringTokenizer(cadena,"\n");
            StringTokenizer cuentaPalabras= new StringTokenizer(cadena," ");
            
            //System.out.println("Hay "+cuentaPalabras.countTokens()+" palabras");
            Panel.txtPalabras.setText(String.valueOf(cuentaPalabras.countTokens()));
        }catch(Exception e){
            System.out.println("Error en "+e);
        }
       
    }
    
}
