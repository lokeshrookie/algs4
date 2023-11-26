import java.util.*;

public class Permutations {


    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] map = new boolean[arr.length];
        permute(ans, ds, map, arr);
        System.out.println(ans);
    }

    public static void permute(List<List<Integer>> ans, List<Integer> ds, boolean[] map, int[] arr)   {
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i<arr.length; i++){
            if(map[i] == false){
                map[i] = true;
                ds.add(arr[i]);
                permute(ans, ds, map, arr);
                ds.remove(ds.size()-1);
                map[i] = false;
            }
        }

    }
}