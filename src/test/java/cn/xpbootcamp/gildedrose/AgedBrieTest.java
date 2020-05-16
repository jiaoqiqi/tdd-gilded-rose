package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.AgedBrie;
import cn.xpbootcamp.gildedrose.model.Goods;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AgedBrieTest {
    @Test
    void should_sellIn_1_quality_1_when_one_day_passed_given_sellIn_2_quality_0() {
        AgedBrie agedBrie = new AgedBrie(2,0);
        Goods updatedAgedBrie = agedBrie.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(1);
    }

    @Test
    void should_sellIn_1_quality_50_when_one_day_passed_given_sellIn_2_quality_49() {
        AgedBrie agedBrie = new AgedBrie(2,49);
        Goods updatedAgedBrie = agedBrie.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }

    @Test
    void should_sellIn_1_quality_50_when_one_day_passed_given_sellIn_2_quality_50() {
        AgedBrie agedBrie = new AgedBrie(2,50);
        Goods updatedAgedBrie = agedBrie.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }
    @Test
    void should_sellIn_1_quality_22_when_one_day_passed_given_sellIn_0_quality_20() {
        AgedBrie agedBrie = new AgedBrie(0,20);
        Goods updatedAgedBrie = agedBrie.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(-1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(22);
    }
}
