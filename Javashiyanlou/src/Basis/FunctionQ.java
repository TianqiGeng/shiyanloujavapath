package Basis;

public class FunctionQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionQ gg=new FunctionQ();
		
		int kk;
		kk=gg.returnvalue(5);
		System.out.println("����ֵ"+kk);
		
	}
	public int returnvalue(int n){
		int[][] m=new int[n][n];
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				m[i][j]=++count;
				System.out.printf("%02d",m[i][j]);
			}
			System.out.println();
		}
		return count;
				
		
	}

}
