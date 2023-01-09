package cn.com.pep.model.serializable;

import java.io.Serializable;

public class Node implements Serializable{

	/** serialVersionUID*/ 
	private static final long serialVersionUID = 1L;
	
	Node parent;
	
	int id;
	
	public Node(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		parent = null;
	}

}

class NodeTree implements Serializable{

	/** serialVersionUID*/ 
	private static final long serialVersionUID = 1L;
	
	Node node1;
	
	Node node2;
	
	public NodeTree() {
		// TODO Auto-generated constructor stub
		node1 = new Node(1);
		node2 = new Node(2);
		node2.parent = node1;
	}
	
}
