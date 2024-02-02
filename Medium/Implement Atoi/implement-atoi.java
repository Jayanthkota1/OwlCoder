//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends

//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
        if(s.charAt(0)-'0'>9 && s.charAt(0)<0) return -1;
	    int res=0;
	    boolean neg=s.charAt(0)=='-';
	    int k=0;
	    if(neg) k=1;
	    for(int i=k;i<s.length();i++){
	        if(s.charAt(i)-'0'<10 && s.charAt(i)-'0'>=0) {
	            res=res*10+(s.charAt(i)-'0');
	            //System.out.print((s.charAt(i)-'0')+" "+(s.charAt(i))+" \n");
	        }
	        else return -1;
	    }
	    if(neg) return (-1)*res;
	    return res;
    }
}
