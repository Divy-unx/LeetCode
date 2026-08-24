class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boatcount = 0;
        int i = 0;
        int j = people.length - 1;

        Arrays.sort(people);

        while(i <= j){
            if(people[j] + people[i] <= limit){
                i++;
                j--;
            }else{
                j--;
            }

            boatcount++;
        }

        return boatcount;
    }
}