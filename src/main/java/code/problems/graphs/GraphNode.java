package code.problems.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public int value;
    public List<GraphNode> neighbors;

    public GraphNode(int value){
        this.neighbors = new ArrayList<>();
        this.value = value;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "value=" + value +
                '}';
    }
}
