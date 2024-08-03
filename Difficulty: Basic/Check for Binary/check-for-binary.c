//{ Driver Code Starts
#include <stdio.h>
#include<string.h>

int isBinary(char *str);

// Driver program to test above functions
int main()
{
    int t;
    scanf("%d\n", &t);
    while (t--)
    {
       char str[10005];
       scanf("%s", str);
       if(isBinary(str))
       {
           printf("1\n");
       }
       else{
        printf("0\n");
       }
    }
    return 0;
}

// } Driver Code Ends


//Return 1 if true, else return 0 if not true
int isBinary(char *str)
{
    int i,c=0;
    for(i=0;str[i]!='\0';i++){
        if(str[i]=='0'|| str[i]=='1'){
            c++;
        }
        else{
            return 0;
        }
    }
    return 1;
}