package fr.skyforce77.arch3ds.api;

public enum APIVersion {

	ARABICA(1.0,1.3),
	BUBBLEGUM(2.0);
	
	private double min, max;
	
	private APIVersion(double min, double max) {
		this.min = min;
		this.max = max;
	}
	
	private APIVersion(double min) {
		this.min = min;
		this.max = min;
	}
	
	/**
     * Minimum version getter
     *
     * @return double minimum version
     */
	public double getMinimum() {
		return min;
	}
	
	/**
     * Maximum version getter
     *
     * @return double maximum version
     */
	public double getMaximum() {
		return max;
	}
	
	/**
     * Version comparator
     *
     * @return boolean APIVersion contains version
     */
	public boolean is(double version) {
		return version >= min && version < max;
	}
	
	/**
     * APIVersion name getter
     *
     * @return String name
     */
	public String getName() {
		return this.toString();
	}
	
}