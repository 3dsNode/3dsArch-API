package fr.skyforce77.arch3ds.api;


public abstract class ArchAPI {
	
	/**
     * API actual version
     */
	public static double getAPIActualVersion() {
		return 1.2;
	}
	
	/**
     * API version
     */
	public static APIVersion getAPIVersion() {
		return APIVersion.ARABICA;
	}
	
	/**
     * Server version
     */
	public static double getServerVersion() {
		return 0.0;
	}
	
	/**
     * Server name
     */
	public static String getServerName(){
		return "";
	}
}