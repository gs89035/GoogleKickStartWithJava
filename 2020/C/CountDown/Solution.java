package C1.CountDown;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Solution {

	// Discuss this round on Codeforces: kc=k;
	
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
		
		int k = scanInt();

		int ans = 0;
		
		
//		cur = 0;
// 		for (int i = 0; i < n; i++) {
			
// 			int a = scanInt();
// 			if (a == k) {
// 				cur = k;
// 			} else if (a == cur - 1) {
// 				cur = a;
// 				if (a == 1) {
// 					++ans;
// 				}
// 			} else {
// 				cur = 0;
			
// 			}
// 		}
		
		
		  int kc=k;
		  for(int i=0;i<n;++i)
          {
			 int a=scanInt();
      	    if(a==kc) {
      	    	if(kc==1) 
      	        	{   
      	    		 kc=k;
   			   		 ++ans;
      	            }
      	    	else
      	    	{
   			  	    --kc;
      	        }
      	    }
   			   		
      	    else if(a==k) {
      	    	kc=k-1;
      	    }
      	    	
      	    else {
      	    	kc=k;
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

//	static void printCase() {
//		//out.print("Case #" + test + ": ");
//	}
//
//	static void printlnCase() {
//		//out.println("Case #" + test + ":");
//	}
	
	static void output()
       {
                out.println(output);
       }	
}