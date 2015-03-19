package fr.skyforce77.arch3ds.api.graphics;

import java.awt.Graphics2D;

public abstract class ArchGraphics extends Graphics2D{
	
	/**
     * Instancing with selected type
     */
	public ArchGraphics(ArchScreen screen) {}
	
	/**
     * Screen type getter
     * 
     * @return actual graphics screen
     */
	public abstract ArchScreen getScreen();
	
	/**
     * Called to refresh graphics
     */
	public abstract void push();

}