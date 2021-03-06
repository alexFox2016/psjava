package org.psjava.example.algo;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.algo.graph.matching.HopcroftKarpAlgorithm;
import org.psjava.algo.graph.matching.MaximumBipartiteMatchingResult;
import org.psjava.ds.graph.MutableBipartiteGraph;

/**
 * @see {@link HopcroftKarpAlgorithmExample}
 */
public class MaximumBipartiteMatchingExample {

    @Test
    public void example() {
        MutableBipartiteGraph<String> g = MutableBipartiteGraph.create();

        g.insertLeftVertex("L1");
        g.insertLeftVertex("L2");
        g.insertLeftVertex("L3");

        g.insertRightVertex("R1");
        g.insertRightVertex("R2");

        g.addEdge("L1", "R1");
        g.addEdge("L1", "R2");
        g.addEdge("L2", "R1");
        g.addEdge("L3", "R1");

        MaximumBipartiteMatchingResult<String> result = HopcroftKarpAlgorithm.getInstance().calc(g);

        int matchCount = result.getMaxMatchCount(); // must be 2
        String matchOfL1 = result.getMatchedVertex("L1"); // must be "R2".

        Assert.assertEquals(2, matchCount);
        Assert.assertEquals("R2", matchOfL1);
    }
}
