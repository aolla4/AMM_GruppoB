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
public class clienti {
    String UserClient;
    String  Clientpsw;
    public int idClient;
    int idContoclient;
    

 clienti(){

}

    public String getUserClient(){

        return UserClient;
    }

    public void setUserClient(String UserClient){

        this.UserClient = UserClient;
    }

    public String getClientpsw(){

        return Clientpsw; 
    }

    public void setClientpsw(String Clientpsw){

        this.Clientpsw = Clientpsw;
    }

    public int getidClient(){

        return idClient;
    }

    public void setidClient (int idClient){

        this.idClient = idClient;
    }

    public int getidContoclient(){

        return idContoclient;
    }

    public void setidContoclient(int idContoclient){

        this.idContoclient = idContoclient;
    }

}
