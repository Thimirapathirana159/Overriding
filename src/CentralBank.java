public class CentralBank {
    int getinterestRate() {
        return 0;
    }
}
class BOC extends CentralBank{
    int getinterestRate(){
        return 8;
    }
}
class PepolesBank{
    int getinterestRate(){
        return 10;
    }
}
class CommercialBank{
    int getinterestRate(){
        return 12;
    }
}
class TestOverriding{
    public static void main(String[] args) {
        BOC b=new BOC();
        PepolesBank p=new PepolesBank();
        CommercialBank c=new CommercialBank();
        System.out.println("Interest Rate :- "+b.getinterestRate() + "%");
        System.out.println("Interest Rate :- "+p.getinterestRate() + "%");
        System.out.println("Interest Rate :- "+c.getinterestRate() + "%");

    }
}
