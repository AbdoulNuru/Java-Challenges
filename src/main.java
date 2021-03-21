import java.sql.SQLOutput;
import java.util.Arrays;

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

    public static boolean anagramChecker(String a, String b){
        char[]  firstValue = a.toLowerCase().toCharArray();
        char[] secondValue = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            System.out.println("nOT ANAGRAM");
            return false;
        }

        Arrays.sort(firstValue);
        Arrays.sort(secondValue);

        for(int i = 0; i < firstValue.length; i++){
            if(firstValue[i] == secondValue[i])
                System.out.println("anagram");
                return true;
        }
        System.out.println("not anagram");
        return false;
    }

    public static boolean anagramChecker2(String a, String b){
        int range = 256;
        int [] counter = new int[range];
        String firstValue = a.toLowerCase();
        String secondValue = a.toLowerCase();

         if(a.length() != b.length()){
             System.out.println("not anagram");
             return false;
         }

         for(int i = 0; i < a.length(); i++){
             counter[firstValue.charAt(i)]++;
             counter[secondValue.charAt(i)]--;
         }

         for(int i = 0; i < range; i++){
             if(counter[i] != 0){
                 System.out.println("not anagram");
                 return false;
             }
         }
        System.out.println("anagram");
         return true;
    }

    static int minimumOperations(int n)
    {

        // Storing the minimum operations
        // to obtain all numbers up to N
        int operations[] = new int[n + 1];

        // Initilal state
        operations[1] = 0;

        // Iterate for the remaining numbers
        for(int i = 2; i <= n; i++)
        {
            operations[i] = Integer.MAX_VALUE;

            // If the number can be obtained
            // by multiplication by 2
            if (i % 2 == 0)
            {
                int x = operations[i / 2];
                if (x + 1 < operations[i])
                {
                    operations[i] = x + 1;
                }
            }


            // Obtaining the number by adding 1
            int x = operations[i - 1];
            if (x + 1 < operations[i])
            {
                operations[i] = x + 1;
            }
        }

        // Return the minm operations
        // to obtain n
        return operations[n]+1;
    }

    public static void main (String []args){
//        int[][] a = {{1,2,3,4}, {5, 6,7,8},{9,10,11,12},{13,14,15,16}};
//        spiral(a);

//        String a = "LISTEN";
//        String b = "SILENT";
//
//        anagramChecker(a, b);
//        anagramChecker2(a, b);

//        System.out.println(minimumOperations(7));
    }
}
