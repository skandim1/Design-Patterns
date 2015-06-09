package wordCount.visitors;

import wordCount.treesForStrings.DataElement;

public interface Visitor {
	public void visit(DataElement e);
}
