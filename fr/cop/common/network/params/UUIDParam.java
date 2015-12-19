package fr.cop.common.network.params;

public class UUIDParam extends MainParam {

	public boolean test(String txt) {
		if (txt.length() == 16) {
			for (int i = 0; i < txt.length(); i++) {
				if (!Character.isAlphabetic(txt.charAt(i)) && !Character.isDigit(txt.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
