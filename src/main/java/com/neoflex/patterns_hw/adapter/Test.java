package com.neoflex.patterns_hw.adapter;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb = new USB();
        computer.readInfoFromUsb(usb);
        MemoryCard card = new MemoryCard();
//        computer.readInfoFromUsb(card); no compile!
        UsbAdapter adapter = new UsbAdapter(card);
        computer.readInfoFromUsb(adapter);
    }
}
