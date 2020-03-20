package Practise;

public class rotateMatrix {
    public static void rotateanti(int[][] mat ,int N){
        for(int i=0;i<N/2;i++){
            for(int j=i;j<N-i-1;i++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][N-1-i];
                mat[j][N-1-i]=mat[N-1-i][N-1-j];
                mat[N-1-i][N-1-j]=mat[N-1-j][i];
                mat[N-1-j][i]=temp;
            }
        }

    }
    public static void rotateClock(int[][] mat ,int N){
        for(int i=0;i<N/2;i++){
            for(int j=i;j<N-i-1;i++){
                int temp=mat[i][j];
                mat[i][j]=mat[N-1-j][i];
                mat[N-1-j][i]=mat[N-1-i][N-1-j];
                mat[N-1-i][N-1-j]= mat[j][N-1-i];
                mat[j][N-1-i]=temp;
            }
        }
    }
    static void displayMatrix(int N, int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int N = 4;
        // Test Case 1
        int mat[][] =
                        {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        rotateanti(mat,N);
        displayMatrix(N,mat);
        System.out.println("Return to Original");
        rotateClock(mat,N);
        displayMatrix(N,mat);
    }
}