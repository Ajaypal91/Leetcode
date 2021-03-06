package leetCode.general;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problem 412: Fizz Buzz
 * 
 * @author Swapnil Gaikwad
 *
 */
public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add("" + i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		FizzBuzz obj = new FizzBuzz();
		System.out.println(obj.fizzBuzz(15));
	}

}
