
package edu.wctc.dj.burtsbeans.model;

public class Product {
    private String id;
    private String productName;
    private String productDescription;
    private int productQuantity;

    public Product(String productID, String productName, String productDescription, int productQuantity) {
        this.setProductID(productID);
        this.setProductName(productName);
        this.setProductDescription(productDescription);
        this.setProductQuantity(productQuantity);
    }
    
    public final void setProductID(String productID) throws IllegalArgumentException{
        if (productID == null || productID.isEmpty()){
            throw new IllegalArgumentException("Product ID cannot be null or empty.");
        }
        this.id = productID;
    }

    public final void setProductName(String productName) throws IllegalArgumentException{
        if(productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("Product Name cannot be null or empty.");
        }
        this.productName = productName;
    }

    public final void setProductDescription(String productDescription) throws IllegalArgumentException{
        if(productDescription == null || productDescription.isEmpty()){
            throw new IllegalArgumentException("Product description cannot be null or empty.");
        }
        this.productDescription = productDescription;
    }

    public final void setProductQuantity(int productQuantity) throws IllegalArgumentException{
        if(productQuantity < 0){
            throw new IllegalArgumentException("Product quantity cannot be less than zero.");
        }
        this.productQuantity = productQuantity;
    }

    public final String getProductID() {
        return id;
    }

    public final String getProductName() {
        return productName;
    }

    public final String getProductDescription() {
        return productDescription;
    }

    public final int getProductQuantity() {
        return productQuantity;
    }
    
    
}
