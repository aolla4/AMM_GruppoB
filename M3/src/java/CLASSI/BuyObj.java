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
public class BuyObj {
    String objname;
    String objurl;
    String objdesc;
    double objprice;
    int objdisp;
    int objid;
    int objsell;
    
    BuyObj(){
        
    }
     public String getobjname(){

        return objname;
    }

    public void setobjname (String objname){

        this.objname = objname;
    }
    public String getobjurl(){

        return objurl;
    }

    public void setobjurl (String objurl){

        this.objurl = objurl;
    }
    public String getobjdesc(){

        return objdesc;
    }

    public void setobjdesc (String objdesc){

        this.objdesc = objdesc;
    }
    
     public double getobjprice(){

        return objprice;
    }

    public void setobjprice (double objprice){

        this.objprice =objprice;
    }
     public int getobjdisp(){

        return objdisp;
    }

    public void setobjdisp (int objdisp){

        this.objdisp =objdisp;
        
    }
     public int getobjid(){

        return objid;
    }

    public void setobjid (int objid){

        this.objid =objid;
        
    }
     public int getobjsell(){

        return objsell;
    }

    public void setobjsell (int objsell){

        this.objsell =objsell;
        
    }
    
    
}
