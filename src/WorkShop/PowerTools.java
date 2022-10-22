/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop;

/**
 *
 * @author s31011
 */
public class PowerTools implements Tool{
    String name;
    int quantity;
    String type = "Power Tools";
    
    public PowerTools(String n, int q){
        name = n;
        quantity = q;
    }
    
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getQuantity(){
        return quantity;
    }
    @Override
    public String getType(){
        return type;
    }
    @Override
    public void changer(int n){
        if(quantity+n >= 0){
            quantity += n;
        }else{
            System.out.println("You only had" + quantity + "left. You now need to purchase or return.");
            quantity = 0;
        }
    }
}
