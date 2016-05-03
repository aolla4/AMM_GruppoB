/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSI;
import java.util.ArrayList;

/**
 *
 * @author mariabernadetta
 */
public class FactorySaldo {
    private static FactorySaldo singleton;
    public static FactorySaldo getInstance() {
        if (singleton == null) {
            singleton = new FactorySaldo();
        }
        return singleton;
    }
    private ArrayList<Saldo> SaldoList = new ArrayList<Saldo>();
    
    private FactorySaldo(){
    
    Saldo saldo1 = new Saldo();             
                  
        saldo1.setidConto(101);                           
        saldo1.setsaldo(100);
        SaldoList.add(saldo1); 
        
        Saldo saldo2 = new Saldo();             
                  
        saldo2.setidConto(102);                           
        saldo2.setsaldo(200);
        SaldoList.add(saldo2); 
        
        Saldo saldo3 = new Saldo();             
                  
        saldo3.setidConto(103);                           
        saldo3.setsaldo(300);
        SaldoList.add(saldo3); 
        
        Saldo saldo4 = new Saldo();             
                  
        saldo4.setidConto(01);                           
        saldo4.setsaldo(1000);
        SaldoList.add(saldo4); 
        
        Saldo saldo5 = new Saldo();             
                  
        saldo5.setidConto(02);                           
        saldo5.setsaldo(2000);
        SaldoList.add(saldo5); 
        
        Saldo saldo6 = new Saldo();             
                  
        saldo6.setidConto(03);                           
        saldo6.setsaldo(6000);
        SaldoList.add(saldo6); 
            
        
        

    }
       public Saldo getSaldo (int idConto)
    {
        for(Saldo s : SaldoList)
        {
            if(s.idConto == idConto)
                return s;
        }
        return null;
    }
       
        public ArrayList<Saldo> getSaldoList()
    {
        return SaldoList;
    }
}
        
        
    

