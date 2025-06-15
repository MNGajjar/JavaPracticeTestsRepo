package june14.interFaceEx;

public interface AudioMediaPlayer extends MediaPlayer{

    @Override
    default void play() {
        System.out.println("Play Audio.!");
    }

    @Override
    default void pause() {
        System.out.println("Pause Audio.!");
    }

    @Override
    default void stop() {
        System.out.println("Stop Audio.!");
    }

    @Override
    default void rewind() {
        System.out.println("Rewind Audio.!");
    }

    @Override
    default void forward() {
        System.out.println("Forward Audio.!");
    }

    @Override
    default void speed() {
        System.out.println("Speedup Audio.!");
    }
}
