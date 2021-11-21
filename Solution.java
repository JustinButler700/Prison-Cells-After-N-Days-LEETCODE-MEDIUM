// Justin Butler
// 11/21/2021
/*
Runtime: 1 ms, faster than 98.08% of Java online submissions for Prison Cells After N Days.
Memory Usage: 39.3 MB, less than 49.23% of Java online submissions for Prison Cells After N Days.
*/
class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        // The given pattern repeats every 14 days. We can use this to lower time complexity.
        n = n%14==0? 14 : n%14;
        for(int i = 0; i < n; i++)
        {
            int[] next = new int[cells.length];
            for(int j = 1; j < cells.length-1; j++)
            {
                if(cells[j-1]==cells[j+1])
                {
                    next[j]=1;
                }
                else
                {
                    next[j]=0;
                }
            }
            cells = next;
        }
        return cells;
        
    }
}
