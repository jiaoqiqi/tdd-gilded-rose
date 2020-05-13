package cn.xpbootcamp.gildedrose;

public class Rose {
    AgedBrie refresh(AgedBrie agedBrie) {

        if (agedBrie.getSellIn() >= 0) {
            agedBrie.setQuality(agedBrie.getQuality() + 1);
        }
        if (agedBrie.getSellIn() < 0) {
            agedBrie.setQuality(agedBrie.getQuality() + 2);
        }

        limitQuality(agedBrie);

        return agedBrie;
    }

    AgedBrie limitQuality(AgedBrie agedBrie) {
        if (agedBrie.getQuality() > 50) {
            agedBrie.setQuality(50);
        }
        if (agedBrie.getQuality() < 0) {
            agedBrie.setQuality(0);
        }
        return agedBrie;
    }
}
