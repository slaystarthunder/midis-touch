
public class MelodyTrack extends Track {

    /**
     * Generates a monophonic melody track, given a MIDI-sequence array from
     * our MIDI Music Engine
     *
     * @param bpm
     * @param key
     * @param numberOfBars
     * @param midiSequenceArray
     */
    public MelodyTrack(byte bpm, byte key, byte numberOfBars, byte[][][] midiSequenceArray) {
        super(bpm, key, numberOfBars);
        super.setMidiSequence(midiSequenceArray);


    }

}




