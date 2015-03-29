package fr.skyforce77.arch3ds.api.listener;

import fr.skyforce77.arch3ds.api.input.ArchAxis;

public interface AxisListener {

	/**
     * Called when axis status changed
     */
	public void onAxis(ArchAxis axis, double x, double y);
	
}