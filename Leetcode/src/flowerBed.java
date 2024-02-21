class FlowerBed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                // Check if the previous and next positions are also empty
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];

                if (next == 0 && prev == 0) {
                    flowerbed[i] = 1;  // Place a flower
                    n--;
                    i += 2;  // Skip the next position as it cannot have a flower
                }else {
                    i++;
                }
            }else {
                i+=2;
            }
            i++;
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(arr, 1));
    }
}
