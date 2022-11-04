package Gun04.PROJE.Sesislemleri.Sesislemleri;


import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ses {
    public static void Cal(String path) {
        try {
            InputStream muzikal = new FileInputStream(path);
            AudioStream muzikstreamet = new AudioStream(muzikal);
            AudioPlayer.player.start(muzikstreamet);
        } catch (Exception e) {
            System.out.println("Olusan Hata: " + e.getMessage());
        }
    }
}
