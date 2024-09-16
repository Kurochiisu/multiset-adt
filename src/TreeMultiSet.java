import com.sun.source.tree.Tree;

public class TreeMultiSet extends MultiSet {

    // add a Tree object as a private instance variable for this class.

    private Tree tree;

    // constructor
    public TreeMultiSet(Tree tree) {
        this.tree = tree;
    }

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */

    @Override
    void add(Integer item) {
        // complete this method
        tree.insert(item);
    }
    // write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.
}
    void remove(Integer item) {
        tree.delete(item);
    }

    boolean contains(Integer item) {
        return tree.contains(item);
    }

    boolean isEmpty() {
        return tree.isEmpty();
    }

    int count(Integer item) {
        return tree.count(item);
    }

    int size(Integer item) {
        return tree.size(item);
    }

}
