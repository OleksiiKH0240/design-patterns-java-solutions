public class PlayingState implements State {
    private final MediaPlayer mediaPlayer;

    public PlayingState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Already playing.");
    }

    @Override
    public void pause() {
        System.out.println("Paused the track.");
        mediaPlayer.setState(new PausedState(mediaPlayer));
    }

    @Override
    public void next() {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        System.out.println("Playing next track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void prev() {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        System.out.println("Playing previous track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void stop() {
        System.out.println("Stopped playing.");
        mediaPlayer.setState(new StoppedState(mediaPlayer));
    }
}