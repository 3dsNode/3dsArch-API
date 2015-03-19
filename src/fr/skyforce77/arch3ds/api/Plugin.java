package fr.skyforce77.arch3ds.api;

import java.awt.Graphics2D;

public abstract class Plugin {

	/**
     * Returns the name of the plugin
     *
     * @return name of the plugin
     */
	public abstract String getName();
	
	/**
     * Returns the version of the plugin
     *
     * @return version of the plugin
     */
	public abstract String getVersion();
	
	/**
     * Called when this plugin need to be enabled
     */
	public abstract void onInit();
	
	/**
     * Called when this plugin is enabled
     */
	public abstract void onEnable();
	
	/**
     * Called when this plugin is disabled
     */
	public abstract void onDisable();
	
	/**
     * Called when server ticked
     */
	public abstract void onTick();
	
	/**
     * Called when server need to refresh topscreen
     * 
     * @return plugin topscreen graphics
     */
	public abstract Graphics2D drawTopScreen(Graphics2D graphics);
	
	/**
     * Called when server need to refresh bottomscreen
     * 
     * @return plugin bottomscreen graphics
     */
	public abstract Graphics2D drawBottomScreen(Graphics2D graphics);
	
}