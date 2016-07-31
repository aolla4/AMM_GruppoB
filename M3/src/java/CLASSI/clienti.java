/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSI;


public class clienti {
   private String UserClient;
   private String  Clientpsw;
   public int idClient;
   private Saldo idContoclient;
    

    public clienti(){
    UserClient="";
    Clientpsw="";
    idClient=0;
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

    public Saldo getidContoclient(){

        return idContoclient;
    }

    public void setidContoclient(Saldo idContoclient){

        this.idContoclient = idContoclient;
    }

}
