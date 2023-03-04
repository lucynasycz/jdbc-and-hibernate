package pl.sda.orange2.lambda;

public class LambdaExercises {
    public static void main(String[] args) {

        BoysDontCry boy = new ChlopakiNiePlacza();
        boy.silnoreki();

        ChlopakiNiePlacza boy2 = new ChlopakiNiePlacza();
        boy2.sing();

        //klasa anonimowa
        BoysDontCry anonymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoreki");
            }
        };

        anonymousClassReference.silnoreki();

        //BoysDontCry stupid = new String("");

        // () parenthesis - argument list
        // -> argument body separator
        // {} parenthesis - method body

        BoysDontCry firstLambda = () -> {};

        //jesli jedna instrukcja w ciele lamda to  nie trzeba {}
        BoysDontCry secondLambda = () -> System.out.println("Lambda");

        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };

        System.out.println("--------------------------------------");
        System.out.println("Coffee time");

        CoffeeMaker myCoffeeMaker = (int water, String coffeeType) -> "my coffee";
        CoffeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("Coffee brewing...");
            return "Java latte";
        };

        String myCoffee = myCoffeeMaker3.prepare(5,"Small");
        System.out.println("my coffee is ready:" + myCoffee);

        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";
        shortVersion.prepare(5,"LArge Java cofee");

    }
}
