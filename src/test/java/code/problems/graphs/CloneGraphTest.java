package code.problems.graphs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraphTest {

    @Test
    void test(){
        GraphNode node = new UndirectedGraph(Arrays.asList(
                Arrays.asList(2,4),
                Arrays.asList(1,3),
                Arrays.asList(4,2),
                Arrays.asList(3,1),
                Arrays.asList(1,2),
                Arrays.asList(2,1)
        )).hook;

        GraphNode node2 = new UndirectedGraph(Arrays.asList(
                Arrays.asList()
        )).hook;

        GraphNode node3 = new UndirectedGraph(Arrays.asList()).hook;

        assertAll(()->{
            assertEquals(Set.copyOf(Arrays.asList(
                            Arrays.asList(2,4),
                            Arrays.asList(1,3),
                            Arrays.asList(4,2),
                            Arrays.asList(3,1),
                            Arrays.asList(1,2),
                            Arrays.asList(2,1)
                    )),
                    Set.copyOf(UndirectedGraph.toAdjList(CloneGraph.clone(node))));
            assertEquals(Set.copyOf(List.of()),
                    Set.copyOf(UndirectedGraph.toAdjList(CloneGraph.clone(node2))));
            assertEquals(Set.copyOf(List.of()),
                    Set.copyOf(UndirectedGraph.toAdjList(CloneGraph.clone(node3))));
        });
    }
}