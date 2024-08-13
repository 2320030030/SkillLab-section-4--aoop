package AudioPlayer;

//ApplicationDemo.java
public class ApplicationDemo {
 public static void main(String[] args) {
     
     FileAudioPlayer localFilePlayer = new FileAudioPlayer("path/to/audio/file.mp3");
     WebStreamPlayer onlineStreamPlayer = new WebStreamPlayer("http://example.com/stream");
     RadioAudioPlayer radioPlayer = new RadioAudioPlayer("http://example.com/radio");

   
     AudioPlayer fileAudioAdapter = new FileAudioAdapter(localFilePlayer);
     AudioPlayer streamAudioAdapter = new WebStreamAdapter(onlineStreamPlayer);
     AudioPlayer radioAudioAdapter = new RadioAudioAdapter(radioPlayer);

     
     fileAudioAdapter.playAudio();
     streamAudioAdapter.playAudio();
     radioAudioAdapter.playAudio();
 }
}
