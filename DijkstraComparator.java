package roadgraph;

import java.util.Comparator;

/**
 * @author Ben
 *
 * A class that compares the distance
 * from Start through an intersection
 * 
 * for the Dijkstra algorithm.
 */
public class DijkstraComparator implements Comparator<MapGraphNode> {

	@Override
	public int compare(MapGraphNode node1, MapGraphNode node2) {

		return Double.compare(node1.getDistance(), node2.getDistance());
	}
	
}