package fr.skyforce77.arch3ds.api.input;

public enum ArchAxis implements CodeIdentified{

	STICK_LEFT((byte)0x00),
	STICK_RIGHT((byte)0x01);
	
	private byte code;
	
	private ArchAxis(byte code) {
		this.code = code;
	}
	
	/**
     * Axis code getter
     * 
     * @return axis code
     */
	public byte getCode() {
		return code;
	}
	
	/**
     * Axis by code getter
     * 
     * @return axis or null if unsuccessful
     */
	public ArchAxis byCode(byte code) {
		return null;
	}
}