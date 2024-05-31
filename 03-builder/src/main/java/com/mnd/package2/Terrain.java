package com.mnd.package2;

public class Terrain {
    Wall wall;
    Fort fort;
    Mine mine;

    @Override
    public String toString() {
        return "Terrain{" +
                "wall=" + wall +
                ", fort=" + fort +
                ", mine=" + mine +
                '}';
    }
}

class Wall {
    int x, y, w, h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}

class Fort {
    int x, y, w, h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Fort{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}

class Mine {
    int x, y, w, h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}