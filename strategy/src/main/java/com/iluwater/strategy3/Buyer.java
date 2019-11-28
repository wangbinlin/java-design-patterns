package com.iluwater.strategy3;

import java.math.BigDecimal;

public interface Buyer {

    /**
     *  计算应付价格
     * @param orderPrice
     * @return
     */
    public BigDecimal calPrice(BigDecimal orderPrice);
}
