class Solution {
    public int romanToInt(String s) {
        char[] char = s.toCharArray(s);
        int sum=0;
        Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
        map.set('I',1);
        map.set('V',5);
        map.set('X',10);
        map.set('L',50);
        map.set('C',100);
        map.set('D',500);
        map.set('M',1000);
        char[] order= {'I','V','X','L','C','D','M'};
        for(int i=0;i<char.length;i++){
            for(int j=0;j<order.length;j++){
                if(char[i]==order[j]){
                    for(int k=j+1;k<order.length;k++){
                        if(char[i+1]==order[j]){
                                sum=sum-map.get(char[i]);
                        }
                        
                    }
                }
            }  
        }
    }
}