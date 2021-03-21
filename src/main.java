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
    public static void main (String []args){
//        int[][] a = {{1,2,3,4}, {5, 6,7,8},{9,10,11,12},{13,14,15,16}};
//        spiral(a);

        String a = "LISTEN";
        String b = "SILENT";

        anagramChecker(a, b);
//        anagramChecker2(a, b);
    }
}
