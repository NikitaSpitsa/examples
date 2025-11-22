package edu.nik.examples.patterns.adapter.media_player;

public class MediaAdapter implements SimpleAudioPlayer{
    AdvancedMediaPlayerImpl advancedMediaPlayer = new AdvancedMediaPlayerImpl();

    String fileName;

    public MediaAdapter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void playAudio(String fileName) {
        if (fileName.equals("mp3")) {
            System.out.println("Playing MP3...");
        } else if (fileName.equals("flv")) {
            advancedMediaPlayer.playFlv(fileName);
        } else if (fileName.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else {
            System.out.println("file unknown");
        }
    }
}
