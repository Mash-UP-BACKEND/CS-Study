class Solution {
    
    private String sentence;
    private int numRows;
    private String result = "";
    
    public String convert(String sentence, int numRows) {
        this.sentence = sentence;
        this.numRows = numRows;
        
        if(numRows == 1) return sentence;
        execute();
        return result;
    }
    
    private void execute() {        
        for(int i=0;i<numRows;i++){
            int step = (numRows-1)*2;
            for(int j=0;j<sentence.length();j+=step){
                int startRange = j;
                int endRange = Math.min(j+step, sentence.length());
                
                int strIndex1 = j+i;
                int strIndex2 = j+step-i;
                
                addIfPossible(strIndex1, startRange, endRange);
                if (strIndex1 != strIndex2) addIfPossible(strIndex2, startRange, endRange);
            }   
        }
    }
    
    private void addIfPossible(int index, int startRange, int endRange) {
        if (isInRange(index, startRange, endRange)) result += sentence.substring(index, index+1);
    }
    
    private boolean isInRange(int index, int start, int end) {
        return start <= index && index < end;
    }
}