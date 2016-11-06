package roadgraph;

import java.util.Comparator;

/**
 * @author Ben Dauer
 *
 * A class that compares the weight
 * 
 * -- this is the distance from Start through an intersection
 * plus the heuristic estimated distance to Goal --
 * for the AStar pathfinding algorithm.
 *
 */
public class AStarComparator implements Comparator<MapGraphNode> {

	@Override
	public int compare(MapGraphNode node1, MapGraphNode node2) {

		return Double.compare(node1.getAStarWeight(), node2.getAStarWeight());
	}
	
}