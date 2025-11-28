public class CostPrice {
    public static void main(String[] args) {
        // When purchasing certain items, a discount of 10% is offered if the quantity
        // purchased is more than 100. If quantity and price per item are input through
        // the keyboard, write a program to calculate the total expenses

        int quantity = 200;
        int price = 10;

        int totalExpense = quantity * price;

        if (quantity > 100) {
            System.out.println(totalExpense * 0.9);
        } else {
            System.out.println(totalExpense);
        }
    }
}
