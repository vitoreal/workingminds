package br.com.workingminds;

public class Teste02 {

	public static void main(String[] args) {
		
		spiralMatrix();

	}
	
	public static void spiralMatrix() {
		
        int n = 5; 
        int[][] spiral = new int[n][n];
         
        int cont = 1;
        int colunaMin = 0;
        int colunaMax = n-1;
        int minRow = 0;
        int maxRow = n-1;
        int valorTotal = n*n;
    
        while (cont <= valorTotal)
        {
            for (int i = colunaMin; i <= colunaMax; i++)
            {
                spiral[minRow][i] = cont;
                cont++;
            }
            
            for (int i = minRow+1; i <= maxRow; i++)
            { 
                spiral[i][colunaMax] = cont; 
                cont++; 
            } 
             
            for (int i = colunaMax-1; i >= colunaMin; i--)
            {
                spiral[maxRow][i] = cont;
                cont++;
            }
             
            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                spiral[i][colunaMin] = cont;
                cont++;
            }
             
            colunaMin++;
            minRow++;
            colunaMax--;
            maxRow--;
        }
         
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }
             
            System.out.println();
        }
    }
        

}
