import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0,inp=-1,res=0;
		/*int li=sc.nextInt(),inp=sc.nextInt(),diff=0,lastdiff=0;
		int count=0;
		while(true){
		    diff=inp-li;
		    if(diff>0){
		        count++;
		    }
		    li=inp;
		    inp=sc.nextInt();
		    if(inp==0)
		        break;
		}*/
		int i = 0;
		long[] arr=new long[50000];
		while(inp!=0){
		    inp=sc.nextInt();
		    if(inp==0){
		     break;   
		    }
		    arr[i++]=inp;
		    count++;
		}
		for( i = 3; i<count; i++){
            if(arr[i-3] + arr[i-2] + arr[i-1] < arr[i] + arr[i-2] + arr[i-1]){
        res++;
      }
    }
		System.out.println("counter is "+ res);
	}
}
