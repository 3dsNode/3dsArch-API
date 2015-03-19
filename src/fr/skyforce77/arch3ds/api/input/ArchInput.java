package fr.skyforce77.arch3ds.api.input;

public enum ArchInput implements CodeIdentified{

	BUTTON_B((byte)0x00),
	BUTTON_A((byte)0x01),
	BUTTON_Y((byte)0x02),
	BUTTON_X((byte)0x03),
	
	BUTTON_L((byte)0x04),
	BUTTON_R((byte)0x05),
	
	BUTTON_ZL((byte)0x06),
	BUTTON_ZR((byte)0x07),
	
	BUTTON_SELECT((byte)0x08),
	BUTTON_START((byte)0x09),
	
	BUTTON_UP((byte)0x0C),
	BUTTON_DOWN((byte)0x0D),
	BUTTON_LEFT((byte)0x0E),
	BUTTON_RIGHT((byte)0x0F);
	
	private byte code;
	
	private ArchInput(byte code) {
		this.code = code;
	}
	
	/**
     * Input code getter
     * 
     * @return input code
     */
	@Override
	public byte getCode() {
		return code;
	}
	
	/**
     * Input by code getter
     * 
     * @return input or null if unsuccessful
     */
	public ArchInput byCode(byte code) {
		for(ArchInput input : values()) {
			if(input.getCode() == code)
				return input;
		}
		return null;
	}
		
}