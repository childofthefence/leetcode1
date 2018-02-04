package leetcode1;

class Jewels {

    public static int numJewelsInStones(String J, String S) {

        int countOfStones = 0;
        for(char letters: J.toCharArray()){
            for(char stones:S.toCharArray()){
                if (Character.compare(letters, stones)==0){
                    countOfStones++;
                }
            }
        }
        return countOfStones;
    }

    public static void main(String[] args){
        String J="aBC";
        String S="aaBBccC";
        System.out.println(Jewels.numJewelsInStones(J, S));

    }
}