package fr.skyforce77.arch3ds.api.graphics;

import java.awt.Dimension;

public abstract class ArchScreen {
	
	public ArchScreen(ArchScreenType type, Dimension size) {}
	
	/**
     * Size getter
     * 
     * @since 3.0
     * @return dimension size
     */
	public abstract Dimension getSize();
	
	/**
     * Screen type getter
     * 
     * @since 3.0
     * @return ArchScreenType type
     */
	public abstract ArchScreenType getType();
	
}