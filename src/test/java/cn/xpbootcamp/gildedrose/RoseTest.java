package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.AgedBrie;
import cn.xpbootcamp.gildedrose.model.BackstagePass;
import cn.xpbootcamp.gildedrose.model.CommonGoods;
import cn.xpbootcamp.gildedrose.model.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoseTest {


    @Test
    void should_increase_1_unit_quality_when_updating_given_AgedBrie_is_sellIn_positive() {
        AgedBrie agedBrie = new AgedBrie(11,1);
        Rose rose = new Rose();
        assertThat(rose.refresh(agedBrie).getQuality()).isEqualTo(2);
    }

    @Test
    void should_increase_2_unit_quality_when_updating_given_AgedBrie_is_sellIn_negative() {
        AgedBrie agedBrie = new AgedBrie(-1,1);
        Rose rose = new Rose();
        assertThat(rose.refresh(agedBrie).getQuality()).isEqualTo(3);
    }

    @Test
    void should_return_50_when_updating_given_AgedBrie_quality_is_more_than_50() {
        AgedBrie agedBrie = new AgedBrie(-1,50);
        Rose rose = new Rose();
        assertThat(rose.refresh(agedBrie).getQuality()).isEqualTo(50);
    }

    @Test
    void should_return_0_when_updating_given_AgedBrie_quality_is_less_than_0() {
        AgedBrie agedBrie = new AgedBrie(-1,-10);
        Rose rose = new Rose();
        assertThat(rose.refresh(agedBrie).getQuality()).isEqualTo(0);
    }

    @Test
    void should_return_original_quality_when_updating_given_Sulfuras() {
        Sulfuras sulfuras = new Sulfuras(-1,10);
        Rose rose = new Rose();
        assertThat(rose.refresh(sulfuras).getQuality()).isEqualTo(10);
    }

    @Test
    void should_return_0_quality_when_updating_given_Sulfuras_quality_is_less_than_0() {
        Sulfuras sulfuras = new Sulfuras(-1,-10);
        Rose rose = new Rose();
        assertThat(rose.refresh(sulfuras).getQuality()).isEqualTo(0);
    }

    @Test
    void should_return_50_quality_when_updating_given_Sulfuras_quality_is_more_than_50() {
        Sulfuras sulfuras = new Sulfuras(-1,100);
        Rose rose = new Rose();
        assertThat(rose.refresh(sulfuras).getQuality()).isEqualTo(50);
    }

    @Test
    void should_increase_1_unit_quality_when_updating_given_BackstagePass_is_sellIn_more_than_10() {
        BackstagePass backstagePass = new BackstagePass(11,1);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(2);
    }

    @Test
    void should_increase_2_unit_quality_when_updating_given_BackstagePass_is_sellIn_equals_10() {
        BackstagePass backstagePass = new BackstagePass(10,1);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(3);
    }

    @Test
    void should_increase_2_unit_quality_when_updating_given_BackstagePass_is_sellIn_less_than_10_and_more_than_5() {
        BackstagePass backstagePass = new BackstagePass(6,11);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(13);
    }

    @Test
    void should_increase_3_unit_quality_when_updating_given_BackstagePass_is_sellIn_equals_5() {
        BackstagePass backstagePass = new BackstagePass(5,13);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(16);
    }

    @Test
    void should_increase_3_unit_quality_when_updating_given_BackstagePass_is_sellIn_less_than_5_and_more_than_0() {
        BackstagePass backstagePass = new BackstagePass(4,16);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(19);
    }

    @Test
    void should_reset_to_0_unit_quality_when_updating_given_BackstagePass_is_sellIn_equals_0() {
        BackstagePass backstagePass = new BackstagePass(0,28);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(0);
    }

    @Test
    void should_reset_to_0_unit_quality_when_updating_given_BackstagePass_is_sellIn_less_than_0() {
        BackstagePass backstagePass = new BackstagePass(-1,28);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(0);
    }

    @Test
    void should_reset_to_0_unit_quality_when_updating_given_BackstagePass_is_quality_less_than_0() {
        BackstagePass backstagePass = new BackstagePass(11,-1);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(0);
    }

    @Test
    void should_reset_to_50_unit_quality_when_updating_given_BackstagePass_is_quality_more_than_50() {
        BackstagePass backstagePass = new BackstagePass(1,49);
        Rose rose = new Rose();
        assertThat(rose.refresh(backstagePass).getQuality()).isEqualTo(50);
    }

    @Test
    void should_decrease_1_unit_quality_when_updating_given_CommonGoods_is_sellIn_larger_than_0() {
        CommonGoods commonGoods = new CommonGoods(5,10);
        Rose rose = new Rose();
        assertThat(rose.refresh(commonGoods).getQuality()).isEqualTo(9);
    }

    @Test
    void should_decrease_3_unit_quality_when_updating_given_CommonGoods_is_sellIn_equals_0() {
        CommonGoods commonGoods = new CommonGoods(0,10);
        Rose rose = new Rose();
        assertThat(rose.refresh(commonGoods).getQuality()).isEqualTo(8);
    }

    @Test
    void should_decrease_2_unit_quality_when_updating_given_CommonGoods_is_sellIn_negative() {
        CommonGoods commonGoods = new CommonGoods(-1,8);
        Rose rose = new Rose();
        assertThat(rose.refresh(commonGoods).getQuality()).isEqualTo(6);
    }
}

