package fr.skyforce77.arch3ds.api.server;

public abstract class ServerManager {

	/**
     * Call server specific method
     *
     * @since 2.1
     * @return Object returned by called method
     */
	public static Object callMethod(ServerMethod method, Object... args){
		return null;
	}
	
	/**
     * Call server specific method
     *
     * @since 2.1
     * @return Object returned by called method
     */
	public static Object callMethod(String method, Object... args){
		return null;
	}
	
}