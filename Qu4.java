package com.bhuwan;

public class Qu4 {
    public static void main(String[] args) {
        Qu4 obj = new Qu4();
        System.out.println(obj.canPlaceFlowers(new int[]{1,1,0,0,1,0,0,0,0,1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int noOfFreeSpace = checkFlowerbedSpace(flowerbed);
        return noOfFreeSpace >= n;
    }

    private int checkFlowerbedSpace(int[] flowerbed) {
        int count = 0;
        if(flowerbed.length == 0) return 0;

        if(flowerbed.length == 1 && flowerbed[0] == 0) return 1;
        if(flowerbed.length == 1 && flowerbed[0] == 1) return 0;

        if(flowerbed.length == 2 && flowerbed[0] == 0 && flowerbed[1] == 0) return 1;

        if(flowerbed.length >= 3){
            if(flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                count++;
            }

            if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) {
                flowerbed[flowerbed.length-1] = 1;
                count++;
            }

            for(int i = 1; i< flowerbed.length-1;i++){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count;


    }
}
