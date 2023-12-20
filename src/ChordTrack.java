<<<<<<< Updated upstream
public class ChordTrack extends Track{


    /**Generates a polyphonic chord track, given a MIDI-sequence array from
     * our MIDI Music Engine
     *
     *
     *
     * @param bpm
     * @param key
     * @param numberOfBars
     * @param midiSequenceArray
     */
    public ChordTrack(byte bpm, byte key, byte numberOfBars, byte[][][] midiSequenceArray){
        super(bpm, key, numberOfBars);
        super.setMidiSequence(midiSequenceArray);
=======
public class ChordTrack {
    private byte key, bpm, numberOfBars;
    byte[][][] midiSequenceArray;

    public ChordTrack(byte keyIn, byte bpmIn, byte numberOfBarsIn, byte[][][] midiSequenceArrayIn){
        super(bpmIn,keyIn,numberOfBarsIn);
        super.setMidiSequence(midiSequenceArrayIn);
>>>>>>> Stashed changes




    }




<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
