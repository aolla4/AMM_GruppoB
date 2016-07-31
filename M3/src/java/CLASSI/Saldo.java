/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSI;


public class Saldo {
  private int idsaldo;
  private double saldo;
  
  
    

public Saldo(double saldo){
    this.saldo=saldo; //new Saldo(100.99)
    
    
    }
   public double getsaldo(){
        
        return saldo;
    }
    
    public void setsaldo(double saldo){
        
        this.saldo = saldo;
    }

    /**
     * @return the idsaldo
     */
    public int getIdsaldo() {
        return idsaldo;
    }

    /**
     * @param idsaldo the idsaldo to set
     */
    public void setIdsaldo(int idsaldo) {
        this.idsaldo = idsaldo;
    }
}
