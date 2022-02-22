public class Main {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.root = new MyTreeNode();
        tree.root.data = 1;
        MyTreeNode secondGenL = new MyTreeNode();
        MyTreeNode secondGenR = new MyTreeNode();
        MyTreeNode secondGenM = new MyTreeNode();
        tree.root.children.add(secondGenL); //left node of root child
        tree.root.children.add(secondGenM); //middle node of root child
        tree.root.children.add(secondGenR); //right node of root child
        secondGenL.data = 100;
        secondGenR.data = 200;
        secondGenM.data = 2;

        MyTreeNode leftThirdGenL = new MyTreeNode();
        MyTreeNode leftThirdGenR = new MyTreeNode();
        secondGenL.children.add(leftThirdGenL); //left node of 100
        secondGenL.children.add(leftThirdGenR); //right node of 100
        leftThirdGenL.data = 110;
        leftThirdGenR.data = 120;
        MyTreeNode leftFourthGenL = new MyTreeNode();
        leftThirdGenL.children.add(leftFourthGenL); //left node of 100
        leftFourthGenL.data = 130;

        MyTreeNode rightThirdGenL = new MyTreeNode();
        MyTreeNode rightThirdGenR = new MyTreeNode();
        secondGenR.children.add(rightThirdGenL); //left node of 200
        secondGenR.children.add(rightThirdGenR); //right node of 200
        rightThirdGenL.data = 210;
        rightThirdGenR.data = 220;
        MyTreeNode rightFourthGenR = new MyTreeNode(); //right node of 220
        rightThirdGenR.children.add(rightFourthGenR);
        rightFourthGenR.data = 230;

        System.out.println("Size tree: " + tree.root.children.size());
        preorder(tree);
        postOrder(tree);
    }

    public static void preorder(MyTree tree) {
        System.out.println("-----Preorder-----");
        recursivePreorder(tree.root);
        System.out.println();
    }

    public static void recursivePreorder(MyTreeNode node) {
        System.out.println(node.data);
        for (Object child : node.children) {
            recursivePreorder((MyTreeNode) child);
        }
    }

    public static void postOrder(MyTree tree) {
        System.out.println("-----Postorder-----");
        recursivePostorder(tree.root);
        System.out.println();
    }

    public static void recursivePostorder(MyTreeNode node) {
        for (Object child : node.children) {
            recursivePostorder((MyTreeNode) child);
        }
        System.out.println(node.data);
    }

}
