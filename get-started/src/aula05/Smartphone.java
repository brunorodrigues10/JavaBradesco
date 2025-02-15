package aula05;

public class Smartphone implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O Smartphone está Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Smartphone está Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Smartphone está parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O Smartphone está reproduzindo vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Smartphone está pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Smartphone está parando o vídeo");
    }
}
