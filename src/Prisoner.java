public class Prisoner {
    public String name;
    public double height;
    public int sentence;

    public Prisoner(String n, double h, int s) {
        name = n;
        height = h;
        sentence = s;
    }

    public Prisoner() {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        System.out.println(bubba);
        bubba.name = "Bubba";

        String test = null;
        System.out.println(test.length());

        Prisoner bubba1 = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);
    }
}
