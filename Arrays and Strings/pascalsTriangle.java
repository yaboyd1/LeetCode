class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if (numRows < 1)
			return triangle;

		List<Integer> row = new ArrayList<Integer>();
		row.add(1);

		triangle.add(row);

		for (int i = 1; i < numRows; ++i) {
			for (int j = 1; j < row.size(); ++j)
				row.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
			row.add(1);
			triangle.add(row);
		}

		return triangle;
	}
}