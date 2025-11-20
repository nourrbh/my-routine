package nour.apps.My.Routine.model;

import java.time.LocalDate;
import java.util.List;

public class DailySchedule   extends Lov {


    DayType dayType;

    LocalDate date;

    List <DateRange> dateRanges;

    List<Action> actions;

    List<Task> tasks;

    List<Combos> combos;

    List<Buffer> buffers;

}
