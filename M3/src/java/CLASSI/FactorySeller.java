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
public class FactorySeller {
     private String connectionString ;
     private static FactorySeller singleton;
    public static FactorySeller getInstance() {
        if (singleton == null) {
            singleton = new FactorySeller();
        }
        return singleton;
    }
    private ArrayList<venditore> SellerList = new ArrayList<>();
    
    private FactorySeller(){
        venditore v1 = new venditore();        
        v1.setUserSeller("oneseller");     
        v1.setSellerpsw("11111");
        v1.setidSeller(1);
        v1.setidContoseller(new Saldo(100));
        SellerList.add(v1);  
        
        venditore v2 = new venditore();        
        v2.setUserSeller("twoseller");     
        v2.setSellerpsw("22222");
        v2.setidSeller(2);
        v2.setidContoseller(new Saldo(200));
        SellerList.add(v2);  
        
        venditore v3 = new venditore();        
        v3.setUserSeller("threeseller");     
        v3.setSellerpsw("33333");
        v3.setidSeller(3);
        v3.setidContoseller(new Saldo(300));
        SellerList.add(v3);  
    }
    
    public venditore getvenditore(int idSeller)
    {
        for(venditore v : SellerList)
        {
            if(v.getidSeller () == idSeller)
                return v;
        }
        return null;
    }
      public ArrayList<venditore> getSellerList()
    {
        return SellerList;
    }

    /**
     * @return the connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * @param connectionString the connectionString to set
     */
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}

        
        

