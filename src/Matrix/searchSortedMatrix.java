package Matrix;

public class searchSortedMatrix {

    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 43 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 },
                { 36, 38, 41, 55 }};

        search(mat,41);
    }

    private static void search(int[][] mat,  int target) {

        int row=mat.length-1;
        int col=mat[0].length-1;

        int i=0;
        int j=col;

        while (i<=row&&j>=0){
            if(mat[i][j]==target)
            {
                System.out.println("Found :"+i+"  "+j);
                return;
            }
            else if(mat[i][j]>target)
                j--;
            else
                i++;
        }
        System.out.println("Not Found");

    }
}
