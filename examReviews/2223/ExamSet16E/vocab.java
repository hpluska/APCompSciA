public class vocab {
    public static void main(String args[]){
        String vocabList[] = {"time","food","dogs","cats","health","plants","sports"};
        String wordList[] = {"dogs","toys","sun","plants","time"};
        String missingVocab[];
        int countNotInVocab = 0;
        String notFound = "";

        for(int i = 0; i < wordList.length; i++){
            boolean found = false;
            for(int j = 0; j < vocabList.length;j++){
                if(wordList[i].equals(vocabList[j])){
                    found = true;
                }
            }
            if(found == false){
                notFound += wordList[i] + ",";
            }
        }
        missingVocab = notFound.split(",");
        countNotInVocab = missingVocab.length;
        
    }
}
