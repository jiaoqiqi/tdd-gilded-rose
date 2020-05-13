package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.Goods;

public class Rose {
    Goods refresh(final Goods goods) {
        final Goods refreshedGoods = goods.refreshQuality();
        return refreshedGoods.doQualityLimitation();
    }
}
