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
        if (goods instanceof BackstagePass){

            if (currentSellIn > 10) {
                goods.setQuality(currentQuality + 1);
            }
            if (currentSellIn <=10 && currentSellIn >5){
                goods.setQuality(currentQuality + 2);
            }
            if (currentSellIn <= 5 && currentSellIn >0){
                goods.setQuality(currentQuality+ 3);
            }
            if (currentSellIn <= 0){
                goods.setQuality(0);
            }
        }
        if (goods instanceof CommonGoods){
            if (currentSellIn > 0) {
                goods.setQuality(currentQuality - 1);
            }
            if (currentSellIn <= 0){
                goods.setQuality(currentQuality -2);
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
