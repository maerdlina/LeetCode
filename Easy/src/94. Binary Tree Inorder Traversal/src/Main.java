import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public static void inorder(TreeNode node,List<Integer> list){
        if(node == null) return;

        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

    public static void main(String[] args) {

    }
}