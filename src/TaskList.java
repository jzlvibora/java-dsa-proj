public class TaskList {
    private LinkedListRaw taskList = new LinkedListRaw();

    public void addTask(String task){
        taskList.add(task);

        System.out.println(taskList.head.data);
        System.out.println(taskList.head.nextData);
    }
}
