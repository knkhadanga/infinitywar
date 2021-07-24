package test.solutions.miscs;

public class TriesNode<T> {

    T data;
    boolean isLastNode = false;
    protected TriesNode<T>[] childrens = new TriesNode[26];
}
