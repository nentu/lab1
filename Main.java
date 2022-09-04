import java.util.Arrays;
public class Main{
	private static float getRandom(){
		return (float) (Math.random()*23-10.0);
	}
	
	private static void write(double[][] a){
		for (double[] i:a){
			for (double j:i){
				System.out.printf("%.2f ", j);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		var c = new long[5];
		for(int i=0;i<c.length;i++){
			c[i] = 7 + i*2;
		}
		//System.out.println(Arrays.toString(c));
		
		var x = new float[13];
		for (int i=0;i<x.length;i++){
			x[i] = getRandom();
		}
		//System.out.println(Arrays.toString(x));

		var k = new double[5][13];
		for (int i=0;i<k.length;i++){
			for (int j=0;j<k[0].length;j++){
				var X = x[j];
				if (c[i] == 9){
					k[i][j] = Math.tan( Math.pow( ( ( Math.pow(X, X*(X - 1.0) ) + 0.5 ) / 1.0 / 3.0 ) , Math.log(Math.abs(X)) ) );
				}
				else if (c[i] == 7 | c[i] == 15){
					k[i][j] = Math.atan((X - 1.5)/23.0);
				}
				else{
					k[i][j] = Math.sin( Math.log( Math.abs( Math.pow( Math.cos(X)/(4.0 - Math.asin( (X-1.5)/23.0 )) , 2) ) ) );
				}
			}
		}
		write(k);
	}
}