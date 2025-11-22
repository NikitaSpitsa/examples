package edu.nik.examples.patterns.adapter.media_player;

public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    @Override
    public void playFlv(String fileName) {
        System.out.println("Playing FLV file: " + fileName);
    }

}
