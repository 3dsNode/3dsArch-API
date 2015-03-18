package fr.skyforce77.arch3ds.api;

import java.awt.Graphics2D;

public interface Plugin {

	/**
     * Returns the name of the plugin
     *
     * @return name of the plugin
     */
	public String getName();
	
	/**
     * Returns the version of the plugin
     *
     * @return version of the plugin
     */
	public String getVersion();
	
	/**
     * Called when this plugin need to be enabled
     */
	public void onInit();
	
	/**
     * Called when this plugin is enabled
     */
	public void onEnable();
	
	/**
     * Called when this plugin is disabled
     */
	public void onDisable();
	
	/**
     * Called when server ticked
     */
	public void onTick();
	
	/**
     * Called when server need to refresh topscreen
     * 
     * @return plugin topscreen graphics
     */
	public Graphics2D drawTopScreen(Graphics2D graphics);
	
	/**
     * Called when server need to refresh bottomscreen
     * 
     * @return plugin bottomscreen graphics
     */
	public Graphics2D drawBottomScreen(Graphics2D graphics);
	
}