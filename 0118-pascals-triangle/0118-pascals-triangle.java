class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        pascal.add(Arrays.asList(1));
        if (numRows == 1) { return pascal; }
        pascal.add(Arrays.asList(1, 1));

        for (int i = 1; i < numRows - 1; i++) {
            List<Integer> newRow = new ArrayList<>();
            List<Integer> lastRow = pascal.get(i);
            newRow.add(1);
            for (int j = 0; j < lastRow.size() - 1; j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            newRow.add(1);
            pascal.add(newRow);
        }

        return pascal;
    }
}