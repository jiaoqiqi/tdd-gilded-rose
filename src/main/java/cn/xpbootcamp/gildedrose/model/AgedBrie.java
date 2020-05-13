package cn.xpbootcamp.gildedrose.model;

public class AgedBrie extends Goods{

    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public Goods refreshQuality() {
        int currentSellIn = this.getSellIn();
        int currentQuality = this.getQuality();
        int nextQuality = 0;

        if (currentSellIn >= 0) nextQuality = currentQuality + 1;
        if (currentSellIn < 0) nextQuality = currentQuality + 2;

        return new AgedBrie(currentSellIn - 1, nextQuality);
    }
}
