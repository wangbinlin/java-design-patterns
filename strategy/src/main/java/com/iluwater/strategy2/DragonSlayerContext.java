package com.iluwater.strategy2;

import com.iluwater.strategy2.DragonSlayingStrategy;
import com.iluwater.strategy2.MeleeStrategy;
import com.iluwater.strategy2.ProjectileStrategy;

/**
 * DragonSlayerContext
 *
 * @author wangbinlin
 * @version V1.0
 * @date 2019/7/8
 */
public class DragonSlayerContext {

    private DragonSlayingStrategy strategy;

    public DragonSlayerContext(String type)
    {
        switch (type) {
            case "MeleeStrategy":
                strategy = new MeleeStrategy();
                break;
            case "ProjectileStrategy":
                strategy = new ProjectileStrategy();
                break;
            case "SpellStrategy":
                strategy = new SpellStrategy();
                break;

        }
    }
    public void goToBattle() {
        strategy.execute();
    }
}
