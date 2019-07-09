package com.iluwatar.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 划艇实现类
 * RowingBoatImpl
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/2
 */
public class RowingBoatImpl implements  RowingBoat {
    private static final Logger LOGGER = LoggerFactory.getLogger(RowingBoatImpl.class);
    @Override
    public void row() {
        LOGGER.info("the rowing boat is sailing");
    }
}
