package com.mnd.package2;

public interface TerrainBuilder {
    
    TerrainBuilder buildWall();
    
    TerrainBuilder buildFort();
    
    TerrainBuilder buildMine();
    
    Terrain build();
}
