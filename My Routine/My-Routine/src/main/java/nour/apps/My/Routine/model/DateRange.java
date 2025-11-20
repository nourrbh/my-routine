package nour.apps.My.Routine.model;

import java.time.LocalDateTime;

public class DateRange extends Lov {


    LocalDateTime start;

    LocalDateTime end;



     //need to add it to service layer
    public boolean overlapsWith(DateRange other) {
        return !this.end.isBefore(other.start) && !other.end.isBefore(this.start);
    }

}
