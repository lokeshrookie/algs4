import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class PasclasTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numRows =  input.nextInt();

        List<List<Integer>> output = printPascal(numRows);

        System.out.println(output);

//        for(int row = 0; row<output.length(); row++){
//            for(int column = 0; column<output[0].length; column++){
//                System.out.println(output[row][column]);
//            }
//        }
    }
    public static List<List<Integer>> printPascal(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row  = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int value = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    row.add(value);
                }
            }
            ans.add(row);
        }
        return ans;
    }

//    public  static int[][] printPascal(int numRows){
//        int[][] ans = new int[5][];
//        for (int i = 0; i < numRows; i++) {
//            int[] row = new int[i];
//            for(int j = 0; j<=i; j++){
//                if(i == 0){
//                    row[j] = 0;
//                }
//                else if(i == 1){
//                    row[j] =
//                }
//            }
//
//        }
//        return ans;
//    }


}
