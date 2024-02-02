class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a=new ArrayList<>();
        int res=0;
        for(int i=1;i<10;i++){
            res=0;
        for(int j=i;j<10;j++){
            res=res*10+j;
            if(res>=low && res<=high) a.add(res);
        }  
        }
        Collections.sort(a);
        return a;
    }
}