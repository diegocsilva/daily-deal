package org.com.dailydeal.model;

import org.com.dailydeal.domain.TipoOferta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Deal {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String title;
    private String text;
    private Date createDate;
    private Date publishDate;
    private Date endDate;
    private String url;
    private Long totalSold;
    private TipoOferta type;

    @OneToMany(mappedBy="deal")
    private List<BuyOption> buyOptions = new ArrayList<>();

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(Long totalSold) {
        this.totalSold = totalSold;
    }

    public TipoOferta getType() {
        return type;
    }

    public void setType(TipoOferta type) {
        this.type = type;
    }

    public List<BuyOption> getBuyOptions() {
        return buyOptions;
    }

    public void setBuyOptions(List<BuyOption> buyOptions) {
        this.buyOptions = buyOptions;
    }

    public void updateTotalSold() {
        this.totalSold++;
    }
}
