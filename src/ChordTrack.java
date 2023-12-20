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




    }




}