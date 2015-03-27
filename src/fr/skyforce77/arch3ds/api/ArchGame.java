package fr.skyforce77.arch3ds.api;

import fr.skyforce77.arch3ds.api.graphics.ArchGraphics;
import fr.skyforce77.arch3ds.api.graphics.ArchScreen;
import fr.skyforce77.arch3ds.api.input.ArchAxis;
import fr.skyforce77.arch3ds.api.input.ArchInput;

public abstract class ArchGame {

	/**
     * Returns the name of the plugin
     *
     * @return name of the plugin
     */
	public String getName(){
		return null;
	}
	
	/**
     * Returns the version of the plugin
     *
     * @return version of the plugin
     */
	public Double getVersion(){
		return null;
	}
	
	/**
     * Called when this plugin need to be enabled
     */
	public void onInit(){}
	
	/**
     * Called when this plugin is enabled
     */
	public abstract void onEnable();
	
	/**
     * Called when this plugin is disabled
     */
	public void onDisable(){}
	
	/**
     * Called when server ticked
     */
	public void onTick(){}
	
	/**
     * Called when input status changed
     */
	public void onInput(ArchInput input, byte status){}
	
	/**
     * Called when axis status changed
     */
	public void onAxis(ArchAxis axis, double x, double y){}
	
	/**
     * Called when stylus location changed
     */
	public void onStylusMoved(ArchScreen screen, int x, int y){}
	
	/**
     * Called when stylus clicked screen
     */
	public void onStylusClicked(ArchScreen screen, int x, int y){}
	
	/**
     * Called when stylus pressed
     */
	public void onStylusPressed(ArchScreen screen, int x, int y){}
	
	/**
     * Called when stylus released
     */
	public void onStylusReleased(ArchScreen screen, int x, int y){}
	
	/**
     * Called when server need to refresh screen
     */
	public abstract void drawScreen(ArchGraphics graphics);
	
}