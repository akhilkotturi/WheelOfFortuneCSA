public class WofF {
    private String phrase;
    public String letterList = "";
    public String correctLetterList = "";
    
    public WofF(String p){
        phrase = p;
    }
    
    public String displayPhrase(){
        String word = "";
        String letter = "";
        System.out.println("\033[2f\033[J");
        for(int i=0;i<=(phrase.length()-1);i++){
            letter = phrase.substring(i,i+1);
            if(correctLetterList.indexOf(letter) >= 0){
                word += letter.toUpperCase();
            }
            else if(letter.equals(" ")) {
                word += letter;
            }
            else{
                word += "*";
            }
        }
        return word;
    }
    
    public String guessLetter(String let){
        letterList += let.toUpperCase();
        if(phrase.indexOf(let) >= 0) correctLetterList += let;
        return letterList;
    }
    
    public Boolean checkEqual(){
        if(phrase.equalsIgnoreCase(displayPhrase())) return true;
        return false;
    }
    
    public Boolean checkEqual(String answer){
        if(phrase.equalsIgnoreCase(answer)) return true;
        return false;
    }
    
    public String toString(){
        return displayPhrase();
    } 
    
}
