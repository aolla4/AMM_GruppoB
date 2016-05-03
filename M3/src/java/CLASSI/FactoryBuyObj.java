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
public class FactoryBuyObj {
    private static FactoryBuyObj singleton;
    public static FactoryBuyObj getInstance() {
        if (singleton == null) {
            singleton = new FactoryBuyObj();
        }
        return singleton;
    }
    private ArrayList<BuyObj> ObjectList = new ArrayList<BuyObj>();
    private FactoryBuyObj(){
        BuyObj bj1 = new BuyObj(); 
        bj1.setobjname("Adele - 25");
        bj1.setobjurl("img/adele.jpg");
        bj1.setobjdesc ("Nuovo cd di Adele") ;      
        bj1.setobjprice (15.99)   ;    
        bj1.setobjdisp (8);
        bj1.setobjid(501);
        bj1.setobjsell (3);
        
         BuyObj bj2 = new BuyObj(); 
        bj2.setobjname("Marco Mengoni - Parole in Circolo");
        bj2.setobjurl("img/mengoni.jpg");
        bj2.setobjdesc ("Nuovo cd di Marco Mengoni") ;      
        bj2.setobjprice (12.50)   ;    
        bj2.setobjdisp (14);
        bj2.setobjid(502);
        bj2.setobjsell (2);
        
         BuyObj bj3 = new BuyObj(); 
        bj3.setobjname("Salmo - Hellvisback");
        bj3.setobjurl("img/salmo.jpg");
        bj3.setobjdesc ("Nuovo cd di Salmo") ;      
        bj3.setobjprice (16.00)   ;    
        bj3.setobjdisp (3);
        bj3.setobjid(503);
        bj3.setobjsell (1);
        
          BuyObj bj4 = new BuyObj(); 
        bj4.setobjname("Vasco Rossi - Sono Innocente");
        bj4.setobjurl("img/vasco.jpg");
        bj4.setobjdesc ("Nuovo cd di Vasco Rossi") ;      
        bj4.setobjprice (21.99)   ;    
        bj4.setobjdisp (18);
        bj4.setobjid(504);
        bj4.setobjsell (2);
        
         BuyObj bj5 = new BuyObj(); 
        bj5.setobjname("Nirvana - Never Mind");
        bj5.setobjurl("img/nirvana.jpg");
        bj5.setobjdesc ("Nuovo cd di Nirvana") ;      
        bj5.setobjprice (10.95)   ;    
        bj5.setobjdisp (28);
        bj5.setobjid(5);
        bj5.setobjsell (3);
    }
        
        
    public BuyObj getObject (int objid)
    {
        for(BuyObj bj : ObjectList)
        {
            if(bj.objid == objid)
                return bj;
        }
        return null;
    }
     public ArrayList<BuyObj> getObjectList()
    {
        return ObjectList;
    }
    
    }


