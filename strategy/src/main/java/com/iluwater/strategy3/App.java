package com.iluwater.strategy3;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        System.out.println("外卖下单，多种优惠折扣方案选择");
        System.out.println("用户付款时，根据用户等级自动选择折扣方案");
        System.out.println("常规写法如下：calPrice（）");
        System.out.println("if else 逻辑判断，不同会员不同折扣");
        System.out.println("");
        System.out.println("增加一种会员类型：专属会员，增加if else 。方法见calPrice2()");
        System.out.println("");
        System.out.println("用策略模式修改");

        //选择并创建需要使用的策略对象
        Buyer strategy = new VipBuyer();
        //创建上下文
        Cashier cashier = new Cashier(strategy);
        //计算价格
        BigDecimal quote = cashier.quote( BigDecimal.valueOf(300));
        System.out.println("普通会员商品的最终价格为：" + quote.doubleValue());

        strategy = new SuperVipBuyer();
        cashier = new Cashier(strategy);
        quote = cashier.quote( BigDecimal.valueOf(300));
        System.out.println("超级会员商品的最终价格为：" + quote.doubleValue());

    }

    public BigDecimal calPrice(BigDecimal orderPrice, String buyerType) {
        if (buyerType.equals("高级会员")) {
            return orderPrice.multiply(new BigDecimal(0.8));//8折
        }
        if (buyerType.equals("普通会员")) {
            return orderPrice.multiply(new BigDecimal(0.9));//9折
        }
        return orderPrice;
    }

    public BigDecimal calPrice2(BigDecimal orderPrice, String buyerType) {
        if (buyerType.equals("专属会员")) {
            return orderPrice.multiply(new BigDecimal(0.7));//7折
        }
        if (buyerType.equals("高级会员")) {
            return orderPrice.multiply(new BigDecimal(0.8));//8折
        }
        if (buyerType.equals("普通会员")) {
            return orderPrice.multiply(new BigDecimal(0.9));//9折
        }
        return orderPrice;
    }
}
