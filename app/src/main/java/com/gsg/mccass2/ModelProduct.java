package com.gsg.mccass2;

public class ModelProduct {
    private String productId,productName,productImage;

    public ModelProduct(String productId,String productName,String productImage){
        this.productId = productId;
        this.productName = productName;
        this.productImage = productImage;


    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
