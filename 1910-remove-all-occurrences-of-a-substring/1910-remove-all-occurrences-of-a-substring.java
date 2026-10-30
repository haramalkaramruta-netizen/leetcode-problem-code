class Solution {
    public String removeOccurrences(String s, String part) {
        //kab tak same 2 steps krne hai
        //jab tak part exist krta hai string mai

        while (s.contains(part)) {
           //search part inside s
           int index= s.indexOf(part);
           //create a new string vy combine left or right part
           s=s.substring(0,index) + s.substring(index+part.length());
        }
        
        return s;
    }
}
