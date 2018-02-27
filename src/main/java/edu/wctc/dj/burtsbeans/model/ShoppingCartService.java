
package edu.wctc.dj.burtsbeans.model;

import java.util.LinkedHashMap;

public class ShoppingCartService {
    private ShoppingCart cart;
    private LinkedHashMap<Integer, Product> shoppingCart;
    
    public void ShoppingCartService(){
        cart = new ShoppingCart();
    }
    
    public final void addToCart(Product product, int quantity){
        //add to hashmap, add to product count, add to total cost
        Integer intI = new Integer(product.getProductID());
        product.setProductQuantity(quantity);
        shoppingCart.put(intI, product);
        
        this.addToProductCount(product, quantity);
        this.addToTotalCost(product, product.getPricePerPound());
        
    }
    
    public final void addToProductCount(Product product, int productQuantity){
        cart.setTotalProductCount(product.getProductQuantity());
    }
    
    public final void addToTotalCost(Product product, int productCost){
        cart.setTotalCartCost(product.getPricePerPound());
    }
    
    public final LinkedHashMap<Integer, Product> getCartContents (){
        
        return shoppingCart;
    }
}
