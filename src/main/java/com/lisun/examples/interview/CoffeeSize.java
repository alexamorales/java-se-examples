package com.lisun.examples.interview;

/**
 * @author Aleksey
 * @since 1/5/14
 */
public enum CoffeeSize {
    BIG, HUGE, OVERHELMING
}

class Coffee {
    CoffeeSize size;
}

class Coffee2 {
    enum CofeeSize {
        BIG(1), HUGE(2), OVERHELMING(3);
        int ml;

        CofeeSize(int ml) {
            this.ml = ml;

        }

        public int getMl() {
            return ml;
        }
    }

    CofeeSize size;

}

class CoffeeTestTest {
    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
        Coffee2 coffee2 = new Coffee2();

        coffee2.size = Coffee2.CofeeSize.BIG;
        System.out.println(coffee2.size.getMl());

        for (Coffee2.CofeeSize cs : Coffee2.CofeeSize.values()) {
            System.out.println("cs: " + cs.getMl() + " " + cs);
        }


    }
}