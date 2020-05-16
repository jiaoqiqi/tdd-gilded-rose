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

    @Test
    void should_sellIn_minus_2_quality_4_when_one_day_passed_given_sellIn_minus_1_quality_6() {
        CommonGoods commonGoods = new CommonGoods(-1,6);
        Goods updatedAgedBrie = commonGoods.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(-2);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(4);
    }

    @Test
    void should_sellIn_1_quality_0_when_one_day_passed_given_sellIn_2_quality_0() {
        CommonGoods commonGoods = new CommonGoods(2,0);
        Goods updatedAgedBrie = commonGoods.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(0);
    }

    @Test
    void should_sellIn_2_quality_5_when_one_day_passed_given_sellIn_3_quality_6() {
        CommonGoods commonGoods = new CommonGoods(3,6);
        Goods updatedAgedBrie = commonGoods.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(2);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(5);
    }

    @Test
    void should_sellIn_2_quality_50_when_one_day_passed_given_sellIn_3_quality_51() {
        CommonGoods commonGoods = new CommonGoods(3,51);
        Goods updatedAgedBrie = commonGoods.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(2);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }

    @Test
    void should_sellIn_minus_1_quality_4_when_one_day_passed_given_sellIn_0_quality_6() {
        CommonGoods commonGoods = new CommonGoods(0,6);
        Goods updatedAgedBrie = commonGoods.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(-1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(4);
    }
}
