package com.iluwater.strategy3;

import java.math.BigDecimal;

/**
 * 收银台，将各种会员策略集中起来
 *
 * 组合+接口
 * 这个Cashier类就是一个上下文类，该类的定义体现了多用组合，少用继承、针对接口编程，不针对实现编程两个设计原则。
 */
public class Cashier {
    /**
     * 会员,策略对象
     */
    private Buyer buyer;

    public Cashier(Buyer buyer){
        buyer = buyer;
    }

    public BigDecimal quote(BigDecimal orderPrice) {
        return this.buyer.calPrice(orderPrice);
    }
}
