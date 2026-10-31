class Solution {
    static boolean compareFreq(int[] count1,int[] count2){
        for(int i=0; i<26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        //algo wise-> 
        //check basic--> s1 shar present in s2 or not
        //s1 ka table ready rakhte hai (freq)
        //s2 ki first window ko process kelrte hai
        //or s2 ki remaingn window ko process kelete ha0i
        if(s1.length() >s2.length()){
            return false;
        }
        //s1 ka freq table
        int count1[] = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            int index = ch - 'a';//index will be get from this
            count1[index]++;
        }

        int i=0;
        int windowLength=s1.length();
        int count2[]= new int [26];
        //first window ka freq table

        for(i=0; i<windowLength;i++){
            char ch= s2.charAt(i);
            int index = ch - 'a';//index will be get from this
            count2[index]++;
        }
        if(compareFreq(count1,count2) ==true){
            return true;
        }
        else{
            //both freq table are not same
            //process remaining window
            while(i< s2.length()){
               //new window pr move krre ho.to new char ko freq table mai add kr le
               char newChar= s2.charAt(i);
               int newCharIndex= newChar-'a';
               count2[newCharIndex]++;

               //old char ki entry ko table se remove kr do
               int oldCharIndex= i-windowLength;
               char oldChar = s2.charAt(oldCharIndex); 
               int freqTableIndexOfOldChar =oldChar -'a';
               count2[freqTableIndexOfOldChar]--;


               //apke pass updated table aa gaya hai new window kw liya
               //isko compare karo s1 se 
               if(compareFreq(count1,count2)==true){
                    return true;

               }
               //yaha pr i++krna need hai
               i++;
            }
        }
        return false;

    }
}