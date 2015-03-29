package fr.skyforce77.arch3ds.api.listener;

import fr.skyforce77.arch3ds.api.graphics.ArchScreen;


public interface StylusListener {
	
	/**
     * Called when stylus location changed
     */
	public void onStylusMoved(ArchScreen screen, int x, int y);
	
	/**
     * Called when stylus clicked screen
     */
	public void onStylusClicked(ArchScreen screen, int x, int y);
	
	/**
     * Called when stylus pressed
     */
	public void onStylusPressed(ArchScreen screen, int x, int y);
	
	/**
     * Called when stylus released
     */
	public void onStylusReleased(ArchScreen screen, int x, int y);
	
}