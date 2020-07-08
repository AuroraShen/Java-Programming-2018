/////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: SJF PROCESS SCHEDULER
// Files: WaitingQueueADT.java, CustomProcess.java, CustomProcessQueue.java, 
// ProcessScheduler.java, and ProcessSchedulerTests.java
// Course: CS 300, Fall 2018
//
// Author:         Ruoxi Shen
// Email:          rshen27@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    Yuanbo Zhang
// Partner Email:   yzhang2325@wisc.edu
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
 * The CustomProcess class represents the type for the processes in our application.
 * CustomProcess class implements the java.lang.Comparable interface over itself.
 */
public class CustomProcess implements Comparable<CustomProcess>{
  private static int nextProcessId = 1; // stores the id to be assigned to the next process
  // to be created
  private final int PROCESS_ID; // unique identifier for this process
  private int burstTime; // time required by this process for CPU execution

  /**
   * This constructor creates a new instance of CustomProcess with the given burstTime.
   * each time a new instance was added, ID plus one.
   * 
   * @param burstTime: time of the task
   */
  public CustomProcess(int burstTime) {
    this.burstTime = burstTime;
    PROCESS_ID = nextProcessId; 
    nextProcessId++; // ID begin with 1, and increment each time fater a new task is added
  }
  
  /**
   * p1.compareTo(p2) < 0 means that the p1 has higher priority than p2. So, p1 should be run first.
   * p1.compareTo(p2) == 0 means that p1 and p2 have exactly the same priority.
   * p1.compareTo(p2) > 0 means that p1 has lower priority than p2.
   * 
   * @param other: the other task that we want to compare with
   * @return -1 if this task have higher priority than the other, 0 the same, 1 other wise
   */
  @Override
  public int compareTo(CustomProcess other) {
    if (burstTime < other.getBurstTime()) // if this has higher priority, return -1
      return -1;
    if (burstTime > other.getBurstTime()) // if other has higher priority, return -1
      return 1;
    if (burstTime == other.getBurstTime()) { // if they have the same time, lower ID first
      if (PROCESS_ID < other.getProcessId())
        return -1;
      else
        return 1;
    }
    return 0;
  }

  /**
   * getter method
   * 
   * @return PROCESS_ID
   */
  public int getProcessId() {
    return PROCESS_ID;
  }

  /**
   * getter method
   * 
   * @return burstTime
   */
  public int getBurstTime() {
    return burstTime;
  }
}
