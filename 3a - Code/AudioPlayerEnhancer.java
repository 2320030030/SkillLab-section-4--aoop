package AudioPlayer;

abstract class AudioPlayerEnhancer implements AudioPlayerAdapter {
 protected AudioPlayerAdapter enhancedPlayer;

 public AudioPlayerEnhancer(AudioPlayerAdapter enhancedPlayer) {
     this.enhancedPlayer = enhancedPlayer;
 }

 @Override
 public void start() {
     enhancedPlayer.start();
 }

 @Override
 public void hold() {
     enhancedPlayer.hold();
 }

 @Override
 public void end() {
     enhancedPlayer.end();
 }

 @Override
 public void adjustVolume(int level) {
     enhancedPlayer.adjustVolume(level);
 }
}

class EqualizerEnhancer extends AudioPlayerEnhancer {
 public EqualizerEnhancer(AudioPlayerAdapter enhancedPlayer) {
     super(enhancedPlayer);
 }
 public void configureEqualizer(String mode) {
     System.out.println("Configuring equalizer to " + mode);
 }
}
class VolumeAdjusterEnhancer extends AudioPlayerEnhancer {
 public VolumeAdjusterEnhancer(AudioPlayerAdapter enhancedPlayer) {
     super(enhancedPlayer);
 }
 @Override
 public void adjustVolume(int level) {
     super.adjustVolume(level);
     System.out.println("Applying volume adjustment settings.");
 }
}
