class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();

        pascal.add(Arrays.asList(1));
        pascal.add(Arrays.asList(1, 1));

        if (rowIndex <= 1) { return pascal.get(rowIndex); }

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            List<Integer> lastRow = pascal.get(i - 1);
            newRow.add(1);
            for (int j = 0; j < lastRow.size() - 1; j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            newRow.add(1);
            pascal.add(newRow);
        }

        return pascal.get(rowIndex);
    }
}