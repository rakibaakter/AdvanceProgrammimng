import java.util.Scanner;
class classTask1{
    public static void main(String[] args) {
        System.out.println("hello world!");
        int height=10, base=6;
        float area = 0.5F*base*height;
        System.out.println("area of triangle = "+area);   
        
        // Scanner ob = new Scanner(System.in);
        // int i = ob.nextInt();
        // String s = ob.next();
        // System.out.println(s+" "+i);

        int x = 101;
        int d,y=0,t=1;
        while(x>0){
          d=x%10;
          if(d%2==0){
            y=y+t*d;
            t=t*10;
          }
          x=x/10;
        }
        System.out.println("y = "+y+", t = "+t+", x = "+x);

        //multidimensional array
        //creating two matrices  
        int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};  
        
        //creating another matrix to store the sum of two matrices  
        int c[][]=new int[2][3];  
        
        //adding and printing addition of 2 matrices  
        for(int i=0;i<2;i++){  
            for(int j=0;j<3;j++){  
                c[i][j]=a[i][j]+b[i][j];  
                System.out.print(c[i][j]+" ");  
                }  
            System.out.println();//new line  
        }


    }
}