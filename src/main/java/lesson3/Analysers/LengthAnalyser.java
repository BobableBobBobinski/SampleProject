package lesson3.Analysers;

public class LengthAnalyser implements Analyser {
    private int maxlength;
    public LengthAnalyser(int maxlength){
        this.maxlength = maxlength;
    }
    public boolean analyse(String text) {
        if(text.length() > maxlength) {
            return false;
        }
        return true;
    }
}
