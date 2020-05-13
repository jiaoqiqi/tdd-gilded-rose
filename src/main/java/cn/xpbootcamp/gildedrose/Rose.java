package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.AgedBrie;
import cn.xpbootcamp.gildedrose.model.BackstagePass;
import cn.xpbootcamp.gildedrose.model.CommonGoods;
import cn.xpbootcamp.gildedrose.model.Goods;

public class Rose {
    Goods refresh(Goods goods) {
        int currentSellIn = goods.getSellIn();
        int currentQuality = goods.getQuality();

        if (goods instanceof AgedBrie) {
            if (currentSellIn >= 0) {
                goods.setQuality(currentQuality + 1);
            }
            if (currentSellIn < 0) {
                goods.setQuality(currentQuality + 2);
            }
        }
        if (goods instanceof BackstagePass) {

            if (currentSellIn > 10) {
                goods.setQuality(currentQuality + 1);
            }
            if (currentSellIn <= 10 && currentSellIn > 5) {
                goods.setQuality(currentQuality + 2);
            }
            if (currentSellIn <= 5 && currentSellIn >= 0) {
                goods.setQuality(currentQuality + 3);
            }
            if (currentSellIn < 0) {
                goods.setQuality(0);
            }
        }
        if (goods instanceof CommonGoods) {
            if (currentSellIn > 0) {
                goods.setQuality(currentQuality - 1);
            }
            if (currentSellIn <= 0) {
                goods.setQuality(currentQuality - 2);
            }
        }

        return limitQuality(goods);
    }

    Goods limitQuality(Goods goods) {
        int MAX_QUALITY = 50;
        int MIN_QUALITY = 0;

        if (goods.getQuality() > MAX_QUALITY) {
            goods.setQuality(MAX_QUALITY);
        }
        if (goods.getQuality() < MIN_QUALITY) {
            goods.setQuality(MIN_QUALITY);
        }
        return goods;
    }
}
