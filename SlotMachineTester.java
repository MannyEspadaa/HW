public class SlotMachineTester {
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine(10);
        System.out.println("WELCOME TO THE CASINO");
        while (slotMachine.hasNext()) {
            slotMachine.next();
        }
        System.out.println("Amount of plays: " + slotMachine.getPlays());
    }
}