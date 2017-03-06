package org.dimhat.demo20;

import java.util.List;

/**
 * 订单类
 * @author : zwj
 * @data : 2017/3/6
 */
public class Order {

    String id;

    List<String> goodsItemIds;

    private Short status;

    public static final Short CANCEL_STATUS=-1;
    public static final Short CREATE_STATUS=1;
    public static final Short PAYED_STATUS=2;
    public static final Short FINISHED_STATUS=3;
    public static final Short COMMENTED_STATUS=4;

    public void create(){
        status=CREATE_STATUS;
        System.out.println("创建订单成功！");
    }

    public void pay(){
        if(status==CREATE_STATUS){
            status=PAYED_STATUS;
            System.out.println("支付订单成功！");
        } else{
            System.out.println("订单不可支付");
        }
    }

    public void cancel(){
        if(status==CREATE_STATUS){
            status=CANCEL_STATUS;
            System.out.println("取消订单成功！");
        }
    }

    public void finished(){
        if(status==PAYED_STATUS){
            status = FINISHED_STATUS;
            System.out.println("订单完成");
        }
    }

    public void commit(String str){
        if(status==FINISHED_STATUS){
            System.out.println("评价订单："+str);
            status=COMMENTED_STATUS;
            System.out.println("订单已评价！");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGoodsItemIds() {
        return goodsItemIds;
    }

    public void setGoodsItemIds(List<String> goodsItemIds) {
        this.goodsItemIds = goodsItemIds;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
