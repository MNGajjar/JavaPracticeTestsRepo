package june14.interFaceEx;

public class VLCMedia implements AudioMediaPlayer,VideoMediaPlayer{

    @Override
    public void play() {
        System.out.println("Playing audio in VLC.!");
    }

    @Override
    public void pause() {System.out.println("Pausing audio in VLC.!");
    }

    @Override
    public void stop() {System.out.println("Stoping audio in VLC.!");
    }

    @Override
    public void rewind() {System.out.println("Rewinding audio in VLC.!");
    }

    @Override
    public void forward() {System.out.println("Forwarding audio in VLC.!");
    }

    @Override
    public void speed() {System.out.println("Speeding up audio in VLC.!");
    }
}
