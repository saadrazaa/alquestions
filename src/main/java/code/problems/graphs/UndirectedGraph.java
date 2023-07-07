package code.problems.graphs;

import java.util.*;

public class UndirectedGraph {

    GraphNode hook;

    public UndirectedGraph(List<List<Integer>> edges){
        Map<Integer, GraphNode> map = new HashMap<>();

        if(edges.isEmpty()){
            hook = null;
            return;
        }

        for(List<Integer> edge : edges){
            if(edge.isEmpty()){
                hook = null;
                return;
            }

            if(!map.containsKey(edge.get(0))){
                map.put(edge.get(0), new GraphNode(edge.get(0)));
            }
            if(!map.containsKey(edge.get(1))){
                map.put(edge.get(1), new GraphNode(edge.get(1)));
            }

            GraphNode n1 = map.get(edge.get(0));
            GraphNode n2 = map.get(edge.get(1));

            n1.neighbors.add(n2);

        }

        hook = map.values().stream().toList().get(0);
    }

    public static List<List<Integer>> toAdjList(GraphNode node){
        Set<GraphNode> visited = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();

        _dfsForAdjList(node, visited, result);
        return result.stream().toList();
    }

    private static void _dfsForAdjList(GraphNode node, Set<GraphNode> visited, Set<List<Integer>> result){
        if(node == null || visited.contains(node)){
            return;
        }

        visited.add(node);

        for(GraphNode n : node.neighbors){
            result.add(Arrays.asList(node.value, n.value));
            _dfsForAdjList(n, visited, result);
        }
    }
}
