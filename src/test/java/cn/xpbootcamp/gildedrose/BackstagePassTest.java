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

}
