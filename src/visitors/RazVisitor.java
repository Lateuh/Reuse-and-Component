package visitors;

import stockage.*;

public class RazVisitor extends Visitor{

	public void visitDirectory(Directory d) {
		System.out.println("on a visité " + d.getName() + "on remet tout à zero");
	}
	
	
	public void visitSymlink(Symlink s) {
		System.out.println("on a visité " + s.getName());
	}
	
	public void visitLink(Link l) {
		System.out.println("on a visité " + l.getName());
	}
	
	public void visitFile(File f) {
		f.setContents("");
		System.out.println("Le fichier "+ f.getName() + " a été raz");
	}
	
	public void visitArchive(Archive a) {
		System.out.println("on a visité " + a.getName());
	}

}
