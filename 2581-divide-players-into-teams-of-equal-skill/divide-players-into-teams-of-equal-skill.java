class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);
        int chem=skill[0]+skill[n-1],j=n-2;
        long res=skill[0]*skill[n-1];
        for(int i=1;i<n/2;i++,j--)
        {
            //System.out.print(skill[i]+" "+skill[j]+"\n");
            if(skill[i]+skill[j]==chem)
            {
                   res+=(skill[i]*skill[j]);
            }
            else
            {
                return -1;
            }
        }
        return res;
    }
}