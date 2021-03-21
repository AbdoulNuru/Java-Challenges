class Interview{
    public static void spiral(int data[][]){
    int rowBegin = 0, rowEnd = data.length - 1, columnBegin = 0, columnEnd = data[0].length - 1;

        while(rowBegin <= rowEnd && columnBegin <= columnEnd){
            // Printing the first row
            for(int i = columnBegin; i <= columnEnd; i++){
                System.out.println(data[rowBegin][i]+ "");
            }
            rowBegin++;

            // printing the first column on the far right
            for(int i = rowBegin; i <= rowEnd; i++){
                System.out.println(data[i][columnEnd]+ "");
            }
            columnEnd --;

            if(rowBegin <= rowEnd){
                for(int i = columnEnd; i >= columnBegin; i--){
                    System.out.println(data[rowEnd][i]+ "");
                }

            }
            rowEnd --;

            if(columnBegin <= columnEnd){
                for (int i = rowEnd;i >= rowBegin; i--){
                    System.out.println(data[i][columnBegin]+ "");
                }

            }
            columnBegin++;


        }
    }
    public static void main (String []args){
        int[][] a = {{1,2,3,4}, {5, 6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(a);
    }
}
