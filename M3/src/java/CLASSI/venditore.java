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
public class venditore {
    String UserSeller;
    String  Sellerpsw;
    public int idSeller;
    int idContoseller;
    

 venditore(){

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

    public int getidContoseller(){

        return idContoseller;
    }

    public void setidContoseller(int idContoseller){

        this.idContoseller = idContoseller;
    }

}
