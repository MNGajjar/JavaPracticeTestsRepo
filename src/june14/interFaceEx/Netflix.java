package june14.interFaceEx;

public class Netflix implements  VideoMediaPlayer{

    @Override
    public void play() {
        System.out.println("Playing Video on Netflix.!");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Video on Netflix.!");
    }

    @Override
    public void stop() {
        System.out.println("Stoping Video on Netflix.!");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding Video on Netflix.!");
    }

    @Override
    public void forward() {
        System.out.println("Forwarding Video on Netflix.!");
    }

    @Override
    public void speed() {
        System.out.println("Speeding up Video on Netflix.!");
    }
}
