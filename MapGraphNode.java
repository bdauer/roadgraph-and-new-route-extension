package roadgraph;


import java.util.ArrayList;
// revisit and see if these are optimal
import java.util.List;

import geography.GeographicPoint;
/**
 * @author Ben Dauer
 * 
 * A node class that represents 
 * intersections on a road map.
 * 
 * Connected together
 * by MapGraphEdge objects.
 * 
 * Stored in a MapGraph object.
 */
public class MapGraphNode {
	
	private GeographicPoint coordinates;
	private double distance;
	private double aStarWeight;
	
	// arraylists abound 
	// for speedy search/write
	private ArrayList<MapGraphNode> neighbors;
	
	// storing a list of edges in/out
	// within each node
	// to improve edge access
	// and for faster calculation of degree.
	private ArrayList<MapGraphEdge> edgesIn;
	private ArrayList<MapGraphEdge> edgesOut;

	/**
	 * Create a new empty MapGraphNode.
	 */
	public MapGraphNode(GeographicPoint coordinates) {
		
		this.neighbors = new ArrayList<MapGraphNode>();
		this.coordinates = coordinates;
		this.edgesIn = new ArrayList<MapGraphEdge>();
		this.edgesOut = new ArrayList<MapGraphEdge>();
	}
	public ArrayList<MapGraphEdge> getEdgesOut() {
		return edgesOut;
	}
	/**
	 * Add/store a one-hop intersection.
	 */
	public void addNeighbor(MapGraphNode neighbor) {
		neighbors.add(neighbor);

	}
	/**
	 * @return The list of one-hop intersections.
	 */
	public List<MapGraphNode> getNeighbors() {
		return neighbors;
	}
	/**
	 * Add/store road segments leading to the intersection.
	 */
	public void addEdgeIn(MapGraphEdge edge) {
		edgesIn.add(edge);
	}
	/**
	 * Add/store road segments leading from the intersection.
	 */
	public void addEdgeOut(MapGraphEdge edge) {
		edgesOut.add(edge);

	}
	/**
	 * @return The latitude and longitude coordinates of the intersection.
	 */
	public GeographicPoint getCoordinates() {
		return coordinates;
	}
	/**
	 * Get the distance from Start through the intersection.
	 */
	public double getDistance() {
		return distance;
	}
	/**
	 * Set the distance from Start through the intersection.
	 */
	public void setDistance(double newDistance) {
		this.distance = newDistance;
	}
	/**
	 * @return The weight calculated by A*.
	 */
	public double getAStarWeight() {
		return aStarWeight;
	}
	/**
	 * Set the weight for A*.
	 */
	public void setAStarWeight(double newWeight) {
		this.aStarWeight = newWeight;
	}
	

}