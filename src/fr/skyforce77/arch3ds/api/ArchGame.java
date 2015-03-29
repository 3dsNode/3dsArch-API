package fr.skyforce77.arch3ds.api;

import fr.skyforce77.arch3ds.api.listener.AxisListener;
import fr.skyforce77.arch3ds.api.listener.GraphicsListener;
import fr.skyforce77.arch3ds.api.listener.InputListener;
import fr.skyforce77.arch3ds.api.listener.StylusListener;


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
	public void onEnable(){}
	
	/**
     * Called when this plugin is disabled
     */
	public void onDisable(){}
	
	/**
     * Called when server ticked
     */
	public void onTick(){}
	
	/**
     * Register AxisListener
     */
	public void addAxisListener(AxisListener listener){}
	
	/**
     * Register InputListener
     */
	public void addInputListener(InputListener listener){}
	
	/**
     * Register GraphicsListener
     */
	public void addGraphicsListener(GraphicsListener listener){}
	
	/**
     * Register StylusListener
     */
	public void addStylusListener(StylusListener listener){}
	
	/**
     * AxisListener list getter
     * 
     * @return AxisListener Array
     */
	public AxisListener[] getAxisListeners(){
		return null;
	}
	
	/**
     * InputListener list getter
     * 
     * @return InputListener Array
     */
	public InputListener[] getInputListeners(){
		return null;
	}
	
	/**
     * GraphicsListener list getter
     * 
     * @return GraphicsListener Array
     */
	public GraphicsListener[] getGraphicsListeners(){
		return null;
	}
	
	/**
     * StylusListener list getter
     * 
     * @return StylusListener Array
     */
	public StylusListener[] getStylusListeners(){
		return null;
	}
	
}