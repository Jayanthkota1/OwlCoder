class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,skill[i]);
            max=Math.max(max,skill[i]);
        }
        int req=min+max;
        long res=0;
        for(int i=0;i<n;i++)
        {
           // System.out.print(req-skill[i]+"\n");
            int key=req-skill[i];
            if(map.containsKey(key) && map.get(key)>0)
            {
                   count+=1;
                   res+=(skill[i]*key);
                   map.put(key,map.get(key)-1);
            }
            else
            {
                if(map.containsKey(skill[i]))
                {
                     map.put(skill[i],map.get(skill[i])+1);
                }
                else
                {
                map.put(skill[i],1);
                }
               // System.out.print(map);
            }
        }
     //   System.out.print(count);
        if(count!=n/2) return -1;
        return res;
    }
}