package fr.cop.common.network.params;

public class DigitalParam extends MainParam {

	private int min, max;

	public DigitalParam(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public boolean test(String txt) {
		try {
			int a = Integer.parseInt(txt);
			if (min <= a && a <= max) return true;
			else return false;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
