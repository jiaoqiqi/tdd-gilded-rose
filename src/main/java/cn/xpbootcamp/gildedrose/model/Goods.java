package cn.xpbootcamp.gildedrose.model;

public class Goods {
    private int sellIn;
    private int quality;

    public Goods refreshQuality() {
        return this;
    }
    public Goods doQualityLimitation() {
        int MAX_QUALITY = 50;
        int MIN_QUALITY = 0;

        if (this.getQuality() > MAX_QUALITY) {
            this.setQuality(MAX_QUALITY);
        }
        if (this.getQuality() < MIN_QUALITY) {
            this.setQuality(MIN_QUALITY);
        }
        return this;
    }

    public Goods(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
