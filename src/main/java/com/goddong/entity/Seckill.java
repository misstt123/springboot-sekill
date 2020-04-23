package com.goddong.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 秒杀商品表(Seckill)实体类
 *
 * @author makejava
 * @since 2020-04-23 22:37:42
 */
public class Seckill implements Serializable {
    private static final long serialVersionUID = 952997526679314929L;
    /**
    * 商品ID
    */
    private Long seckillId;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品图片
    */
    private String image;
    /**
    * 商品原价格
    */
    private Double price;
    /**
    * 商品秒杀价格
    */
    private Double costPrice;
    /**
    * 剩余库存数量
    */
    private Long stockCount;
    /**
    * 秒杀开始时间
    */
    private Date startTime;
    /**
    * 秒杀结束时间
    */
    private Date endTime;
    /**
    * 创建时间
    */
    private Date createTime;


    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Long getStockCount() {
        return stockCount;
    }

    public void setStockCount(Long stockCount) {
        this.stockCount = stockCount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}