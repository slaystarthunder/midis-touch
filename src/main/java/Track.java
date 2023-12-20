public abstract class Track{
    /*A track is a collection of notes played in sequence*/

    /*Can hold 2^8, 256, far more bpm than necessary*/
    protected byte bpm;

    protected byte key;
    protected byte numberOfBars;
    /*Inside of the midi-array we have a number of rows (taktblock) and
    a number of bars per row (ex: 4) and for each bar we can have either
    1 tone (melody) or three (chord)
     */
    protected byte[][][] midiSequenceArray;
    protected Track(byte bpmIn, byte keyIn, byte numberOfBarsIn){
        /*This sets the properties of the track*/
        /*Beats per minute is total number of bars / time in minutes*/
        bpm = bpmIn;
        /*Input as its corresponding MIDI-index*/
        key = keyIn;
        /*The total number of bars*/
        numberOfBars = numberOfBarsIn;






    }

    /**This method sets the Midi-Sequence for the track
     *
     *
     * @param midiSequenceArrayIn
     */
    public void setMidiSequence(byte[][][] midiSequenceArrayIn){
        midiSequenceArray = midiSequenceArrayIn;



    }

    protected byte getBPM(){
        return bpm;



    }

    protected byte getKey(){

        return key;


    }


    protected byte getnumberOfBars(){

        return numberOfBars;


    }






}