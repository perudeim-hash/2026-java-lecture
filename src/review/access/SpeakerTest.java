package review.access;

public class SpeakerTest {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.showVolume();
    }
}
