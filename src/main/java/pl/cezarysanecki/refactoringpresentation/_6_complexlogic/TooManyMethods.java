package pl.cezarysanecki.refactoringpresentation._6_complexlogic;

/**
 * Problems:
 *  - complex logic
 *  - cannot spot any patterns
 * <p>
 * Solution - inline methods
 */
class TooManyMethods {

    public static void main(String[] args) {
        new TooManyMethods().call();
    }

    void call() {
        printMinimize();
        printSpace();
        printCognitive();
        printSpace();
        printLoad();
        printSpace();
        printFor();
        printSpace();
        printOthers();
    }

    private static void printOthers() {
        System.out.print("o");
        System.out.print("t");
        System.out.print("h");
        System.out.print("e");
        System.out.print("r");
        System.out.print("s");
    }

    private static void printLoad() {
        System.out.print("l");
        System.out.print("o");
        System.out.print("a");
        System.out.print("d");
    }

    private static void printSpace() {
        System.out.print(" ");
    }

    private static void printCognitive() {
        System.out.print("c");
        System.out.print("o");
        System.out.print("g");
        printNi();
        System.out.print("t");
        printI();
        System.out.print("v");
        System.out.print("e");
    }

    private static void printI() {
        System.out.print("i");
    }

    private static void printFor() {
        System.out.print("f");
        System.out.print("o");
        System.out.print("r");
    }

    private static void printNi() {
        System.out.print("n");
        printI();
    }

    private static void printMinimize() {
        System.out.print("M");
        printI();
        printNi();
        System.out.print("m");
        printI();
        System.out.print("z");
        System.out.print("e");
    }

}
