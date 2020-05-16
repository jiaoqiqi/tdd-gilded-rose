package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.BackstagePass;
import cn.xpbootcamp.gildedrose.model.Goods;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    void should_sellIn_14_quality_21_when_one_day_passed_given_sellIn_15_quality_20() {
        BackstagePass backstagePass = new BackstagePass(15,20);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(14);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(21);
    }

    @Test
    void should_sellIn_9_quality_47_when_one_day_passed_given_sellIn_10_quality_47() {
        BackstagePass backstagePass = new BackstagePass(10,45);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(9);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(47);
    }

    @Test
    void should_sellIn_8_quality_47_when_one_day_passed_given_sellIn_9_quality_45() {
        BackstagePass backstagePass = new BackstagePass(9,45);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(8);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(47);
    }

    @Test
    void should_sellIn_8_quality_50_when_one_day_passed_given_sellIn_9_quality_49() {
        BackstagePass backstagePass = new BackstagePass(9,49);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(8);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }

    @Test
    void should_sellIn_8_quality_50_when_one_day_passed_given_sellIn_9_quality_50() {
        BackstagePass backstagePass = new BackstagePass(9,50);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(8);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }

    @Test
    void should_sellIn_4_quality_50_when_one_day_passed_given_sellIn_5_quality_49() {
        BackstagePass backstagePass = new BackstagePass(5,49);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(4);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(50);
    }

    @Test
    void should_sellIn_4_quality_48_when_one_day_passed_given_sellIn_5_quality_45() {
        BackstagePass backstagePass = new BackstagePass(5,45);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(4);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(48);
    }

    @Test
    void should_sellIn_0_quality_23_when_one_day_passed_given_sellIn_1_quality_10() {
        BackstagePass backstagePass = new BackstagePass(5,45);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(4);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(48);
    }

    @Test
    void should_sellIn_minus_1_quality_0_when_one_day_passed_given_sellIn_0_quality_20() {
        BackstagePass backstagePass = new BackstagePass(0,20);
        Goods updatedAgedBrie = backstagePass.refreshQuality();
        assertThat(updatedAgedBrie.getSellIn()).isEqualTo(-1);
        assertThat(updatedAgedBrie.getQuality()).isEqualTo(0);
    }

}
