package org.niit.BEJ_C12_S5_MC.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    private String pName;

    @Id
    private int pId;
    private String pManufacturer;

    public Product() {
    }

    public Product(String pName, int pId, String pManufacturer) {
        this.pName = pName;
        this.pId = pId;
        this.pManufacturer = pManufacturer;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpManufacturer() {
        return pManufacturer;
    }

    public void setpManufacturer(String pManufacturer) {
        this.pManufacturer = pManufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pName='" + pName + '\'' +
                ", pId=" + pId +
                ", pManufacturer='" + pManufacturer + '\'' +
                '}';
    }
}
