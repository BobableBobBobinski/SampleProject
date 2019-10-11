package lesson3.Analysers;

public class KeyWordAnalyser implements Analyser {
    protected String[] keyWords;
    public boolean analyse(String text) {
        for (int i = 0; i < keyWords.length; i++) {
            if (text.contains(keyWords[i])) {
                return false;
            }
        }
        return true;
    }
}
