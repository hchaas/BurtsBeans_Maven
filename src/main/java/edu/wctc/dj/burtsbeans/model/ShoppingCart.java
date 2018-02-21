package edu.wctc.dj.burtsbeans.model;

public class ShoppingCart {

    private final int totalProductCount = 0;
    private final int totalCartCost = 0;

    public final void setTotalProductCount(int productCount) {
        productCount += totalProductCount;
    }
    
    public final void setTotalCartCost(int cost){
        cost += totalCartCost;
    }

    public final int getTotalProductCount() {
        return totalProductCount;
    }

    public final int getTotalCartCost() {
        return totalCartCost;
    }
}
