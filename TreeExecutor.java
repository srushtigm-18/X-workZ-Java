class TreeExecutor {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addTree("Banyan Tree");
        tree.addTree("Mango Tree");
        tree.addTree("Neem Tree");
        tree.addTree("Coconut Tree");
        tree.addTree("Peepal Tree");
        tree.addTree("Eucalyptus Tree");
        tree.addTree("Bamboo Plant");
        tree.addTree("Papaya Tree");
        tree.addTree("Teak Tree");
        tree.addTree("Mahogany Tree");
        tree.addTree("Jackfruit Tree");

        tree.getTrees();
        System.out.println();

        int index = 4;
        String t = tree.getTreeByIndex(index);
        System.out.println("Tree at index " + index + " is: " + t);
        System.out.println();

        String searchName = "Neem Tree";
        int i = tree.getIndexByTreeName(searchName);
        System.out.println("Tree '" + searchName + "' is at index: " + i);
        System.out.println();

        String updated = "Neem Tree (Medicinal Use)";
        boolean ref = tree.updateTree("Neem Tree", updated);
        tree.getTrees();
        System.out.println();

        String deleting = "Bamboo Plant";
        boolean reff = tree.deleteTree(deleting);
        tree.getTrees();
    }
}
