package problemandsolutions;

public class TowerOfHanoi {

    public static void moveTheDisk(int disk, char firstChar, char secondChar, char thirdChar) {
        // If only last disk is remaining then move directly to target tower.
          if (disk == 1) {
            System.out.println("Move 1 from " + firstChar + " to " + thirdChar);
            return;
        }
        // moveTheDisk(disk - 1, starting tower, intermediate, target tower)
        moveTheDisk(disk - 1, firstChar, thirdChar, secondChar);
        System.out.println("Move " + disk + " from " + firstChar + " to " + thirdChar);
        moveTheDisk(disk - 1, secondChar, firstChar, thirdChar);
    }

    public static void main(String[] args) {
        moveTheDisk(5, 'A','B','C');
    }
}
