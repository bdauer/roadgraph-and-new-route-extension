package roadgraph;

import java.util.Comparator;

public class EdgeVisitComparator implements Comparator<MapGraphEdge> {
	
	@Override
	public int compare(MapGraphEdge edge1, MapGraphEdge edge2) {
		return Double.compare(edge1.getVisitedWeight(), edge2.getVisitedWeight());
	}
}

