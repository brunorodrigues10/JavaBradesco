package aula05;

public class MusicBox implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("A MusicBox está Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A MusicBox está Tocando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A MusicBox está Tocando música");
    }
}
