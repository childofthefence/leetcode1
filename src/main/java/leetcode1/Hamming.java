package leetcode1;

class Hamming {
    public static int hammingDistance(int x, int y) {

        int z = x ^ y;
        String zEncode = Integer.toBinaryString(z);
        int hammingCount =0;
        for(char a:zEncode.toCharArray()){
            if(Character.compare(a, '1')==0){
                hammingCount++;
            }
        }
        return hammingCount;
    }

    public static void main(String[] args){
        int i = 1;
        int j = 4;
        int count = Hamming.hammingDistance(i, j);
        System.out.println(count);
    }

}
