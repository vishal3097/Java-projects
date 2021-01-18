import java.util.Scanner;
public class VD {
  int m = 5;
  int s[]={10,11,7,15,6};
  int b[]={9,4,5,2,3};
  int r[]={4,8,6,7,3};
  static int ttia;
  
  public static void main(String[] args) 
      {
	VD v = new VD();
	v.so();
	v.ti();
	v.re();
       }
  int tsti(int k)
  {
	 int t=0;
	 for (int l=0;l<=k;l++)
	 {
	   t = t + s[l];
	 }
	 	return t;
  }
    
  void ti()
  {
	 for (int k=m-1;k>0;k--)
	 {
	   if ( (b[k-1] + r[k-1]) < (s[k] + b[k] + r[k]) )
	   {
	     ttia = tsti(k) + b[k] + r[k];
	     break;
	   }
	   else
	   {
	     ttia = tsti(k-1) + b[k-1] + r[k-1];
	   }
	 }
    }
    void so()
  {
	 int csw, cbi, cru;
	 for (int k=0;k<m;k++)
	 {
		 for(int l=k;l<m;l++)
	     {
	       if((b[k] + r[k]) < (b[l] + r[l]))
	        {
	          csw   = s[l];
	          s[l] = s[k];
	          s[k] = csw;

	          cbi   = b[l];
	          b[l] = b[k];
	          b[k] = cbi;

	          cru   = r[l];
	          r[l] = r[k];
	          r[k] = cru;
	        }
	      }
	    } 
  }
    void re()
    {
      for (int k=0;k<m;k++)
      {
	System.out.println("Contestant : " + (k+1));
	System.out.println("swim" + " = " +  s[k] + "; bike " + " = "+ b[k]+ "; run" + " = "+ r[k]);
       }
       System.out.println("\n Total completion time required for all three activities : " + ttia);
      }   
}