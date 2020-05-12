package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoseTest {


    @Test
    void should_increase_1_unit_quality_when_updating_given_AgedBrie_is_sellIn_positive() {
        AgedBrie agedBrie = new AgedBrie(11,1);
        Rose rose = new Rose();
        assertThat(rose.refresh(agedBrie).getQuality()).isEqualTo(2);
    }
}

