package cn.xpbootcamp.gildedrose.model;

public class CommonGoods extends Goods{
    public CommonGoods(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public Goods refreshQuality() {
        int currentSellIn = this.getSellIn();
        int currentQuality = this.getQuality();
        int nextQuality = 0;

        if (currentSellIn > 0) nextQuality = currentQuality - 1;
        if (currentSellIn <= 0) nextQuality = currentQuality - 2;

        return new Goods(currentSellIn - 1, nextQuality).doQualityLimitation();
    }
}
