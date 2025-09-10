package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        char eight = '8';
        char whitespace = ' ';

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i <= height / 2 && j >= i && j < height - i ||
                        i >= height / 2 && j <= i && j >= height - i - 1) {
                    System.out.print(eight);
                } else {
                    System.out.print(whitespace);
                }
            }
            System.out.println();
        }
    }

}
