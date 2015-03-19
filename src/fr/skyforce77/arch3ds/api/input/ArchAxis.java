package fr.skyforce77.arch3ds.api.input;

public enum ArchAxis implements CodeIdentified{

	STICK_LEFT_X((byte)0x00),
	STICK_LEFT_Y((byte)0x01),
	STICK_RIGHT_X((byte)0x02),
	STICK_RIGHT_Y((byte)0x03);
	
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
		for(ArchAxis axis : values()) {
			if(axis.getCode() == code)
				return axis;
		}
		return null;
	}
}