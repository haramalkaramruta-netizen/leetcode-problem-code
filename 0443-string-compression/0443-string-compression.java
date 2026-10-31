class Solution {
    public int compress(char[] chars) {
        int readIndex=0;
        int writeIndex=0;

        while(readIndex<chars.length){
            char currentChar = chars[readIndex];
            int count = 0;


            //count duplicate char  
            while(readIndex < chars.length && currentChar==chars[readIndex]){
                readIndex++;
                count++;
            }
            //ab maere pas curr char and uska count dono hai 
            chars[writeIndex]=currentChar;
            writeIndex++;
            //now insert the count
            if(count>1){
                String countStr=String.valueOf(count);
                for(char digit: countStr.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
       //retutn the length of compresed string
       //because apna last wrint index no. of count pe hi stop hota hai to sepratel count krne ki need nhi hai
       return writeIndex;


    }
}