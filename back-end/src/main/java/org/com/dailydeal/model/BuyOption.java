package org.com.dailydeal.model;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class BuyOption {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String title;
    private Double normalPrice;
    private Double salePrice;
    private Double percentDiscount;
    private Long quantityCupom;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name="deal_id", referencedColumnName="id",nullable=false)
    private Deal deal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(Double normalPrice) {
        this.normalPrice = normalPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(Double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public Long getQuantityCupom() {
        return quantityCupom;
    }

    public void setQuantityCupom(Long quantityCupom) {
        this.quantityCupom = quantityCupom;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public void sellUnit(){
        this.quantityCupom--;
    }
}
