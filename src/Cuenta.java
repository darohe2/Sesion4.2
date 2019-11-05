/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Cuenta {
    
    private String id;
    private String nombre;
    private int Saldo;
    
    
    

    public Cuenta (String id,String nombre,int saldo) {
        
        this.id=id;
        this.nombre=nombre;
        this.Saldo=saldo;
    }

    /**
     * @return the Saldo
     */
    public int getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
    public void ingresar(int x){
        
       Saldo = Saldo+x;
        
        
    }
    public void retirar(int x){
        
        if (Saldo-x>=-500){
            Saldo=Saldo-x;
        }
        else{
            System.out.println("Error, pasa del límite");
        }
        
    }
    
    
    
    
}
