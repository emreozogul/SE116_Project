import java.io.Serializable;

public class Hero  implements Characters , Serializable {


    private Rooms currentRoom  ;

    public Hero(Rooms currentRoom) {
        this.currentRoom = currentRoom;
    }

    @Override
    public void move() {

    }
}
