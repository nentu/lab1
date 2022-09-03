import java.util.Arrays;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        var c = new long[15-7+1];
        for(int i = 7; i<=15;i++){
            c[i-7] = i;
        }
        //System.out.println(Arrays.toString(c));

        var x = new float[13];
        for (int i = 0; i<x.length; i++){
            x[i] = (float) Math.random()*23 - (float) 13.0;
        }
        //System.out.println(Arrays.toString(x));

        var l = new double[5][13];
        for (int i=0;i < l.length;i++){
            for (int j=0;j < l[0].length; j++){
                var X = x[j];
                if (c[i] == 9){
                    l[i][j] = Math.tan(Math.pow(( ( ( Math.pow(X, X*(X-1)) + 0.5 ) / 1) / 3 ), Math.log(Math.abs(X))));
                } else if (c[i] == 7 & c[i] == 15) {
                    l[i][j] = Math.atan((X - 1.5) / 23);
                }
                else{
                    l[i][j] = Math.sin(Math.log( Math.abs( Math.pow( Math.cos(X)/( 4 - Math.asin((X-1.5)/23) ) , 2) ) ));
                }
            }
        }

        for(double[] i:l){
            for(double j:i){
                System.out.print(String.format("%.2f", j)+" ");
            }
            System.out.println("");
        }

        //System.out.println(Arrays.deepToString(l));

    }
}