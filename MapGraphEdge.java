package roadgraph;

import geography.GeographicPoint;


/**
 * @author Ben Dauer
 *
 * An edge class that represents
 * road segments on a road map.
 * 
 *  Connects MapGraphNode objects.
 *  
 *  Stored in connected MapGraph objects.
 *
 */
public class MapGraphEdge {
	
	private String roadName;
	private String roadType;
	private double length;
	private GeographicPoint start;
	private GeographicPoint end;	
	private int visitedWeight;


	
	/**
	 * Create a new empty MapGraphEdge (road segment).
	 */
	public MapGraphEdge(GeographicPoint start, GeographicPoint end,
						String roadName, String roadType, double length) {
		this.start = start;
		this.end = end;
		this.roadName = roadName;
		this.roadType = roadType;
		this.length = length;
		visitedWeight = 0;
	}
	
	/**
	 * @return The length of the road segment.
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @return the ending intersection of the road segment.
	 */
	public GeographicPoint getEndpoint() {
		return end;		
	}
	public int getVisitedWeight() {
		return visitedWeight;
	}
	public void addVisitedWeight() {
		visitedWeight++;
	}

}