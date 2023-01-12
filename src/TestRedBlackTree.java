import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRedBlackTree {
  
  /**
   * This test method tests if the root node of a tree is always black, no matter the size.
   */
  @Test
  void testIfRootBlack() {

    //test with descending numbers
    RedBlackTree<Integer> testOne = new RedBlackTree<Integer>();
    for(int i = 10; i < 0; i--) {
      testOne.insert(i);
      assertTrue(testOne.root.isBlack);
    }

    //test with ascending numbers
    RedBlackTree<Integer> testTwo = new RedBlackTree<Integer>();
    for(int i = 0; i < 10; i++) {
      testTwo.insert(i);
      assertTrue(testTwo.root.isBlack);
    }
  }
  
  /**
   * This test method tests to see if the tree is properly formatted following a case 1 violation
   */
  @Test
  void testCaseOne() {

    //case one violation on left tree
    RedBlackTree<Integer> caseOneLeftTree = new RedBlackTree<Integer>();
    caseOneLeftTree.insert(100);
    caseOneLeftTree.insert(27);
    caseOneLeftTree.insert(252);
    caseOneLeftTree.insert(12);
    assertTrue(caseOneLeftTree.toString().equals("[ 12, 27, 100, 252 ]"));
    

    //case one violation on right tree
    RedBlackTree<Integer> caseOneRightTree = new RedBlackTree<Integer>();
    caseOneRightTree.insert(100);
    caseOneRightTree.insert(27);
    caseOneRightTree.insert(252);
    caseOneRightTree.insert(350);
    assertTrue(caseOneRightTree.toString().equals("[ 27, 100, 252, 350 ]"));
    }
  
  /**
   * This test method tests to see if the tree is properly formatted following a case 2 violation
   */
  @Test
  void testCaseTwo() {

    //case two violation on left tree
    RedBlackTree<Integer> caseTwoLeftTree = new RedBlackTree<Integer>();
    caseTwoLeftTree.insert(100);
    caseTwoLeftTree.insert(27);
    caseTwoLeftTree.insert(252);
    caseTwoLeftTree.insert(57);
    assertTrue(caseTwoLeftTree.toString().equals("[ 27, 57, 100, 252 ]"));
    
    //case two violation on right tree
    RedBlackTree<Integer> caseTwoRightTree = new RedBlackTree<Integer>();
    caseTwoRightTree.insert(100);
    caseTwoRightTree.insert(27);
    caseTwoRightTree.insert(252);
    caseTwoRightTree.insert(156);
    assertTrue(caseTwoRightTree.toString().equals("[ 27, 100, 156, 252 ]"));
    
    }
  
  /**
   * This test method tests to see if the tree is properly formatted following a case 3 violation
   */
  @Test
  void testCaseThree() {

    //case three violation on left tree
    RedBlackTree<Integer> caseThreeLeftTree = new RedBlackTree<Integer>();
    caseThreeLeftTree.insert(60);
    caseThreeLeftTree.insert(47);
    caseThreeLeftTree.insert(122);
    caseThreeLeftTree.insert(22);
    caseThreeLeftTree.root.leftChild.isBlack = false;
    assertTrue(caseThreeLeftTree.toString().equals("[ 22, 47, 60, 122 ]"));
    
    //case three violation on left tree
    RedBlackTree<Integer> caseThreeRightTree = new RedBlackTree<Integer>();
    caseThreeRightTree.insert(65);
    caseThreeRightTree.insert(30);
    caseThreeRightTree.insert(150);
    caseThreeRightTree.insert(200);
    caseThreeRightTree.root.rightChild.isBlack = false;
    assertTrue(caseThreeRightTree.toString().equals("[ 30, 65, 150, 200 ]"));
    }
    
}
