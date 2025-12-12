package edu.nik.examples.patterns.adapter.media_player;

public class ApplicationStarter {

    public static void main(String[] args) {
        System.out.println("\n\n  Media Adapter  \n\n");

        String fileName = "mp3";

        MediaAdapter mediaAdapter = new MediaAdapter(fileName);

        mediaAdapter.playAudio(fileName);

        fileName = "mp4";
        mediaAdapter.playAudio(fileName);

        fileName = "flv";
        mediaAdapter.playAudio(fileName);

        fileName = "djv";
        mediaAdapter.playAudio(fileName);

        System.out.println("\n\n  Media Adapter finished \n\n");
    }
}
