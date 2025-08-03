class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows==0){
            return triangle;
        }
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        for(int i=1; i<numRows;i++){
            List<Integer> prevrow = triangle.get(i-1);
            List<Integer> currentrow = new ArrayList<>();
            currentrow.add(1);
            for(int j=1;j<i;j++){
                int sum = prevrow.get(j-1)+ prevrow.get(j);
            
            currentrow.add(sum);
            }
            currentrow.add(1);
                triangle.add(currentrow);
            }
            return triangle;
        }
    }
