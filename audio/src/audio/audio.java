/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author Lenovo
 */
public class audio {
    private static String filename;
    private static Player player;
    
    public static void play() {
        try {
            FileInputStream fls = new FileInputStream("src/file.mp3");
            BufferedInputStream bis = new BufferedInputStream(fls);
            player = new Player(bis);
        } catch(Exception e) {
            System.out.println("Problem playing this file " + filename);
            System.out.println(e);
        }
        
        new Thread() {
            @Override
            public void run() {
                try {
                    //memutar audio file.mp3
                    player.play();
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }
    
    public void close() {
        player.close();
    }
      
    public static void main(String[] args){
        audio msc = new audio();
        msc.play();
    }
}
