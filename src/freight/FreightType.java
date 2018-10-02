/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freight;

/**
 *
 * @author Eamon
 */
public class FreightType {
    String size;
    String product;

public FreightType(){
    size = new String ();
    product = new String();
}

    public void setSize(String s) {
        size = s;
    }

    public void setProduct(String p) {
        product = p;
    }

    public String getSize() {
        return size;
    }

    public String getProduct() {
        return product;
    }
   
}


