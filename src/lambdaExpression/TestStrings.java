package lambdaExpression;

public class TestStrings {
    TestStrings(){}
    TestStrings(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        //how many ways are there to create subclass of Functional Interface
        //1. traditional way
        StringProcessor stringProcessor = new StringProcessorImpl();
        stringProcessor.process("good morning");


        //2. anonymous class
        StringProcessor anonymous = new StringProcessor() {
            @Override
            public void process(String str) {
                System.out.println(str);
            }
        };
        anonymous.process("Good morning using anonymous class");

        //3. lambda expression
        StringProcessor lambda = str -> System.out.println(str);

        lambda.process("Good morning using lambda");
        //4. method reference
        TestStrings ref = new TestStrings();
        StringProcessor methodReference = TestStrings::accept;
        methodReference.process("Good morning using method reference");
    }
    public static void accept(String str){
        System.out.println(str);
    }
    public void accept2(String str){
        System.out.println(str);
    }
}

