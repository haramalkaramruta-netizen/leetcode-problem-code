class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        HashSet<Integer> seenFreq = new HashSet<>();
        HashSet<Integer> dupFreq = new HashSet<>();
        for (int f : freq.values()) {
            if (!seenFreq.add(f)) {
                dupFreq.add(f);
            }
        }
        for (int num : nums) {
            if (!dupFreq.contains(freq.get(num))) {
                return num;
            }
        }
        
        return -1;
        
    }
}