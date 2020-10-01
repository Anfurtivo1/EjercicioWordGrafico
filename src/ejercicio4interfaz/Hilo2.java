/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4interfaz;

/**
 *Hilo que cuenta las letras
 * @author Andrés
 */
public class Hilo2 extends Thread{
    private String cadena;
    
    public Hilo2(String cadena) {
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
            char letra;
            int contador=0;
            for (int i = 0; i < cadena.length(); i++) {
                letra=cadena.charAt(i);
                if (Character.isAlphabetic(letra)) {
                    contador++;
                }
            }
            Panel.txtLetras.setText(String.valueOf(contador));
            //System.out.println("Hay "+contador+" letras");
        }catch(Exception e){
            System.out.println("Error en "+e);
        }
        
    }
    
}
