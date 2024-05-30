public class StoppedState implements State {
    private final MediaPlayer mediaPlayer;

    public StoppedState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Started playing from the beginning.");
        mediaPlayer.setTrackNum(0);
        System.out.println("Now playing: " + mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayingState(mediaPlayer));
    }

    @Override
    public void pause() {
        System.out.println("Cannot pause, not playing.");
    }

    @Override
    public void next() {
        System.out.println("Cannot go to next track, not playing.");
    }

    @Override
    public void prev() {
        System.out.println("Cannot go to previous track, not playing.");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped.");
    }
}