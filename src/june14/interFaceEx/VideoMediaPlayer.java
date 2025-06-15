package june14.interFaceEx;

public interface VideoMediaPlayer extends MediaPlayer {

    @Override
    default void play() {
        System.out.println("Play Video.!");
    }

    @Override
    default void pause() {
        System.out.println("Pause Video.!");
    }

    @Override
    default void stop() {
        System.out.println("Stop Video.!");
    }

    @Override
    default void rewind() {
        System.out.println("Rewind Video.!");
    }

    @Override
    default void forward() {
        System.out.println("Forward Video.!");
    }

    @Override
    default void speed() {
        System.out.println("Speedup Video.!");
    }
}
