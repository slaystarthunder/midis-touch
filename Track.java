public abstract class Track {

    private byte key, bpm, numberOfBars;

    byte[][][] midiSequenceArray;

    protected Track(byte keyIn, byte bpmIn, byte numberOfBarsIn){
        key = keyIn;
        bpm = bpmIn;
        numberOfBars = numberOfBarsIn;



    }



    protected setMidiSequence(byte[][][] midiSequenceArrayIn){

        midiSequenceArray = midiSequenceArrayIn;



    }


}
