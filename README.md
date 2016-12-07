# roadgraph-and-new-route-extension

## basic description
This is a piece of a project that I worked on for a data structures course. 

I conceived the object hierarchy, implemented Dijksta's Algorithm and A* Search, and wrote an extension to find alternate routes.

It won't run because it depends on the rest of the project's code.

## detailed description

The graph represents intersections as nodes and road segments as edges. Following the spec, the weights for the shortest path algorithms
were included in the nodes. I added an additional weight to the edges. Each time an edge is traversed, the weight increments by one.
When seeking the best path out of a node, any road segment that has the highest value among its weights is ignored. This allows for the
discovery of new routes.

## the problem

I thought the problem with this approach was that it's like clockwork. One potential solution that I considered was to increment the weight
by one or two, to add more randomness. This wouldn't work, however, because then in many cases we wouldn't often get beyond the top two
segments.

# another solution

Last night I was able to break the problem down a bit more in my head. It's not the clockwork that's at issue. It's every traversed road
segment weight incrementing every time. This eliminates many closer to optimal routes.

When traversing the graph, I need to save a reference to the edge with the lowest value. Each time I traverse an edge I should compare its
weight to the current lowest weight. If the edge weight is lower, I replace it. If not, I don't. Only the first edge with the lowest value
is incremented.

## problem

This approach also has its problems. For each node, I'd end up exploring every edge out and then I'd continue along to the next node
on the original best route. Assuming that it's possible to get back to where one came from on the map without backtracking pretty easily,
I wouldn't see many novel routes and it would take a long time to discover them.

## potential solution to this problem

I could save the number of edges out in each node. Then I could divide by two. If the resulting number is less than or equal to the number
of out-edges of that node with the highest weight, and the highest weight isn't zero, then I could ignore the node's edges as candidates for lowest value.

That would cut the time to get through a node's edges into roughly half. It would eliminate the least ideal paths out. It might eliminate
some cases where no path could be found because the worst paths out aren't being taken.
