package com.neoflex.patterns_hw.adapter;

public class UsbAdapter extends USB{
    MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void showInformation() {
        memoryCard.showInformation();
    }
}
