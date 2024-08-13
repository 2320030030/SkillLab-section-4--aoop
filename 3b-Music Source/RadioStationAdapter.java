package MusicSource;

public class RadioStationAdapter implements MusicSource {
    private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public void play() {
        radioStation.startRadio();
    }

    @Override
    public void stop() {
        radioStation.stopRadio();
    }

    @Override
    public void pause() {
        radioStation.pauseRadio();
    }
}