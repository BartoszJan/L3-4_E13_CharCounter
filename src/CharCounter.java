/**
 * Created by Bartek on 2017-07-13.
 */
public class CharCounter {

    public int CharCounter(String sentence, String letter) {
        sentence = sentence.trim().toLowerCase();
        letter = letter.trim().toLowerCase();
        if (sentence.contains(letter)) {
            int i = 0;
            while (sentence.indexOf(letter) != -1) {
            int number = sentence.indexOf(letter);
            sentence = sentence.substring(number + 1);
            i++;
        }
        return i;
        } else return 0;
    }
}
