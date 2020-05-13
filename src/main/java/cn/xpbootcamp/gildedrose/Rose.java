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
            Goods refreshedGoods = goods.refreshQuality();
            Goods result = refreshedGoods.doQualityLimitation();
            return result;
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

        Goods result = goods.doQualityLimitation();

        return result;
    }
}
