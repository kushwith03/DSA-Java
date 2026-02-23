package BinaryTrees;

public class SerializeDeserialize {
    public static void serializeHelper(TreeUtils.TreeNode root, StringBuilder list) {
        if (root == null) {
            list.append("null,");
            return;
        }
        list.append(root.data + ",");
        serializeHelper(root.left, list);
        serializeHelper(root.right, list);
    }

    public static String serialize(TreeUtils.TreeNode root) {
        StringBuilder list = new StringBuilder();
        serializeHelper(root, list);
        return list.toString();
    }

    public static TreeUtils.TreeNode deserializeHelper(String[] arr) {
        if (index >= arr.length || arr[index].equals("null")) {
            index++;
            return null;
        }
        TreeUtils.TreeNode node = new TreeUtils.TreeNode(Integer.parseInt(arr[index]));
        index++;
        node.left = deserializeHelper(arr);
        node.right = deserializeHelper(arr);
        return node;
    }

    static int index = 0;

    public static TreeUtils.TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        index = 0;
        return deserializeHelper(arr);
    }
}
