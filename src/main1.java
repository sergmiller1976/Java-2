public class main1 {
    public static void main(String[] args) {
        int cost = 100;
        int addCost = 1000 + cost;
        int bonus = 0;
        if ( addCost > 1000){
            bonus = addCost / 100;
        }
       int summ = cost + addCost + bonus;
        System.out.println(addCost);
        System.out.println(summ);

    }

}

