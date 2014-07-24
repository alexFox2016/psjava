package org.psjava.example.algo;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.algo.sequence.rmq.RangeMinimumQueryBySquareRootApproach;
import org.psjava.algo.sequence.rmq.RangeMinimumQuerySession;
import org.psjava.algo.sequence.rmq.RangeMinimumQueryUsingSegmentTree;
import org.psjava.algo.sequence.rmq.RangeMinimumQueryUsingSparseTable;
import org.psjava.ds.array.Array;
import org.psjava.ds.array.ArrayFromVarargs;
import org.psjava.example.ds.ArrayExample;
import org.psjava.goods.GoodRangeMinimumQuery;
import org.psjava.util.DefaultComparator;

/**
 * @implementation {@link RangeMinimumQueryBySquareRootApproach}
 * @implementation {@link RangeMinimumQueryUsingSegmentTree}
 * @implementation {@link RangeMinimumQueryUsingSparseTable}
 * @see {@link ArrayExample}
 */
public class RangeMinimumQueryExample {

	@Test
	public void example() {
		Array<String> array = ArrayFromVarargs.create("A", "E", "B", "C", "G");

		RangeMinimumQuerySession session = GoodRangeMinimumQuery.getInstance().preprocess(array, new DefaultComparator<String>());

		int index1 = session.getIndex(1, 4); // must be 2, that is the index of "B" among ("E", "B", "C")
		Assert.assertEquals(2, index1);

		int index2 = session.getIndex(0, 3); // must be 0, that is the index of "A" among ("A", "E", "B")
		Assert.assertEquals(0, index2);
	}
}
