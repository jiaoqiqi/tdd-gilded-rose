package cn.xpbootcamp.gildedrose.model;

public class BackstagePass extends Goods {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public Goods refreshQuality() {
        int currentSellIn = this.getSellIn();
        int currentQuality = this.getQuality();
        int nextQuality = 0;

        if (currentSellIn > 10) nextQuality = currentQuality + 1;
        if (currentSellIn <= 10 && currentSellIn > 5) nextQuality = currentQuality + 2;
        if (currentSellIn <= 5 && currentSellIn > 0) nextQuality = currentQuality + 3;

        return new Goods(currentSellIn - 1, nextQuality).doQualityLimitation();
    }
}
