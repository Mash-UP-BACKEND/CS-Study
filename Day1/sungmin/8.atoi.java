class Solution {
    public int myAtoi(String str) {
        // str = "-91283472332";
        String temp = "";
        boolean numberFound = false;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ' ' && numberFound == false) continue;
            if(('0' <= c && c <= '9') || ((c == '-' || c == '+') && numberFound == false)) {
                numberFound = true;   
                temp+=c;
            }
            else {
                break;
            }
        }
        System.out.println(temp);
        try {
            return (int)Double.parseDouble(temp);
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}