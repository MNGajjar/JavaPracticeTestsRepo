package june14.interFaceEx;

public class MXPlayer implements AudioMediaPlayer,VideoMediaPlayer{

    @Override
    public void play() {
        System.out.println("Playing audio in MXPlayer.!");
    }

    @Override
    public void pause() {System.out.println("Pausing audio in MXPlayer.!");
    }

    @Override
    public void stop() {System.out.println("Stoping audio in MXPlayer.!");
    }

    @Override
    public void rewind() {System.out.println("Rewinding audio in MXPlayer.!");
    }

    @Override
    public void forward() {System.out.println("Forwarding audio in MXPlayer.!");
    }

    @Override
    public void speed() {System.out.println("Speeding up audio in MXPlayer.!");
    }
}
