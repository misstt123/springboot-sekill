package com.goddong.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 秒杀订单表(SeckillOrder)实体类
 *
 * @author makejava
 * @since 2020-04-23 22:37:26
 */
public class SeckillOrder implements Serializable {
    private static final long serialVersionUID = 633257163423810236L;
    /**
    * 秒杀商品ID
    */
    private Long seckillId;
    /**
    * 支付金额
    */
    private Double money;
    /**
    * 用户手机号
    */
    private Long userPhone;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 状态：-1无效 0成功 1已付款
    */
    private Object state;


    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

}