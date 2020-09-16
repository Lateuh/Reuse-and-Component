package visitors;

import stockage.*;

public class CountVisitor extends Visitor{

	int count;
	
	public CountVisitor() {
		count = 0;
	}
	
	public int getCount() {return count;}
	
	public void visitDirectory(Directory f) {
		
	}
	
	public void visitFile(File f) {
		if (f.size()>10) {
			count++;
		}
	}
}
