package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _904_Fruit_Into_Baskets {

    public static int maximumAmountOfFruits(int[] tree) {
        if (tree.length == 1) {
            return 1;
        }

        List<Block> sequenceOfBlocks = createSequenceOfBlocks(tree);

        int maxAmountFruits = 0;
        int currentAmountOfFruits;

        Set<Integer> counter = new HashSet<>();
        counter.add(sequenceOfBlocks.get(0).getTreeType());
        currentAmountOfFruits = sequenceOfBlocks.get(0).getBlockLength();


        for (int i = 1; i < sequenceOfBlocks.size(); i++) {
            counter.add(sequenceOfBlocks.get(i).getTreeType());

            if (counter.size() > 2) {
                counter.clear();
                maxAmountFruits = Math.max(currentAmountOfFruits, maxAmountFruits);
                currentAmountOfFruits = sequenceOfBlocks.get(i-1).getBlockLength() + sequenceOfBlocks.get(i).getBlockLength();
                counter.add(sequenceOfBlocks.get(i-1).getTreeType());
                counter.add(sequenceOfBlocks.get(i).getTreeType());
            } else {
                counter.add(sequenceOfBlocks.get(i).getTreeType());
                currentAmountOfFruits += sequenceOfBlocks.get(i).getBlockLength();
            }
        }

        maxAmountFruits = Math.max(currentAmountOfFruits, maxAmountFruits);

        return maxAmountFruits;
    }

    private static List<Block> createSequenceOfBlocks(int[] tree) {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new Block(tree[0], 1));

        if (tree.length == 1) {
            return blocks;
        }

        for (int i = 1; i < tree.length; i++) {
            if (tree[i] == tree[i-1]) {
                Block lastBlock = blocks.get(blocks.size()-1);
                lastBlock.setBlockLength(lastBlock.getBlockLength() + 1);
            } else {
                blocks.add(new Block(tree[i], 1));
            }
        }

        return blocks;
    }
}

class Block {
    private int treeType;
    private int blockLength;

    public Block(int treeType, int blockLength) {
        this.treeType = treeType;
        this.blockLength = blockLength;
    }

    public int getTreeType() {
        return treeType;
    }

    public int getBlockLength() {
        return blockLength;
    }

    public void setBlockLength(int blockLength) {
        this.blockLength = blockLength;
    }
}
