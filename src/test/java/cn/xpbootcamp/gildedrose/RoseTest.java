package cn.xpbootcamp.gildedrose;

import cn.xpbootcamp.gildedrose.model.AgedBrie;
import cn.xpbootcamp.gildedrose.model.BackstagePass;
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

}

