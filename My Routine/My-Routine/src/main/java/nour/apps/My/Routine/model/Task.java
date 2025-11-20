package nour.apps.My.Routine.model;


import java.util.List;

/* planed action but not related to fixed action
  like 'Go shopping , fix car ,etc..'
 */
public class Task extends Event {


    TaskType taskType;

    List<Appointment> appointments;

    Priority priority;

    int frequency;

    boolean isOneTime;

}
