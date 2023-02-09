public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length, k = 0;
        
        // if r*c != n*m, it means that the matrix is not possible
        if (r*c != n*m) return mat;
            int[][] res = new int[r][c];

        
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++,k++)
                res[i][j] = mat[k/m][k%m];
        
        return res;
    }

    public static void main(String args[]){
        int[][] mat = {{1,2},{3,4}};
        int r = 4; int c = 1;
        System.out.println("Reshaped Matrix: ");
        int[][] reshaped = matrixReshape(mat, r, c);
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(reshaped[i][j] + " ");
            }
            System.out.println();
        }
    }
}