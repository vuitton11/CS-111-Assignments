	public class MatrixOps
	{
		public static double[][] multiply(double[][] A, double[][] B)
		{
			double[][] result = new double[A.length][B[0].length];
			double total = 0;
			if(A[0].length != B.length){
			return null; // replace this line with your code
			
			}else{
				int i = 0;
				int j = 0;
				int k = 0;
				for(i = 0; i < A.length; i++){
						for(k = 0; k < B[i].length; k++){
							total = 0;	
							for(j = 0; j<A[0].length;j++){
								total += A[i][j] * B[j][k];
							}
							result[i][k] = total;
						}
					
				}
			}
			return result;
		}
	}


