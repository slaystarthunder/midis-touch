<<<<<<< Updated upstream
public class MelodyTrack extends Track{

    /**Generates a monophonic melody track, given a MIDI-sequence array from
     * our MIDI Music Engine
     *
     *
     *
     * @param bpm
     * @param key
     * @param numberOfBars
     * @param midiSequenceArray
     */
    public MelodyTrack(byte bpm, byte key, byte numberOfBars, byte[][][] midiSequenceArray){
        super(bpm, key, numberOfBars);
        super.setMidiSequence(midiSequenceArray);
=======
public class MelodyTrack extends Track {
    private byte key, bpm, numberOfBars;
    byte[][][] midiSequenceArray;

    public MelodyTrack(byte keyIn, byte bpmIn, byte numberOfBarsIn, byte[][][] midiSequenceArrayIn){
       super(bpmIn,keyIn,numberOfBarsIn);
       super.setMidiSequence(midiSequenceArrayIn);

>>>>>>> Stashed changes



    }




<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
