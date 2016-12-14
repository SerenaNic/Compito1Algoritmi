package it.unirc.ing.infolab.alg_s_dati.compito1;

import java.util.LinkedList;
import java.util.ListIterator;
import org.apache.commons.collections15.Transformer;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraDistance;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.UndirectedSparseGraph;


public class Cittadella {
  private UndirectedGraph<Facolta, Tratta> g;

  public Cittadella() { 
    g=new UndirectedSparseGraph<Facolta, Tratta>(); 
  }

  public void m1(Facolta f1, Facolta f2, Double l) {
    if(g.findEdge(f1, f2)==null)
      g.addEdge(t, f1, f2);
  }
  
  public LinkedList<Facoltà> m2(LinkedList<Facoltà> facoltaList, int k, int m){
    LinkedList<Facoltà> res = new LinkedList<Facoltà>();

    for(Facoltà f: g.getVertices()) {
      boolean found = false;
      for(Facoltà f2: facoltaList)
        if(fa1.equals(fa2))
          found = true;
      if(!found && fa1.getCostoMantenimento()<k&&fa1.getLivMedioCorsi()>=m)
        res.add(fa1);
    }
    return res;
  }  
    
   
