class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1
        
        for (int i = 1; i <= rowIndex; i++) {
            // Calculate next element using previous element
            long nextVal = (long) row.get(i - 1) * (rowIndex - i + 1) / i;
            row.add((int) nextVal);
        }
        
        return row;
    }
}