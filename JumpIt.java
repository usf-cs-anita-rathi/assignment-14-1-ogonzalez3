import java.util.*;
public class JumpIt
{ 
  public static void main(String[] args) 
  { 
    Scanner inupt = new Scanner(System.in);
    Scanner integers = new Scanner(System.in);
    System.out.println("Enter the number of cells: ");
    int user_input = inupt.nextInt();
    int cost[] = new int[user_input];
    int cellnumber = 1;
    for (int index = 0; index<cost.length; index++) 
    { 
      System.out.println("Enter the cost of cell "+cellnumber+": ");
      cost[index] = integers.nextInt();  
      cellnumber++;
    } 
    System.out.printf("Least cost is %d.\n", minimumCost(0, cost)); 
  } 
  private static int minimumCost(int cell, int cost[]) { 
    if (cell >= cost.length) { 
      return 0; 
    } 
    int jump = cost[cell] + minimumCost(cell+2, cost); 
    int move = cost[cell] + minimumCost(cell+1, cost); 
    if (move < jump) { 
      cell += 1; 
      System.out.printf("Move to cell %d.\n", cell); 
      return move; 
    } else { 
      cell += 2; 
      System.out.printf("Jump to cell %d.\n", cell); 
      return jump; 
    } 
  } 
}