package problemandsolutions;
/*Problem statement is
* */
public class RopeCuttingSolution {
    public static int cutTHeRope(int maxLength, int pieceOne, int pieceTwo, int pieceThree) {

        if (maxLength == 0) {
            return 0;
        }
        if (maxLength < 0) {
            return -1;
        }
        int resultFromPieceOne = cutTHeRope(maxLength - pieceOne, pieceOne, pieceTwo, pieceThree);
        int resultFromPieceTwo = cutTHeRope(maxLength - pieceTwo, pieceOne, pieceTwo, pieceThree);
        int resultFromPieceThree = cutTHeRope(maxLength - pieceThree, pieceOne, pieceTwo, pieceThree);

        int maxOfOneAndTwo = Math.max(resultFromPieceOne, resultFromPieceTwo);
        int maxCutsOfTheRope = Math.max(maxOfOneAndTwo, resultFromPieceThree);

        if (maxCutsOfTheRope == -1) {
            return -1;
        }
        return maxCutsOfTheRope + 1;
    }

    public static void main(String[] args) {
        System.out.println("Max cuts of the Rope is " + cutTHeRope(13, 2, 3, 5));
    }

}
