class Solution { 
    public List<List<Integer>> fourSum(int[] nums, int target) { 
        List<List<Integer>> result = new ArrayList<>(); 
        
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums); 
        
        for (int i = 0; i < nums.length - 3; i++) { 
            if (i > 0 && nums[i] == nums[i - 1]) { 
                continue; 
            } 
            
            for (int j = i + 1; j < nums.length - 2; j++) { 
                if (j > i + 1 && nums[j] == nums[j - 1]) { 
                    continue; 
                } 
                
                int b = j + 1; 
                int c = nums.length - 1; 
                
                while (b < c) { 
                    long sum = (long) nums[i] + nums[j] + nums[b] + nums[c]; 
                    
                    if (sum < target) { 
                        b++; 
                    } else if (sum > target) { 
                        c--; 
                    } else { 
                        result.add(Arrays.asList(nums[i], nums[j], nums[b], nums[c])); 
                        
                        while (b < c && nums[b] == nums[b + 1]) { 
                            b++; 
                        } 
                        while (b < c && nums[c] == nums[c - 1]) { 
                            c--; 
                        } 
                        
                        b++; 
                        c--; 
                        
                    } 
                } 
            } 
        } 
        return result; 
    } 
}
