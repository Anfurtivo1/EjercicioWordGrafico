/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4interfaz;

/**
 *Hilo que cuenta los numeros
 * @author Andrés
 */
public class Hilo3 extends Thread{
    private String cadena;
    
    public Hilo3(String cadena) {
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
            char numero;
            int contador=0;
            for (int i = 0; i < cadena.length(); i++) {
                numero=cadena.charAt(i);
                if (Character.isDigit(numero)) {
                    contador++;
                }
            }
            Panel.txtNumeros.setText(String.valueOf(contador));
            //System.out.println("Hay "+contador+" numeros");
        }catch(Exception e){
            System.out.println("Error en "+e);
        }
        
    }
    
    
}
