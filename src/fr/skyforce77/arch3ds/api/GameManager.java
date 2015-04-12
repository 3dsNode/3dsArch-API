package fr.skyforce77.arch3ds.api;

/**
 * Replaced by ServerManager
 */
@Deprecated
public abstract class GameManager {

	/**
     * Call server specific method
     *
     * @return boolean method exists and called successfully
     */
	public static boolean callGameMethod(String method, Object... args){
		return false;
	}
	
}