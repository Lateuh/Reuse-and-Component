package visitors;

import stockage.*;

public abstract class Visitor {

	public void visitDirectory(Directory d) {};
	public void visitLink(Link l) {};
	public void visitArchive(Archive a) {};
	public void visitSymlink(Symlink s) {};
	public void visitFile(File f) {};
	
}
