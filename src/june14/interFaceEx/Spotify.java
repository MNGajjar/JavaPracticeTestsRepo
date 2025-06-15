package june14.interFaceEx;

public class Spotify implements AudioMediaPlayer{

    @Override
    public void play() {
        System.out.println("Spotify playing Audio.!");
    }

    @Override
    public void pause() {
        System.out.println("Spotify pausing Audio.!");
    }

    @Override
    public void stop() {
        System.out.println("Spotify stoping Audio.!");
    }

    @Override
    public void rewind() {
        System.out.println("Spotify rewinding Audio.!");
    }

    @Override
    public void forward() {
        System.out.println("Spotify forwarding Audio.!");
    }

    @Override
    public void speed() {
        System.out.println("Spotify speeding up Audio.!");
    }
}
