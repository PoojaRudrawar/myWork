 class initializationSeq {


        static {
            step(1);
        }

        public static int step_1 = step(2);
        public int step_6 = step(6);

        public initializationSeq() {
            step(8);
        }

        {
            step(7);
        }

        // Just for demonstration purposes:
        public static int step(int step) {
            System.out.println("Step " + step);
            return step;
        }
    }

    public class initializationSequence extends initializationSeq {

        {
            step(9);
        }

        public static int step_3 = step(3);
        public int step_10 = step(10);

        static {
            step(4);
        }

        public initializationSequence() {
            step(11);
        }

        public static void main(String[] args) {
            step(5);
            new initializationSequence();
            step(12);
        }

}

