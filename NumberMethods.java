public class NumberMethods
{
	public static void main(String[]args){

    }
    public static int  minimumInt(int a, int b){

        if(a < b){
            return a;
        }

        return b;
    }
    public static int  maximumInt(int a, int b){

        if(a > b){
            return a;
        }

        return b;
    }
    public static double minimumDouble(double a, double b){

       if(a < b){
            return a;
        }

        return b;
    }
    public static double maximumDouble(double a, double b){

        if(a > b){
            return a;
        }

        return b;
    }
    public static int median(int a, int b, int c){

        /*int numb[] = [a,b,c];
        int temp;

        for(int i=0; i < 3; i++){  
            for(int j=1; j < 2; j++){  
                if(numb[j-1] > numb[j]){  
                     //swap elements  
                    temp = numb[j-1];  
                    numb[j-1] = numb[j];  
                    numb[j] = temp;
                    }
            }
        }
        return numb[1];
        */

        if((a<=b&&a>=c)||(a>=b&&a<=c)){
            return a;
        }else if((b<=a&&b>c)||(b>=a&&b<=c)){
            return b;
        }
        return c;
    }
    public static double average(int a, int b, int c, int d, int e){

        return (double)(a+b+c+d+e)/5;
    }
    public static boolean isEven(int num){

        if(num % 2 ==0){
            return true;
        }

        return false;
    }
    public static int sumEvenNumbersUpTo(int upTo){

        int sum = 0;

        for(int i = 0;i<=upTo;i+=2){
                sum +=i;
             
        }
        return sum;
    }
    public static double percentage(int a, int b){
        
         return (double)a/b*100;
    }
    public static double solveEquation(int a, int b){

        if(a == 0){
            return 0;
        }
        return (double)-b/a;
    }
}	


/*
median
parameters	results
7	8	11		8
0	2 	5		2
4	7	5		5
0	0	0		0
-1	-2	-3		-2
-3	2	1		1
0	-1	1		0
*/

/*
isEven
parameters	results
	0			1
	5			0
	7			0	
	4			1
	-2			1
	-37			0
*/

/*
sumAllNumbers
parameters	results
	4			10
	3			6
	7			28
	1			1
	0,negatives	undefined

*/

