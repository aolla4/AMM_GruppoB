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
    
     private static FactorySeller singleton;
    public static FactorySeller getInstance() {
        if (singleton == null) {
            singleton = new FactorySeller();
        }
        return singleton;
    }
    private ArrayList<venditore> SellerList = new ArrayList<venditore>();
    
    private FactorySeller(){
        venditore v1 = new venditore();        
        v1.setUserSeller("oneseller");     
        v1.setSellerpsw("11111");
        v1.setidSeller(1);
        v1.setidContoseller(01);
        SellerList.add(v1);  
        
         venditore v2 = new venditore();        
        v1.setUserSeller("twoseller");     
        v1.setSellerpsw("22222");
        v1.setidSeller(2);
        v1.setidContoseller(02);
        SellerList.add(v2);  
        
         venditore v3 = new venditore();        
        v1.setUserSeller("threeseller");     
        v1.setSellerpsw("33333");
        v1.setidSeller(3);
        v1.setidContoseller(03);
        SellerList.add(v3);  
    }
    public venditore getvenditore(int idSeller)
    {
        for(venditore v : SellerList)
        {
            if(v.idSeller == idSeller)
                return v;
        }
        return null;
    }
      public ArrayList<venditore> getSellerList()
    {
        return SellerList;
    }
}

        
        

