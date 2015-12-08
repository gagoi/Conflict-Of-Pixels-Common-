package fr.cop.common;

public class Param {

	private int paramType;

	private String[] avaibleValues;
	private int size;
	private String value;

	public static final Param PLAYER_ID = new Param(0, 4);
	public static final Param ITEM_ID = new Param(0, 50);
	public static final Param PLAYER_UUID = new Param(16);
	public static final Param PLAYER_PW = new Param("");

	public static final int TYPE_MIN_MAX = 1;
	public static final int TYPE_ARRAY_STRING = 0;
	public static final int TYPE_SIZE = 2;

	public Param(String[] avaibleValues) {
		this.avaibleValues = avaibleValues;
		paramType = TYPE_ARRAY_STRING;
	}
	
	public Param(String avaibleValue) {
		this.avaibleValues = new String[]{avaibleValue};
		paramType = TYPE_ARRAY_STRING;
	}

	public Param(int size) {
		this.size = size;
		paramType = TYPE_SIZE;
	}

	public Param(int min, int max) {
		paramType = TYPE_MIN_MAX;
	}

	public boolean test(String value) {
		switch (paramType) {
			case 1:
				for (String val : avaibleValues) {
					if (value.equals(val)) return true;
				}
				return false;
			case 2:
				return value.length() == this.size;
		}
		return false;
	}

	public String getValue() {
		return value;
	}

}
