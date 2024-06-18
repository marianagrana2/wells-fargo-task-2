package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long portfolioId;
    @OneToOne
    private Client cli;
    @Column(nullable = false)
    private String creationDate;

    public Portfolio() {
    }

    public Portfolio(Long portfolioId, Client cli, String creationDate) {
        this.portfolioId = portfolioId;
        this.cli = cli;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
