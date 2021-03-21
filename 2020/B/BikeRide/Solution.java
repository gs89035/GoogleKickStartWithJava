import java.util.*;


class Solution{
    
    public static void main(String args[])throws Exception 
    {
        Solution sol=new Solution();
        int tcc=sol.si();
        sol.solve(tcc);
        
    }
    
     void solve(int tcc)
    {
        
        ArrayList al=new ArrayList();
        LinkedList ll=new LinkedList();
        ArrayDeque adq=new ArrayDeque();
        PriorityQueue pq=new PriorityQueue();
        TreeSet ts=new TreeSet();
        HashSet hs=new HashSet();
        LinkedHashSet lhs=new LinkedHashSet();
        
        for(int i=0;i<0;++i)
        {
            for(int j=0;j<0;j++)
            {
            }
        }    
        
        // while(false)
        // {
            
        // }
    }
        
    void output(int tc,int answer)
    {
        System.out.println("case #"+tc+": "+answer);
    }
    
    //single integer input
    int si()
    {

        Scanner scan=new Scanner(System.in);
        int x= Integer.parseInt(scan.nextLine());
        scan.close();
        return x;
    }
    
    //Multiple integer input in single line saprated by space
    ArrayList<Integer> miInput()
    {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        String[] s1=s.split(" ",0);
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<s1.length;++i)
        {
            al.add(Integer.parseInt(s1[i]));
        }
        scan.close();
        return al;
        
    }
    
    
    //single string input
    String ssi()
    {

        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        scan.close();
        return s;
        
    }
    
    //Multiple String input in single line saprated by space
    String[] msiInput()
    {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        String[] s1=s.split(" ",0);
        scan.close();
        return s1;
        
    }    
        
}
