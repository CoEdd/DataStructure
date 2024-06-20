package Week10.Lab;

public class q1 {
    public static void main(String[] args) {
        
        String word = "flabbergasted";
        substituteAI(word);

    }

    private static void substituteAI(String word) {
        char[] chararray = word.toCharArray();

        char[] news = new char[word.length()];

        for(int i = 0; i < word.length(); i++){
            if(chararray[i] == 'a'){
                news[i] = 'i';
            }else{
                news[i] = chararray[i];
            }
        }

        for(int i = 0; i < word.length(); i++){
            System.out.print(news[i]);
        }
    }
}
