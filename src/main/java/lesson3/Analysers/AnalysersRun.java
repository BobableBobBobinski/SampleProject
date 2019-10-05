package lesson3.Analysers;

public class AnalysersRun {
    public static void main(String[] args) {
        Analyser[] analysers = new Analyser[3];
        LengthAnalyser lengthAnalyser = new LengthAnalyser(200);
        SpamAnalyser spamAnalyser = new SpamAnalyser(new String[]{"taxes", "family problem", "lying"});
        SwearAnalyser swearAnalyser = new SwearAnalyser();
        String text = "Fuck you, taxes";
        for (int i = 0; i < analysers.length; i++) {
            System.out.println(analysers[i].analyse(text));
        }
        if(analysers.length == 2) {
            System.out.println();
        }
    }


}
