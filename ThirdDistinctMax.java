//fIND THIRD DISTINCT MAXIMUM IN ARRAY

class Solution {
    public int thirdMax(int[] nums) {
      
    Set<Integer> set = new TreeSet<>();
        
        int max = 0;
        for(int e :nums){
            if(e>max){
                max = e;
            }
        }
        
        for(int e : nums){
            set.add(e);
        }
        if(set.size()<3){
            return max;
        }

        Object[] arr = set.toArray();
        
        return (int) arr[arr.length-3];
    
    
    }
    
}
