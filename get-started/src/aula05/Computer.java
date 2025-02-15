package aula05;

public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O Computador está Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador está Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador está parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O Computador está reproduzindo vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Computador está pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador está parando o vídeo");
    }
}
