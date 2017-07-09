package DataStructure.DS.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songchiyun on 2017. 7. 9..
 * Nearest post office

 Find the nearest post office for every cell in 2D array.
 You have to fill all the white cell with the values that we fill in the example bellow.
 Rules:
 1- From any cell, You could move only(Right,left,Top, and button) you cannot move cross side. see the red movement.
 2- Every movement cost you  1 meter.
 3- you have to fill the cells with nearest post office.

 You will be provided  the locations of the post offices as it shows in the code.

 Notes to work:
 Add all the post offices in the queue, then run BFS search by adding four neighbor for ever cells which is Right (i,j+1),left(i,j-1),Top(i-1,j), and button(i+1,j) in the queue  to fill the cells with nearest post office. And do not re-visit any cell after fill it with value, becuase the first fill will be by nearest post office , because you are doing BFS.


 */
public class findPostOffice {

    static class coordinate
    {
        int i;
        int j;
        public coordinate(int i,int j){
            this.i=i;
            this.j=j;}
    }

    public static void main(String[] args) {

        coordinate[] PostOfficeLocations={
                new coordinate(3, 1),
                new coordinate(2, 3),
                new coordinate(4, 4)
        };
        FindShortPath(PostOfficeLocations);


    }
    public static void FindShortPath( coordinate[] PostOffice)
    {
        int N = 5;
        int[][] d = new int[5][5];
        for(coordinate c : PostOffice){
            d[c.i][c.j] = -1;
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        Queue<coordinate> q = new LinkedList<>();
        for(coordinate c : PostOffice){
            q.add(c);
            while( !q.isEmpty() ){
                coordinate actual = q.remove();
                int cost = 1;

                if(d[actual.i][actual.j] == -1)
                    cost = 2;

                int i = actual.i;
                int j = actual.j;
                System.out.println(i +","+j);

                if(hasLeft(i, j) && d[i][j-1] != -1){
                    if(d[i][j-1] == 0){
                        d[i][j-1] = d[i][j] + cost;
                        coordinate temp = new coordinate(i, j-1);
                        q.add(temp);
                    }
                    else{
                        if(d[i][j-1] > d[actual.i][actual.j] + cost){
                            d[i][j-1] = d[actual.i][actual.j] + cost;
                            coordinate temp = new coordinate(actual.i, actual.j-1);
                            q.add(temp);
                        }
                    }
                }
                if(hasRight(i,j) && d[i][j+1] != -1){
                    if(d[i][j+1] == 0){
                        d[i][j+1] = d[i][j] + cost;
                        coordinate temp = new coordinate(i, j+1);
                        q.add(temp);
                    }
                    else{
                        if(d[i][j+1] > d[i][j] + cost){
                            d[i][j+1] = d[i][j] + cost;
                            coordinate temp = new coordinate(i, j+1);
                            q.add(temp);
                        }
                    }
                }
                if(hasTop(i,j) && d[i-1][j] != -1){
                    if(d[i-1][j] == 0){
                        d[i-1][j] = d[i][j] + cost;
                        coordinate temp = new coordinate(i-1, j);
                        q.add(temp);
                    }
                    else{
                        if(d[i-1][j] > d[i][j] + cost){
                            d[i-1][j] = d[i][j] + cost;
                            coordinate temp = new coordinate(i-1, j);
                            q.add(temp);
                        }
                    }
                }
                if(hasBottom(i,j) && d[i+1][j] != -1){
                    if(d[i+1][j] == 0){
                        d[i+1][j] = d[i][j] + cost;
                        coordinate temp = new coordinate(i+1, j);
                        q.add(temp);
                    }
                    else{
                        if(d[i+1][j] > d[i][j] + cost){
                            d[i+1][j] = d[i][j] + cost;
                            coordinate temp = new coordinate(i+1, j);
                            q.add(temp);
                        }
                    }
                }
                for(int l=0;l<5;l++){
                    for(int k=0;k<5;k++){
                        System.out.print(" "+d[l][k]);
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }

    }
    public static boolean hasLeft(int i, int j){
        return (j-1 >= 0);
    }
    public static boolean hasRight(int i, int j){
        return (j+1 < 5);
    }
    public static boolean hasTop(int i, int j){
        return (i-1 >= 0);
    }
    public static boolean hasBottom(int i, int j){
        return (i+1 < 5);
    }


}
