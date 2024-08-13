package AudioPlayer;

public class FileAudioAdapter implements AudioPlayer {
    private FileAudioPlayer fileAudioPlayer;

    public FileAudioAdapter(FileAudioPlayer fileAudioPlayer) {
        this.fileAudioPlayer = fileAudioPlayer;
    }

    @Override
    public void playAudio() {
        fileAudioPlayer.playFromFile();
    }
}