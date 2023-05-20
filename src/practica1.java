public class practica1 {
    public static void main(String[] args) {
        String zile="joi";
        switch (zile){
            case "luni":
            case"marti":
            case"miercuri":
            case"joi":
            case "vineri":
                System.out.println("zile lucratoare");
                break;
            default:
                System.out.println("zile libere");
        }
    }
}
