public class Task {
//    leave empty this is for iteration 3
    private String Title;
    private String Description;
    private boolean Complete;

    public Task(String title, String description, boolean complete){
        this.Title = title;
        this.Description = description;
        this.Complete = complete;
    }

    public void setComplete(boolean complete){
        Complete = complete;
    }

    public String getTitle(){
        return Title;
    }

    public String getDescription(){
        return Description;
    }

    public boolean isComplete(){
        return Complete;
    }
}
