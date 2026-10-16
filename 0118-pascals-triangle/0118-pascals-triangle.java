import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        // List<List<Integer>> triangle = new ArrayList<>();

        // for (int i = 0; i < numRows; i++) {
        //     List<Integer> row = new ArrayList<>();
        //     for (int j = 0; j <= i; j++) {
        //         if (j == 0 || j == i) {
        //             row.add(1);
        //         } else {
        //             int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
        //             row.add(val);
        //         }
        //     }
        //     triangle.add(row);
        // }
        // return triangle;

        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                int val=nCr(i,j);
                row.add(val);
            }
            triangle.add(row);
        }
        return triangle;
    }
    public int nCr(int i, int j){
        int res=1;
        for(int k=0;k<j;k++){
            res=res*(i-k);
            res=res/(k+1);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna