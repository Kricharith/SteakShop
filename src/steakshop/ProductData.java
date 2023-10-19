/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steakshop;

import java.sql.Date;

/**
 *
 * @author UserPRO
 */
public class ProductData {

    private int id;
    private String productId;
    private String productName;
    private String type;
    private int stock;
    private Double price;
    private String status;
    private String image;
    private Date date;

    public ProductData(int id, String productId, String productName,String type, int stock,
            Double price, String status, String image, Date date) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.status = status;
        this.image = image;
        this.date = date;
    }
    public ProductData(int id, String productId, String productName,Double price, String image){
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.image = image;
    }
    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getImage() {
        return image;
    }

    public Date getDate() {
        return date;
    }

}
