package anonymousClass;

public class MusicServiceImpl implements MusicService{
    @Override
    public void play(String songName) {
        System.out.println("playing...."+songName);
    }
}