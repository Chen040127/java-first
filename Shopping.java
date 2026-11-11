public class Shopping {
    public static void main(String[] args) {
        int notebookPrice = 35, notebookQty = 3;
        int penPrice = 12, penQty = 2;
        int payment = 200;
        int total = notebookPrice * notebookQty
                  + penPrice * penQty;
        int change = payment - total;
        System.out.println("Total: " + total);
        System.out.println("Change: " + change);
    }
}
