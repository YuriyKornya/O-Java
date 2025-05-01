package Lab10.task2;

public class Main {
    public static void main(String[] args) {
        Playable[] playables = new Playable[2];
        playables[0] = new Piano();
        playables[1] = new Guitar();

        for (Playable playable : playables) {
           playable.play();
        }

    }
}

