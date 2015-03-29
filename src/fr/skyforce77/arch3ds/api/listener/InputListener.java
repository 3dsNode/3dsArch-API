package fr.skyforce77.arch3ds.api.listener;

import fr.skyforce77.arch3ds.api.input.ArchInput;


public interface InputListener {

	/**
     * Called when input status changed
     */
	public void onInput(ArchInput input, byte status);
	
}