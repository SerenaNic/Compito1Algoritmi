package it.unirc.ing.infolab.alg_s_dati.compito1;

import java.util.LinkedList;
import java.util.ListIterator;
import org.apache.commons.collections15.Transformer;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.UndirectedSparseGraph;


public class Cittadella {
  private UndirectedGraph<Facolta, Tratta> g;

  public Cittadella() { 
    g=new UndirectedSparseGraph<Facolta, Tratta>(); 
  }

  //O(1)
  public void m1(Facolta f1, Facolta f2, Double l) {
    if(g.findEdge(f1, f2)==null){
      Tratta t = new Tratta (f1.getCodice()+"-"+f2.getCodice(),l);
      g.addEdge(t, f1, f2);
    }
  }
  
  //O(n^2)
  public LinkedList<Facolta> m2(LinkedList<Facolta> list, int k, int m){
    LinkedList<Facolta> res = new LinkedList<Facolta>();

    for(Facolta f: g.getVertices()) {
      boolean found = false;
      for(Facolta f2: list)
        if(f.equals(f2))
          found = true;
      if(!found && f.getCostoMantenimento()<k&&f.getLivMedioCorsi()>=m)
        res.add(f);
    }
    return res;
  }  
  
  //O(n^2)
  public LinkedList<Facolta> m3(int k, double v){
  
    LinkedList<Facolta> res = new LinkedList<Facolta>();

    for(Facolta fa1: g.getVertices()){
      int c=0;
      for(Facolta fa2:g.getVertices()){
        if(fa2.isDormitorio()&&fa2.getCorsiList().size()>k){
          Tratta t=g.findEdge(fa1, fa2);
          if(t!=null&&t.getLunghezza()<v)
              c++;
        }
      }
      if(c>=2)
        res.add(fa1);
    } 
    return res;
  }
  
  //O(n^2)
  public int m4 (Facolta fa1, Facolta fa2, double l, LinkedList<Facolta> list, int k) {
    res = 0;
    UndirectedGraph<Facolta, Tratta> g1 = g.clone();
    LinkedList<Tratta> tratList=new LinkedList<Tratta>();
    tratList.addAll(g.getEdges());
    ListIterator<Tratta> iterator = tratList.listIterator();
 
    while(iterator.hasNext()){
      Tratta t=iterator.next();
      if(t.getLunghezza()<l)
        g1.removeEdge(t);
    }
    
    for(Facolta fa: list)
      g1.removeVertex(fa);
    
    LinkedList<Facolta> faList=new LinkedList<Facolta>();
    faList.addAll(g1.getVertices());
    ListIterator<Facolta> iterator2 = faList.listIterator();
    
    while(iterator.hasNext()){
      Facolta fa=iterator2.next();
      if(fa.getNumCorsiMin5()<k)
        g1.removeVertex(fa);
    }
    
    Transformer<Tratta, Double> wtTransformer = new Transformer<Tratta,Double>() {
      public Double transform(Tratta link) {
        return link.getLunghezza();
      }
    };
    
    DijkstraShortestPath<Facolta, Tratta> dd= new DijkstraShortestPath<Facolta,Tratta>(g1,wtTransformer);
    //if distance needed  
    Number dist = dd.getDistance(fa1, fa2);
    res=dist.intValue();
    /**if edges needed
    List<Tratta> l = dd.getPath(fa1, fa2);
    return res.addAll(l);
    **/
    return res;
  }
}


   
