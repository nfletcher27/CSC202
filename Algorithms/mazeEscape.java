import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Maze {
   private int H;
   private int W;
   private int exitI;
   private int exitJ;
   private String[] maze;

   public Maze(String[] maze) {
       this.maze = maze;
       this.H = maze.length;
       this.W = maze[0].length();
       for (int i = 0; i < W; i++) {

           if (maze[0].charAt(i) == '.') {
               this.exitI = 0;
               this.exitJ = i;
               return;
           }

           if (maze[H - 1].charAt(i) == '.') {
               this.exitI = H - 1;
               this.exitJ = i;
               return;
           }

       }

       for (int i = 1; i < H - 1; i++) {

           if (maze[i].charAt(0) == '.') {
               this.exitI = i;
               this.exitJ = 0;
               return;
           }
           if (maze[i].charAt(W - 1) == '.') {
               this.exitI = i;
               this.exitJ = W - 1;
               return;
           }
       }

   }

   boolean isValid(int i,int j){
       if (i>=0 && i<= H-1 && j>=0 && j<= W-1 && maze[i].charAt(j)=='.')
           return true;
       return false;
   }

   public int distanceToExit(int i, int j) {
       int[][] distance = new int[H][W];
       for(int k=0;k<H;k++){
           for(int l=0;l<W;l++){
               distance[k][l] = -1;
           }
       }
       distance[i][j] = 0;
       Queue < int[] > q = new LinkedList<>();
       int [] uv = {i,j};
       q.add(uv);

       while(!(q.isEmpty())){
           uv = q.poll();
           if(isValid(uv[0]+1,uv[1])){
               if(distance[uv[0]+1][uv[1]] == -1){
                   distance[uv[0]+1][uv[1]] = distance[uv[0]][uv[1]]+1;
                   int[] uv1 = {uv[0]+1,uv[1]};                  
                   q.add(uv1);
               }
           }

           if(isValid(uv[0]-1,uv[1])){
               if(distance[uv[0]-1][uv[1]] == -1){
                   distance[uv[0]-1][uv[1]] = distance[uv[0]][uv[1]]+1;
                   int[] uv2 = {uv[0]-1,uv[1]};                  
                   q.add(uv2);
               }
           }

           if(isValid(uv[0],uv[1]+1)){
               if(distance[uv[0]][uv[1]+1] == -1){
                   distance[uv[0]][uv[1]+1] = distance[uv[0]][uv[1]]+1;
                   int[] uv3 = {uv[0],uv[1]+1};                  
                   q.add(uv3);
               }
           }

           if(isValid(uv[0],uv[1]-1)){
               if(distance[uv[0]][uv[1]-1] == -1){
                   distance[uv[0]][uv[1]-1] = distance[uv[0]][uv[1]]+1;
                   int[] uv4 = {uv[0],uv[1]-1};                  
                   q.add(uv4);
               }
           }
       }
  
       return distance[exitI][exitJ];
   }

   public static void main(String args[]){
       String[] maze = {"####.##","#....##","#.#.#.#","#.#...#","#.###.#","#.....#","#######"};
       Maze m = new Maze(maze);

       Scanner sc = new Scanner(System.in);      
       System.out.println("Enter starting x position and starting y position");
       int startX = sc.nextInt();
       int startY = sc.nextInt();

       System.out.println("Shortest distanceance to exit the maze: "+String.valueOf(m.distanceToExit(startX,startY)));
  
   }
}
