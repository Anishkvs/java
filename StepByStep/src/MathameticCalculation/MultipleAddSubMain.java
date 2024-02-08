package MathameticCalculation;

public class MultipleAddSubMain {

	public static void main(String[] args) {
		/*
		 * Perform following calculation
		 * 		(2+8)*(2+5+7)
		 */
		MultipleAddSub obj = new MultipleAddSub();
		int x =obj.sum(2, 8);
		int y =obj.sumTwo(2, 5, 7);
		obj.multi(x, y);

	}

}
