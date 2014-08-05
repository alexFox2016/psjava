package org.psjava.ds.graph;

import org.psjava.ds.array.DynamicArray;
import org.psjava.ds.set.MutableSet;
import org.psjava.ds.set.Set;
import org.psjava.goods.GoodMutableSetFactory;

@Deprecated
public class MutableOldGraph<V, E> implements OldGraph<V, E> {

	public static <V, E> MutableOldGraph<V, E> create() {
		return new MutableOldGraph<V, E>();
	}

	private MutableSet<V> vertices = GoodMutableSetFactory.getInstance().create();
	private DynamicArray<E> edges = DynamicArray.create();

	public void insertVertex(V v) {
		vertices.addIfAbsent(v);
	}

	public void addEdge(E edge) {
		edges.addToLast(edge);
	}

	@Override
	public Set<V> getVertices() {
		return vertices;
	}

	@Override
	public Iterable<E> getEdges() {
		return edges;
	}

	@Override
	public String toString() {
		return GraphToString.toString(this);
	}

}
