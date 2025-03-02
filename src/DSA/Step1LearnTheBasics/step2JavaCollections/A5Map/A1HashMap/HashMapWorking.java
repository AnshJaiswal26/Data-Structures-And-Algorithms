package DSA.Step1LearnTheBasics.step2JavaCollections.A5Map.A1HashMap;

import java.util.HashMap;

public class HashMapWorking {
    public static void main(String[] args){
        HashMap<String,Integer> mpp = new HashMap<>();
        mpp.put("apple",1);
        mpp.put("mango",2);
        mpp.put("banana",3);
        mpp.put("pineapple",4);
        mpp.put("graphs",5);
        mpp.put("watermelon",6);
        mpp.put("kiwi",7);
        mpp.put("guava",8);
        mpp.put("orange",9);
        mpp.put("papaya",10);
        mpp.put("cheery",11);
        mpp.put("Black graphs",12);

    }
}
// How HashMap Works
// 1. Hashing the Key:
// -> A hash function converts the key into an integer (the hash code).
// -> The hash code determines the index of the bucket (array position) where the key-value pair is stored.

// 2. Bucket Array:
// -> The bucket array is an array of linked lists or trees (in modern implementations).
// -> Each index (bucket) in the array can hold multiple key-value pairs (collision handling).

// 3. Collision Handling:
// -> If two keys map to the same bucket (index), the new key-value pair is stored in a linked list/tree at that index.

// 4. Retrieval:
// -> The key is hashed again, and the corresponding bucket is searched linearly or via a tree for the key.

//
//  pair
//   |
//   V
//  Key --> HashFunction --> HashCode/Size of Bucket Array ---> Index
//

//  Capacity: 16
//  Load Factor: 0.75
//  Threshold: Capacity × Load Factor = 16 × 0.75 = 12
//  Treeify Threshold: 8 (switch from linked list to Red-Black Tree)

//   Step-1
//   HashMap (Capacity: 16, Threshold: 12)
//   Adding kty-value pairs
//
//   Index->      0       1       2        3         4         5         6       7       8       9      10      11      12      13      14      15
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//   key,     | apple | mango | banana| pineapple| graphs| watermelon|  kiwi | guava |       |       |       |       |       |       |       |       |
//   value    |   1   |   2   |   3   |    4     |   5   |     6     |   7   |   8   |       |       |       |       |       |       |       |       |   <-Bucket Array
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//   Number of elements: 8
//   Threshold: 12 (no resizing required yet).



//   Step-2 Collision Handling(Linked List)
//   Adding more elements - (orange,9),(papaya,10),(cherry,11),(B-graph,12) some of them are collide
//
//   Index->      0       1       2        3         4         5         6       7       8       9      10      11      12      13      14      15
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//   key,     | apple | mango | banana| pineapple| graphs| watermelon|  kiwi | guava |       |       |       |       |       |       |       |       |
//   value    |   1   |   2   |   3   |    4     |   5   |     6     |   7   |   8   |       |       |       |       |       |       |       |       |   <-Bucket Array
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//                        |                                                      |
//                        V                                                      V  Linked list created due to collision
//                    +---+---+                                              +---+---+       +---+---+       +---+---+
//                    | orange|                                              | papaya| ----> | cherry| ----> |B-graph| ---> null
//                    |   9   |                                              |  10   |       |  11   |       |   12  |
//                    +---+---+                                              +---+---+       +---+---+       +---+---+



//   Step-3 Trigger Resize Capacity Double ( 12 x 2 - 32)
//   Adding another key (pear,9) causes resizing because the size exceeds the threshold (12).
//
//   Index->      0       1       2        3         4         5         6       7       8       9      10      11      12      13      14      15       16     17      18      19      20      21      22      23      24      25      26      27      28      29      30      31
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//   key,     | apple | mango | banana| pineapple| graphs| watermelon|  kiwi | guava | pear  |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |
//   value    |   1   |   2   |   3   |    4     |   5   |     6     |   7   |   8   |   9   |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |  <-Bucket Array
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//                        |                                                      |
//                        V                                                      V  Linked list created due to collision
//                    +---+---+                                              +---+---+       +---+---+       +---+---+
//                    | orange|                                              | papaya| ----> | cherry| ----> |B-graph| ---> null
//                    |   9   |                                              |  10   |       |  11   |       |   12  |
//                    +---+---+                                              +---+---+       +---+---+       +---+---+


//   Step-4 Treeify Bucket (Convert Linked List to Red-Black Tree (Balanced Binary Search Tree))
//
//   When a bucket’s size exceeds 8 (e.g., at Bucket 9), the linked list is replaced by a Red-Black Tree:
//
//   Index->      0       1       2        3         4         5         6       7       8       9      10      11      12      13      14      15       16     17      18      19      20      21      22      23      24      25      26      27      28      29      30      31
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//   key,     | apple | mango | banana| pineapple| graphs| watermelon|  kiwi | cherry| pear  |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |
//   value    |   1   |   2   |   3   |    4     |   5   |     6     |   7   |   11  |   9   |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |       |  <-Bucket Array
//            +---+---+---+---+---+---+----+-----+---+---+-----+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
//                        |                                                     / \
//                        V                                                    /   \  Linked list converted into red/black tree (Balanced BST) when a bucket’s size exceeds 8
//                    +---+---+                                       +---+---+     +---+---+
//                    | orange|                                       |B-graph|     | guava |
//                    |   9   |                                       |  12   |     |   8   |
//                    +---+---+                                       +---+---+     +---+---+
//                                                                                          \
//                                                                                           \
//                                                                                            +---+---+
//                                                                                            | papaya|
//                                                                                            |   10  |
//                                                                                            +---+---+
//