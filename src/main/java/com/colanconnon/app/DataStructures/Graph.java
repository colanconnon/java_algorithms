package com.colanconnon.app.DataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by colan on 2/28/2017.
 */
public class Graph
{
    private final int V;
    private int E;
    private List<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (List<Integer>[]) new List[V];
        for (int v = 0; v < V; v++)
        {
            adj[v] = new ArrayList<>();
        }
    }

    public int V()
    {
        return V;
    }

    public int E()
    {
        return E;
    }

    public void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v)
    {
        return adj[v];
    }

}
