public String intToRoman(int num) {
        String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] intcode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        StringBuilder s = new StringBuilder();
        for(int i =0; i<code.length; i++){
            while(num>=intcode[i]){
                s.append(code[i]);
                num-=intcode[i];
            }
        }
        
        return s.toString();
    }
