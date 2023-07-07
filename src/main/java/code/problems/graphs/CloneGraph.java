package code.problems.graphs;

import java.util.HashMap;
import java.util.Map;

/*
Problem:
Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

Constraints:
The number of nodes in the graph is in the range [0, 100].
1 <= Node.val <= 100
Node.val is unique for each node.
There are no repeated edges and no self-loops in the graph.
The Graph is connected and all nodes can be visited starting from the given node.
 */
public class CloneGraph {

    public static GraphNode clone(GraphNode node){
        Map<GraphNode, GraphNode> map = new HashMap<>();

        return node != null ? _dfs(node, map) : null;
    }

    private static GraphNode _dfs(GraphNode node, Map<GraphNode, GraphNode> map){
        if(map.containsKey(node)){
            return map.get(node);
        }

        GraphNode copy = new GraphNode(node.value);
        map.put(node, copy);

        for(GraphNode n : node.neighbors){
            copy.neighbors.add(_dfs(n, map));
        }
        return copy;

    }
}
