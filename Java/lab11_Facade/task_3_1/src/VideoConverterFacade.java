public class VideoConverterFacade {
    VideoConverterFacade() {
    }

    public VideoFile convert(VideoFile videoFile, Codec codec) {
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile videoFileConverted = BitrateReader.convert(buffer, videoFile.getName(), codec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(videoFileConverted, videoFile.getAudioBuffer());
        return videoFileConverted;
    }
}
