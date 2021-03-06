import java.util.ArrayList;

public class Rooms{


    public ArrayList<Rooms>arrayList ;
    private boolean hasAMonster =false;
    private boolean hasAUpstairs = false ;
    private boolean hasADownStairs = false;
    private boolean hasATownsPeople = false ;
    private String name ;
    private int id ;




    public Monster monster ;
    public TownsPeople townsPeople ;

    public Rooms() {
        this.arrayList = new ArrayList<>();



    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean hasAMonster() {
        return hasAMonster;
    }

    public void setHasAMonster(boolean hasAMonster) {
        this.hasAMonster = hasAMonster;
    }

    public boolean hasAUpstairs() {
        return hasAUpstairs;
    }

    public void setHasAUpstairs(boolean hasAUpstairs) {
        this.hasAUpstairs = hasAUpstairs;
    }

    public boolean hasADownStairs() {
        return hasADownStairs;
    }

    public void setHasADownStair(boolean hasADownStairs) {
        this.hasADownStairs = hasADownStairs;
    }

    public boolean hasATownsPeople() {
        return hasATownsPeople ;

    }
    public void setHasATownsPeople(boolean hasATownsPeople) {
        this.hasATownsPeople = hasATownsPeople;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void addDoor(Rooms tempRoom) {
        arrayList.add(tempRoom);

    }
    public void printPossibleRooms(){
        System.out.println("Room :"+getName());
        for (Rooms rooms : arrayList) {
            System.out.println(rooms.getName());
        }
    }



}
