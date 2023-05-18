package com.weimin.extend3;

public class Computer {
    String cpu;
    int memory;
    int hardDisk;

    public String getDetails() {
        return "cpu=" + this.cpu + ", memory=" + this.memory
                + ", hardDisk=" + this.hardDisk;
    }
}
