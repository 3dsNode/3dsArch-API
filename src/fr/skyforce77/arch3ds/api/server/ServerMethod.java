package fr.skyforce77.arch3ds.api.server;

public enum ServerMethod {

	DISPLAY_POPUP(false),
	DISPLAY_CONFIRM_POPUP(false),
	DISPLAY_PROMPT_POPUP(false);
	
	private boolean supported = false;
	
	private ServerMethod(boolean supported) {
		this.supported = supported;
	}
	
	public boolean isSupported() {
		return supported;
	}
	
}