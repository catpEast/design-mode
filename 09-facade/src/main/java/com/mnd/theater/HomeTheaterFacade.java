package com.mnd.theater;

import com.mnd.device.Light;
import com.mnd.device.Player;
import com.mnd.device.Projector;

/**
 * 家庭影院
 */
public class HomeTheaterFacade {

    private Light light;
    private Player player;
    private Projector projector;

    public HomeTheaterFacade(Light light, Player player, Projector projector) {
        this.light = light;
        this.player = player;
        this.projector = projector;
    }
    
    public void watchMovie() {
        light.down();
        projector.on();
        player.on();
        player.make3DListener();
        System.out.println("看电影...");
    }
    
    public void stopMovie() {
        System.out.println("电影结束...");
        light.up();
        player.off();
        projector.off();
    }
}
