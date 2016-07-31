/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSI;


public class venditore {
    private String UserSeller;
    private String  Sellerpsw;
    private int idSeller;
    private Saldo idContoseller;
   

    public venditore(){
        UserSeller = "";
        Sellerpsw = "";
        idSeller = 0;
        
    }   

    public String getUserSeller(){

        return UserSeller;
    }

    public void setUserSeller(String UserSeller){

        this.UserSeller = UserSeller;
    }

    public String getSellerpsw(){

        return Sellerpsw; 
    }

    public void setSellerpsw(String Sellerpsw){

        this.Sellerpsw = Sellerpsw;
    }

    public int getidSeller(){

        return idSeller;
    }

    public void setidSeller (int idSeller){

        this.idSeller = idSeller;
    }

    public Saldo getidContoseller(){

        return idContoseller;
    }

    public void setidContoseller(Saldo idContoseller){

        this.idContoseller = idContoseller;
    }

}
