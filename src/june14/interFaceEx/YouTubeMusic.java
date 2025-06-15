package june14.interFaceEx;

public class YouTubeMusic implements AudioMediaPlayer,VideoMediaPlayer{

    @Override
    public void play() {
        System.out.println("Playing audio and video in ytMusic.!");
    }

    @Override
    public void pause() {System.out.println("Pausing audio and video in ytMusic.!");
    }

    @Override
    public void stop() {System.out.println("Stoping audio and video in ytMusic.!");
    }

    @Override
    public void rewind() {System.out.println("Rewinding audio and video in ytMusic.!");
    }

    @Override
    public void forward() {System.out.println("Forwarding audio and video in ytMusic.!");
    }

    @Override
    public void speed() {System.out.println("Speeding audio and video in ytMusic.!");
    }
}
