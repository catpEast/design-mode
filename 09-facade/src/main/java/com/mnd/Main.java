package com.mnd;

import com.mnd.device.Light;
import com.mnd.device.Player;
import com.mnd.device.Projector;
import com.mnd.theater.HomeTheaterFacade;

/**
 * @Author wyz
 * @Date 2024/6/14 9:51
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Player player = new Player();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(light, player, projector);
        homeTheaterFacade.watchMovie();

        System.out.println("---------------------");
        
        homeTheaterFacade.stopMovie();
    }
}