package com.mnd;

import com.mnd.package1.Person;
import com.mnd.package2.ComplexTerrainBuilder;
import com.mnd.package2.Terrain;
import com.mnd.package2.TerrainBuilder;

public class Main {
    public static void main(String[] args) {
        
        Person person = new Person.PersonBuilder()
                .id(1, "张三", 20)
                .score(100)
                .weight(98)
                .location("上海路", "1102")
                .build();
        System.out.println(person);

        TerrainBuilder terrainBuilder = new ComplexTerrainBuilder();
        Terrain terrain = terrainBuilder.buildFort().buildMine().buildWall().build();
        System.out.println(terrain);
    }
}