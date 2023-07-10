package anonymousClass;

public class MusicTest {
    public static void main(String[] args) {
        // different ways to create subclass of musicService
        //1. traditional way of creating subclass
        MusicService musicService = new MusicServiceImpl();
        musicService.play("bollywood");


        //2. using anonymous class
        MusicService anonymous = new MusicService() {
            @Override
            public void play(String songName) {
                System.out.println("playing music using anonymous class " + songName);
            }
        };
        anonymous.play("hollywood");

        //3. implementing functional interface using lambda
        MusicService lambda = songName -> System.out.println("playing music...." + songName);
        lambda.play("tollywood");

    }
}
