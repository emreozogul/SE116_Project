
public class Main {
    public static void main(String[] args) {

        Level lv1 = Level.generateLevel();
        System.out.println(lv1.corridorArrayList.size());
        System.out.println();
        for (int i = 0; i < lv1.allRooms.size(); i++) {
            lv1.allRooms.get(i).printPossibleRooms();
            System.out.println();
        }
        String x  ="Room1";
        System.out.println(x.equals(lv1.allRooms.get(1).getName()));














    }
}
