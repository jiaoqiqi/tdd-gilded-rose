package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.Goods;
import cn.xpbootcamp.gildedrose.model.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasTest {
    @Test
    void should_sellIn_0_quality_45_when_one_day_passed_given_sellIn_0_quality_45() {
        Sulfuras sulfuras = new Sulfuras(0,45);
        Goods updatedAgedBrie = sulfuras.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(0);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(45);
    }

    @Test
    void should_sellIn_minus_1_quality_45_when_one_day_passed_given_sellIn_minus_1_quality_45() {
        Sulfuras sulfuras = new Sulfuras(-1,45);
        Goods updatedAgedBrie = sulfuras.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(-1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(45);
    }

    @Test
    void should_sellIn_minus_1_quality_50_when_one_day_passed_given_sellIn_minus_1_quality_50() {
        Sulfuras sulfuras = new Sulfuras(-1,50);
        Goods updatedAgedBrie = sulfuras.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(-1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }

}
