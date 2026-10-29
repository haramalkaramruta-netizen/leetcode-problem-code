class Solution {
    public String reverseWords(String s) {
        //in java string is not mutable so in that problem we use the string builder
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1;

        while(i>=0){
            //remove all the traveling spaces
            while(i>=0 && s.charAt(i)== ' '){
                i--;
            }
            //check value of i
            if(i<0){
                break;
            }
            int j=i;
            //find the start index of word
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            //jaise he j space vale index pr ayega toh ruk jaoo
            //ab is woed ko apene ans mai append krdena
            ans.append(s.substring(j+1, i+1));
            //remove faltu k space and add space in ans
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //j<0,iska matlab first word k upertha-> no space need
            //j>=0 ,space needed
            if(j>=0){
                ans.append(' ');
            }
            //place i at last index of the remaining string
            i=j;
        }
    //ans.toString besause our is in stingBuilder so convert it into string 
    return ans.toString();
    }      
}