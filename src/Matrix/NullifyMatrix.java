package Matrix;

public class NullifyMatrix {

    public static void main(String[] args) {
        int [ ] [ ] mat = {   { 20, 18, 0, 20, 16 },
                { 18, 20, 18, 21, 20 },
                { 16, 18, 16, 0, 24 },
                {  0, 24, 22, 24, 25 }
        };
        nullify(mat);
        printMatrix(mat);

    }

    private static void nullify(int[][] mat) {

        Boolean col_ind=false;
        Boolean row_ind=false;
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0)
                col_ind=true;
        }
        for(int i=0;i<mat[0].length;i++){
            if(mat[0][i]==0)
                row_ind=true;
        }
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }

        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0)
                nullifyRow(mat,i);
        }

        for(int i=0;i<mat[0].length;i++){
            if(mat[0][i]==0)
                nullifyCol(mat,i);
        }

        if(col_ind)
            nullifyCol(mat,0);
        if(row_ind)
            nullifyRow(mat,0);

    }

    private static void nullifyRow(int[][] mat,int row) {
        for(int i=0;i<mat[row].length;i++){
            mat[row][i]=0;
        }
    }
    private static void nullifyCol(int[][] mat,int col) {
        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }




        private static void printMatrix(int[][] mat) {

            for(int i=0;i<mat.length;i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println(" ");
            }
    }
}
