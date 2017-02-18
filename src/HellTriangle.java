

public class HellTriangle {
	
	public int CalculateSum(int[][] input) {
		if (input == null || input.length <= 1)
			return -1;
		int last_position = 0;
		int sum = 0;
		int lenght = 0;
		
		for(int i = 0; i < input.length; i++) {
			if (lenght != 0) {
				if (lenght + 1 != input[i].length)
					return -1;
			}
			last_position = CalculateLine(input[i], last_position);
			sum += input[i][last_position];
			lenght = input[i].length;
		}
		
		return sum > 0 ? sum : -1;
	}

	private int CalculateLine(int[] input, int last_position) {
		if (input.length == 1)
			return 0;
		else
		if (input.length >= last_position + 1) {
			if (input[last_position] > input[last_position + 1])
				return last_position;
			else
				return last_position + 1;
		}
		else {
			return last_position;
		}
	}
}
