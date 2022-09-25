//Find The Smallest Missing Positive Number In Array

//Using Set
   public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int e: nums){
            if(e>0){
                set.add(e);

            }
        }

        if(set.size()==0){
            return 1;
        }
        else if(set.size()==1){
            if(set.contains(1)){
                return 2;
            }
            return 1;

        }
        int i =1;
        while(i<=set.size()){
            if (!set.contains(i)){
                return i;
            }
            i++;
        }
        return i;
    }
