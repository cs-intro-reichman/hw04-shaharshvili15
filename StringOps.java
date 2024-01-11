public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.print(allIndexOf("MMSMM",'M'));
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String newString = "";
        char[] vowels = new char[]{'a','e','i','o','u'};
        for(int i=0 ; i<string.length(); i++){
            boolean isVowel= false;
            for (int j= 0 ; j<vowels.length;j++){
                if(string.charAt(i) == vowels[j]){
                    isVowel = true;
                }
            }
            //checks if the char is upper case
            if(string.charAt(i) <=90 && string.charAt(i) >= 65){
                if(isVowel == false){
                    newString += (char) (string.charAt(i)+32);
                }
                else{
                    newString += string.charAt(i);
                }
            }
            //checks if the char is lower case
            else if(string.charAt(i) <=122 && string.charAt(i) >= 97){
                if(isVowel== true){
                    newString += (char) (string.charAt(i)-32);
                }
                else{
                    newString += string.charAt(i);
                }
            }
            else {
                newString += string.charAt(i);
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String newString = "";
        boolean didSeeFirstLetter = false;
        boolean nextCharCapital = false;
        for (int i = 0 ; i<string.length(); i++){
            if(string.charAt(i) == 32){
                if(didSeeFirstLetter){
                    nextCharCapital = true;
                }
            }
            else{
                if(!didSeeFirstLetter){
                    didSeeFirstLetter = true;
                }
                if(nextCharCapital == true){
                    if(string.charAt(i) <=122 && string.charAt(i) >= 97){
                        newString += (char) (string.charAt(i)-32);
                    }
                    else{
                        newString += string.charAt(i);
                    }
                }
                else{
                    if(string.charAt(i) <=90 && string.charAt(i) >= 65){
                        newString += (char) (string.charAt(i)+32);
                    }
                    else{
                        newString += string.charAt(i);
                    }
                }
                nextCharCapital= false;
            }
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int numberOfTimesChar= 0;
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == chr){
                numberOfTimesChar++;
            }
        }
        int[] indexesOfChar = new int[numberOfTimesChar];
        int indexOfArray = 0;
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == chr){
                indexesOfChar[indexOfArray] = i;
                indexOfArray++;
            }
        }
        return indexesOfChar;
    }
}
