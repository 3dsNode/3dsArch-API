package fr.skyforce77.arch3ds.api.graphics;

import java.awt.Graphics2D;

public abstract class ArchGraphics{
	
	/**
     * Instancing with selected type and graphics
     */
	public ArchGraphics(ArchScreen screen, Graphics2D g2d, int width, int height) {}
	
	/**
     * Screen type getter
     * 
     * @return actual graphics screen
     */
	public abstract ArchScreen getScreen();
	
	/**
     * Screen graphics getter
     * 
     * @return actual graphics
     */
	public abstract Graphics2D getGraphics();
	
	/**
     * Screen width getter
     * 
     * @return graphics width
     */
	public abstract int getWidth();
	
	/**
     * Screen height getter
     * 
     * @return graphics height
     */
	public abstract int getHeight();
	
	/**
     * Called to refresh graphics
     */
	public abstract void push();

}