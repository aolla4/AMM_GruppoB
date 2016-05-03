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
public class FactoryClient {
     private static FactoryClient singleton;
    public static FactoryClient getInstance() {
        if (singleton == null) {
            singleton = new FactoryClient();
        }
        return singleton;
    }

private ArrayList<clienti> ClientList = new ArrayList<clienti>();

private FactoryClient(){
clienti cl1 = new clienti();             
        cl1.setUserClient("oneclient");    
        cl1.setClientpsw("11111");
        cl1.setidClient(1);
        cl1.setidContoclient(101);
        ClientList.add(cl1); 
        
        clienti cl2 = new clienti();             
        cl2.setUserClient("twoclient");    
        cl2.setClientpsw("22222");
        cl2.setidClient(2);
        cl2.setidContoclient(102);
        ClientList.add(cl2); 
        
        
        clienti cl3 = new clienti();             
        cl3.setUserClient("threeclient");    
        cl3.setClientpsw("22222");
        cl3.setidClient(3);
        cl3.setidContoclient(103);
        ClientList.add(cl3); 
        
}
public clienti getclienti(int idClient)
    {
        for(clienti ul : ClientList)
        {
            if(ul.idClient == idClient)
                return ul;
        }
        return null;
    }
public ArrayList<clienti> getClientiList()
    {
        return ClientList;
    }
}

