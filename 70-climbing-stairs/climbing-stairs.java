class Solution {
    public int climbStairs(int n) {
    //Map<Integer, Integer> memo = new HashMap<>();
    int a[]=new int[n+1];
    a[0]=a[1]=1;
    for(int i=2;i<=n;i++) a[i]=a[i-1]+a[i-2];
    return a[n];
    
    // private int climbStairs(int n, Map<Integer, Integer> memo) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     }
    //     if (!memo.containsKey(n)) {
    //         memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
    //     }
    //     return memo.get(n);
    }
}