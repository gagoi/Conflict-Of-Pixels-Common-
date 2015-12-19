package fr.cop.common.network.params;

public class MainParamList {
	public static MainParam PLAYER_UUID = new UUIDParam();
	public static MainParam PLAYER_CODE_IN_GAME = new DigitalParam(0, 9);
	public static MainParam PLAYER_PW = new PasswordParam();
	public static MainParam PLAYER_ID = new IdParam();
}
