class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> lastRow = Arrays.asList(1, 1);

        pascal.add(Arrays.asList(1));
        if (numRows == 1) { return pascal; }
        pascal.add(Arrays.asList(1, 1));

        for (int i = 2; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 0; j < lastRow.size() - 1; j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            newRow.add(1);
            pascal.add(newRow);
            lastRow = newRow;
        }

        return pascal;
    }
}