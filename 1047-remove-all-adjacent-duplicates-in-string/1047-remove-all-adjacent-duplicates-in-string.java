class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans= new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            //compare ans ke right most char ko current char se
            if(ans.length()>0 && ans.charAt(ans.length()-1) ==ch){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                //if this are 2 diff char
                ans.append(ch);

            }
        }
        return ans.toString();
    }
}