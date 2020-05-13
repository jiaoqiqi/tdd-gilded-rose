package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.AgedBrie;
import cn.xpbootcamp.gildedrose.model.Goods;

public class Rose {
    Goods refresh(Goods goods) {

        if (goods instanceof AgedBrie) {
            if (goods.getSellIn() >= 0) {
                goods.setQuality(goods.getQuality() + 1);
            }
            if (goods.getSellIn() < 0) {
                goods.setQuality(goods.getQuality() + 2);
            }
        }

        limitQuality(goods);

        return goods;
    }

    Goods limitQuality(Goods goods) {
        if (goods.getQuality() > 50) {
            goods.setQuality(50);
        }
        if (goods.getQuality() < 0) {
            goods.setQuality(0);
        }
        return goods;
    }
}
