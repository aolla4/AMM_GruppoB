/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSI;

/**
 *
 * @author mariabernadetta
 */
public class Saldo {
   int saldo;
    public int idConto;
    

Saldo(){
    
    }
   public int getsaldo(){
        
        return saldo;
    }
    
    public void setsaldo(int saldo){
        
        this.saldo = saldo;
    }
    public int getidConto (){
        
        return idConto;
    }
    
    public void setidConto (int idConto){
        
        this.idConto = idConto;
    }
}



