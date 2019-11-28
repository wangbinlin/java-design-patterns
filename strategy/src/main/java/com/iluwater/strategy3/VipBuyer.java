package com.iluwater.strategy3;

import java.math.BigDecimal;

/**
 * 普通会员
 */
public class VipBuyer implements Buyer {

    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        int  superVipExpiredDays  = 10;
        int superVipLeadDiscountTimes  = 10;
        if(superVipExpiredDays < 7 && superVipLeadDiscountTimes ==0){

            return orderPrice.multiply(new BigDecimal(0.8));
        }
        return orderPrice.multiply(new BigDecimal(0.9));
    }
}