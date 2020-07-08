/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: ASCII ART
// Files: DrawingStack.java, DrawingStackIterator.java, DrawingChange.java, Canvas.java,
// AsciiArt.java, and AsciiTest.java
// Course: CS 300, Fall 2018
//
// Author: Ruoxi Shen
// Email: rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: Yuanbo Zhang
// Partner Email: yzhang2325@wisc.edu
// Partner Lecturer's Name: Gary Dahl
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: NONE
// Online Sources: NONE
//
//////////////////////////////////////// 100 COLUMNS WIDE /////////////////////////////////////////

/**
 * This class represents a Badger which is designed to live in a Sett. Each Badger object 
 * represents a single node within a BST (known as a Sett).
 */
public class Badger {
  private Badger leftLowerNeighbor; // leftLowerNeighbor
  private Badger rightLowerNeighbor; // rightLowerNeighbor
  private final int size; // size of the badger

  /**
   * Creates a new Badger with specified size.
   * 
   * @param size - The size of the newly constructed Badger object.
   */
  public Badger(int size) {
    this.size = size;
  }

  /**
   * Retrieves neighboring badger that is smaller than this one.
   * 
   * @return the left lower neighbor of current badger.
   */
  public Badger getLeftLowerNeighbor() {
    return leftLowerNeighbor;
  }

  /**
   * Retrieves neighboring badger that is larger than this one.
   * 
   * @return the right lower neighbor of current badger.
   */
  public Badger getRightLowerNeighbor() {
    return rightLowerNeighbor;
  }

  /**
   * Retrieves the size of this badger.
   * 
   * @return The size of current badger.
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Retrieves the size of this badger.
   * 
   * @param badger - The new left lower neighbor of current badger.
   */
  public void setLeftLowerNeighbor(Badger badger) {
    this.leftLowerNeighbor = badger;
  }

  /**
   * Changes this badger's lower right neighbor.
   * 
   * @param badger - The new right lower neighbor of current badger.
   */
  public void setRightLowerNeighbor(Badger badger) {
    this.rightLowerNeighbor = badger;
  }

}
