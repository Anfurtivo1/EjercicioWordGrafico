/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4interfaz;

/**
 *Hilo que cuenta los espacios
 * @author Andrés
 */
public class Hilo4 extends Thread {
    private String cadena;
    
    public Hilo4(String cadena) {
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
            char espacio;
            int contador=0;
            for (int i = 0; i < cadena.length(); i++) {
                espacio=cadena.charAt(i);
                if (espacio == ' ') {
                    contador++;
                }
            }
            Panel.txtEspacios.setText(String.valueOf(contador));
            //System.out.println("Hay "+contador+" espacios");
        }catch(Exception e){
            System.out.println("Error en "+e);
        }
        
    }
    
    
}
