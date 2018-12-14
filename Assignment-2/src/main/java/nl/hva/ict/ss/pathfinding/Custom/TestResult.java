package nl.hva.ict.ss.pathfinding.Custom;

import java.util.ArrayList;

public class TestResult {
    private String bitmapName;
    private String tiles;
    private String length;
    private String cost;

    public String getBitmapName() {
        return bitmapName;
    }

    public String getTiles() {
        return tiles;
    }

    public String getLength() {
        return length;
    }

    public String getCost() {
        return cost;
    }

    public TestResult(String bitmapName, String tiles, String length, String cost) {
        this.bitmapName = bitmapName;
        this.tiles = tiles;
        this.length = length;
        this.cost = cost;
    }
}

