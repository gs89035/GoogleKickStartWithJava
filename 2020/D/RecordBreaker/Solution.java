package D1.RecordBreaker;



import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Solution {

	// Discuss this round on Codeforces: https://codeforces.com/
	
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;
	static String output="";

	public static void main(String[] args) {
		try {
		        //input 
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			int tests = scanInt();
			
			//logic
			for (int test = 1; test <= tests; test++) {
				solve(test);
			}
			
			//output
			output();
			
			
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}

	static void solve(int test) throws Exception {
		int n = scanInt();
		
		int ans = 0;
		//main logic
		
		int rec=-1;
		boolean ar=false;
		for(int i=1;i<=n;++i)
		{
		    int cur=scanInt();
		 
            if(i==1)
            {
                if(n==1 )
                {
                	++ans;
                }
                else
                {
                	rec=cur;
                }
            }
            else if(i==n && cur>rec)
            {
                ++ans;
            }
            else
            {
                if(cur<rec && ar==false)
                {
                   ++ans;
                   ar=true;
                }
                else if(cur>rec)
                {
                    rec=cur;
                    ar=false;
                }
            }
		}	
		output+="case #"+test+": "+ans+"\n";
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	
	static void output()
       {
                out.println(output);
       }
    

	
}