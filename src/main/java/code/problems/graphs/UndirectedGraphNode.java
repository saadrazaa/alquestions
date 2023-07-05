package code.problems.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraphNode {

    public int value;
    public List<UndirectedGraphNode> neighbors;

    private static Map<Integer, List<Integer>> REPR;

    public UndirectedGraphNode(int value){
        this.neighbors = new ArrayList<>();
        this.value = value;
    }

    public static Map<Integer, List<Integer>> toMapRep(UndirectedGraphNode node){
        REPR = new HashMap<>();
        _dfsForMapRep(node);
        return REPR;
    }

    private static void _dfsForMapRep(UndirectedGraphNode node){
        if(!REPR.containsKey(node.value)){
            REPR.put(node.value, new ArrayList<>());
        }

        for(UndirectedGraphNode n : node.neighbors){
            REPR.get(node.value).add(n.value);
            _dfsForMapRep(n);
        }
    }

}
