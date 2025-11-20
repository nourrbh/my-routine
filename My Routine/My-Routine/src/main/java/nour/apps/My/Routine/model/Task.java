package nour.apps.My.Routine.model;


import java.util.List;

/* planed event but not related to fixed action
   not happened frequently
   like 'Go shopping , fix car ... etc'
 */
public class Task extends Event {


    TaskType taskType;

    List<Appointment> appointments;

    Priority priority;

    int frequency;

    boolean isOneTime;

}
