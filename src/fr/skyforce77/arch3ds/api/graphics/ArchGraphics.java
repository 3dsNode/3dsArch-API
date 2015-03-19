package fr.skyforce77.arch3ds.api.graphics;

import java.awt.Graphics2D;

public abstract class ArchGraphics{
	
	/**
     * Instancing with selected type and graphics
     */
	public ArchGraphics(ArchScreen screen, Graphics2D g2d) {}
	
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
     * Called to refresh graphics
     */
	public abstract void push();

}