package arrays;

import util.Util;

// Leader in array means element to right of that element should be less then it.
// for ex . arr = {3,11,2,5,8,10} so here 11, 10 is the leader because there is no
// grater than 11 in right of the element and right most element is always a leader.
public class LeaderInArray {

    public static void findTheLeader(int[] arr){

        // right most element is always the leader
        int currentLeader = arr[arr.length-1];
        Util.print(currentLeader);

        // start the loop from the right side
        // but it will print the leader from right to left
        // to print the array left to right , use temp array and reverse it.
        for(int index = arr.length - 2; index >= 0; index--){
            if(arr[index] > currentLeader){
                currentLeader =  arr[index];
                Util.print(currentLeader);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr =  {2,3,9,10,1,7,6,5};
        findTheLeader(arr);
    }

}
