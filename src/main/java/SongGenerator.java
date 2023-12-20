import java.util.Arrays;

public class SongGenerator/*(TrackGenerator?)*/ {
    /*What do we do?


    This is how we get the tones in the next chord
    We try to take a perfect third, if that´s not in our scale go down halfstep.
    Then perfect fifth, -||- ascend a half step.

    The next chord is generated looking at chord progressions. This tells us where
    the next basenote lies. From this we use the conventional way to get the actual
    chord notes.

    Mode major chord progressions
    1 0-3-4-0 -> Distances from basetone, changes in chords for chord progression
    2 0-4-5-3
    3 0-5-3-4
    4 1-4-0-0
    5 0-4-3-0
   A scale has notes. Those notes each have a corresponding chord.
   Each of those chords has to be comprised of notes from the scale (-> Movement if not in scale)



        b/t = bpm => 4*numberOfBars / t = bpm

       4*numberOfBars/ bpm = t (minutes)

        We get a key and a mode (major), from this we obtain our origin point via the key
        and then the movement distances from that origin point from the mode.

        C  D E F G A B
        Check if you can go 4 steps and land on a scale note if not you
        descend 1. Then check from OP and try and go 7 steps, if ascend 1 step.

       Major Mode: OP+2+2+1+2+2+2*

       1) OP (Key) -> Scale is obtained from *. C-D-E-F-G-A-B
       2) I try to take a +4-note from OP, if that´s not in the scale I take OP+3 instead
       3)I try to go +7 from OP. If that´s not in scale (op +7 is not part of (scale as midinumbers)) ascend 1
       <=> op + 8
       4)Use chord progression with basenote as originpoint
       op + 3 -> New base tone
       (op+3) +4 if() -> 4|3 (op+7)
       (op+3) + 7 if () ->
        over and over til filled all bars


      Melody: Take key
      Make scale (same mode as ChordTrack)
      opForChordTrack + 12 = op
      Randomizer with interval (0,12)
      op + rand -> Some MIDI-index -> Must be contained in scale
      Generate 4 singular such tones for 1 bar
     */


    public static void generateSong(byte bpm, byte key, byte numberOfBars) {


    }


    /**
     * Makes a polyphonic (3) chord-progression as a Track-object
     *
     * @param bpm
     * @param key
     * @param numberOfBars
     */
    private static byte[][][] makeChordTrack(byte bpm, byte key, byte numberOfBars) {
        /*Here each entry is a set interval from the basekey. Gives the notes of the scale*/
        /*0-3-4-0*/
        byte[] majorChordProgression = {(byte) 0, (byte) 3, (byte) 4, (byte) 0};
        byte[] scaleArray = {key, (byte) (key + 2), (byte) (key + 4), (byte) (key + 5), (byte) (key + 7), (byte) (key + 9), (byte) (key + 11)};
        byte[][][] midiSequenceArray = new byte[4][4][3];
        byte currentKey = key;
        byte third;
        byte fifth;
        byte rowCounter = 0;
        byte colCounter = 0;
        for (byte k = 0; k < numberOfBars; k++) {
            third = (byte) (currentKey + 4);
            third = (checkIfValid(scaleArray, third)) ? third : (byte) (currentKey + 3);
            fifth = (byte) (currentKey + 7);
            fifth = (checkIfValid(scaleArray, fifth)) ? fifth : (byte) (currentKey + 8);
            midiSequenceArray[rowCounter][colCounter] = new byte[]{currentKey, third, fifth};
            currentKey += majorChordProgression[(k + 1) % 4];
            colCounter = (colCounter < 3) ? colCounter++ : colCounter;
            rowCounter = (colCounter == 3) ? rowCounter++ : rowCounter;
            colCounter = (colCounter == 3) ? (byte)0 : colCounter;

        }
        System.out.println(Arrays.deepToString(midiSequenceArray));
        return midiSequenceArray;
    }

    /**
     * Generates a monophonic MelodyTrack with the spec. bpm, key etc
     *
     * @param bpm
     * @param key
     * @param numberOfBars
     */
    private static void makeMelodyTrack(byte bpm, byte key, byte numberOfBars) {


    }

    /**
     * Returns true if note is a part of the scale
     *
     * @param scaleArray
     * @param note
     * @return true if valid note from scale and false if not
     */
    private static boolean checkIfValid(byte[] scaleArray, byte note) {
        boolean isValid = false;
        byte counter = 0;

        while (!isValid || counter < scaleArray.length) {

            isValid = (note == scaleArray[counter]);

            counter++;


        }

        return isValid;


    }

}
