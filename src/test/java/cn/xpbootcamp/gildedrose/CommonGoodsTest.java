package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.BackstagePass;
import cn.xpbootcamp.gildedrose.model.CommonGoods;
import cn.xpbootcamp.gildedrose.model.Goods;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonGoodsTest {
    @Test
    void should_sellIn_9_quality_19_when_one_day_passed_given_sellIn_10_quality_20() {
        CommonGoods commonGoods = new CommonGoods(10,20);
        Goods updatedAgedBrie = commonGoods.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(9);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(19);
    }
}
