package com.mnd.package2;

public class ComplexTerrainBuilder implements TerrainBuilder {
    
    private final Terrain terrain = new Terrain();
    
    @Override
    public TerrainBuilder buildWall() {
        terrain.wall = new Wall(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuilder buildFort() {
        terrain.fort = new Fort(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.mine = new Mine(10, 10, 50, 50);
        return this;
    }
    
    @Override
    public Terrain build() {
        return terrain;
    }
}
