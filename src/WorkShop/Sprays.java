package WorkShop;

/**
 *
 * @author s31011
 * @version 9/6/18
 */
public class Sprays implements Tool{
    String name;
    int quantity;
    String type = "Sprays";
    
    public Sprays(String n, int q){
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
