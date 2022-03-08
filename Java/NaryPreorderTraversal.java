class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> nums = new ArrayList<>();
        helper(root, nums);
        return nums;
    }

    public void helper(Node root, List<Integer> nums) {
        if(root == null) return;
        nums.add(root.val);
        for(int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), nums);
        }
    }


}
