package manytoone;

import java.util.*;

public class ManyToOneRelationship<M, O> {
	HashMap<M, O> hm;
	
	ManyToOneRelationship(){
		this.hm = new HashMap<M, O>();
	}
	
	public boolean connect(M source, O target) {
		this.hm.put(source, target);
		return false;
	}
	
	public boolean containsTarget(O target) {
		if ( hm.containsValue(target)) {
			return true;
		}
		return false;
	}
	
	public boolean containsSource(M source) {
		if ( hm.containsKey(source)) {
			return true;
		}
		return false;
	}
	
	public O getTarget(M source) {
		return hm.get(source);
	}
	
	public Collection<M> getSources(O target) {
		
		Collection<M> collection = new ArrayList<M>();
		Set<M> set = hm.keySet();
		Iterator<M> iter = set.iterator();
		while( iter.hasNext() ){
			M m = iter.next();
			if ( getTarget(m).equals(target)) {
				collection.add(m);
			}
		}
		return collection;
	}
	
	public void disconnectSource(M Source) {
		
		if ( containsSource(Source)==false ){
			System.out.println("No such source.");
		}
		
		if ( getTarget(Source) == null ) {
			System.out.println("Null");
			return;
		}
		
		hm.put(Source, null);
	}
	
	public void disconnect(O target) {
		Set<M> set = hm.keySet();
		Iterator<M> iter = set.iterator();
		while( iter.hasNext()) {
			M m = iter.next();
			if( getTarget(m)==null ) {
				continue;
			}
			if ( getTarget(m).equals(target) ) {
				hm.put(m, null);
			}
		}
	}
	
	public Collection<O> getTargets() {
		Set<O> set = new HashSet<O>();
		set.addAll(hm.values());
		return (Collection<O>)set;		
	}
}
