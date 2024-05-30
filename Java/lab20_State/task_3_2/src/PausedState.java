public class PausedState implements State {
    private final MediaPlayer mediaPlayer;

    public PausedState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Resumed playing.");
        mediaPlayer.setState(new PlayingState(mediaPlayer));
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void next() {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        System.out.println("Playing next track: " + mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayingState(mediaPlayer));
    }

    @Override
    public void prev() {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        System.out.println("Playing previous track: " + mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayingState(mediaPlayer));
    }

    @Override
    public void stop() {
        System.out.println("Stopped playing.");
        mediaPlayer.setState(new StoppedState(mediaPlayer));
    }
}