public class Main{
	private static float getRandom(){
		var t = (float) (Math.random()*24-13.0);
		if (t>10) return (float) 10;
		else return t;
	}
	
	private static void write(double[][] a){
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length;j++){
				System.out.printf("%.2f ", a[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		var c = new long[5];
		for(int i=0; i< c.length; i++){
			c[i] = 7 + i*2;
		}
		
		System.out.println("c:");
		for(int i=0; i< c.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println("\n");
		
		
		var x = new float[13];
		for (int i=0;i<x.length;i++){
			x[i] = getRandom();
		}

		System.out.println("x:");
		for (int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println("\n");


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
		
		System.out.println("k:");
		write(k);
	}
}