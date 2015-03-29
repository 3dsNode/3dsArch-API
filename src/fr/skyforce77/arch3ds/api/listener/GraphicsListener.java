package fr.skyforce77.arch3ds.api.listener;

import fr.skyforce77.arch3ds.api.graphics.ArchGraphics;


public interface GraphicsListener {
	
	/**
     * Called when server need to refresh screen
     */
	public void onScreenUpdated(ArchGraphics graphics);
	
}