package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.AgedBrie;
import cn.xpbootcamp.gildedrose.model.BackstagePass;
import cn.xpbootcamp.gildedrose.model.CommonGoods;
import cn.xpbootcamp.gildedrose.model.Goods;

public class Rose {
    Goods refresh(Goods goods) {

        if (goods instanceof AgedBrie) {
            Goods refreshedGoods = goods.refreshQuality();
            Goods result = refreshedGoods.doQualityLimitation();
            return result;
        }
        if (goods instanceof BackstagePass) {

            Goods refreshedGoods = goods.refreshQuality();
            Goods result = refreshedGoods.doQualityLimitation();
            return result;
        }
        if (goods instanceof CommonGoods) {
            Goods refreshedGoods = goods.refreshQuality();
            Goods result = refreshedGoods.doQualityLimitation();
            return result;
        }

        Goods result = goods.doQualityLimitation();

        return result;
    }
}
