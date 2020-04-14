package DivideAndConquor;

public class Binary2D {

    // Java program for implementation of divide and conquer algorithm
// to find a given key in a row-wise and column-wise sorted 2D array

        public static void main(String[] args)
        {
            int[][] mat = new int[][] { {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
            int rowcount = 4,colCount=4,key=50;
         //   for (int i=0; i<rowcount; i++)
          //  {  for (int j=0; j<colCount; j++)
            //    {
                    search(mat, 0, rowcount-1, 0, colCount-1, mat[2][2]);
        //}}
        }

        // A divide and conquer method to search a given key in mat[]
        // in rows from fromRow to toRow and columns from fromCol to
        // toCol
        public static void search(int[][] mat, int fromRow, int toRow,
                                  int fromCol, int toCol, int key)
        {
            if(fromCol>toCol || fromRow>toCol){
                return;
            }

            // Find middle and compare with middle
            int i = fromRow + (toRow-fromRow )/2;
            int j = fromCol + (toCol-fromCol )/2;

if(fromCol<=toCol && fromRow<=toCol){
    if (mat[i][j] == key) // If key is present at middle
    {  System.out.println("Found "+ key + " at "+ i +" " + j);
    return;
    }

    else if(mat[i][j] < key){
        //search grater
        if(key>=mat[fromCol][j] && key <=mat[i][toCol]){
            search(mat,fromRow,i,j,toCol,key);

        }
        if(key>=mat[i][j] && key <=mat[toRow][toCol]){
            search(mat,i,toRow,j,toCol,key);

        }


        //   search(mat,fromRow,i,j,toCol,key);


    }
    else if(mat[i][j] > key){
        if(key>=mat[fromRow][fromCol] && key <=mat[i][j]){

            search(mat,fromRow,i,fromCol,j,key);}
        if(key>=mat[i][fromCol] && key <=mat[toRow][j]){

            search(mat,i,toRow,fromCol,j,key);}

        //  search(mat,i,toRow,j,toCol,key);


    }

}

        }
    }


