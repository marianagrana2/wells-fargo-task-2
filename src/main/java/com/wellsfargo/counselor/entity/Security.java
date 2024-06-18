package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long securityId;
    @OneToOne
    private Portfolio aPort;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String purchasePrice;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private String quantity;

    public Security() {
    }

    public Security(Long securityId, Portfolio aPort, String name, String category, String purchasePrice, String purchaseDate, String quantity) {
        this.securityId = securityId;
        this.aPort = aPort;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public Portfolio getaPort() {
        return aPort;
    }

    public void setaPort(Portfolio aPort) {
        this.aPort = aPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
