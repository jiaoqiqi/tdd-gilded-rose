package cn.xpbootcamp.gildedrose;

public class Rose {
    AgedBrie refresh(AgedBrie agedBrie){

        if (agedBrie.getSellIn() >= 0){
            agedBrie.setQuality(agedBrie.getQuality() + 1);
        }
        return agedBrie;
    }
}