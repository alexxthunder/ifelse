public class ifelse {
    public static void main(String[] args) {

        int cash = 100;
        int age = 18;
	int offer = 30;
	int joboffer = 700;

        String result;

        result = cash>60&age>=18?"Succesful payment":"Not enough money";
        System.out.println(result);
    }
}
