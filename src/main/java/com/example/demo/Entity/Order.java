package com.example.demo.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Order {
    private String order_id;
    private Date create_time;
    private Long creater_id;
    private String describe;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Long getCreater_id() {
        return creater_id;
    }

    public void setCreater_id(Long creater_id) {
        this.creater_id = creater_id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCreate_time_str(){
        if(this.create_time ==null)
            return "";
        else return  new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(this.create_time);
    }

    public Order() {
    }

    public Order(String order_id) {
        this.order_id = order_id;
        this.create_time=new Date();
        this.creater_id = 10001l;
        this.describe = "哈哈　";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(order_id, order.order_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id);
    }
}
