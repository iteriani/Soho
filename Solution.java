import java.util.*;
public class Solution {
	
	public static void main(String[] args){
		BiPriorityQueue queue = new BiQueue();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		while(sc.hasNextLine()){
			String line  = sc.nextLine();
			if(line.equals("D 1")){
				queue.removeMax();
			}else if(line.equals("D -1")){
				queue.removeMin();
			}else{
				int number = Integer.parseInt(line.substring(1).trim());
				queue.put(number);
			}
		}
		
		if(queue.isEmpty()){
			System.out.println("EMPTY");
		}else{
			int max = queue.removeMax();
			if(queue.size() == 0){
				System.out.println(max);
			}else{
				int min = queue.removeMin();
				System.out.println(max + " " + min);
			}
		}
	}
	
}