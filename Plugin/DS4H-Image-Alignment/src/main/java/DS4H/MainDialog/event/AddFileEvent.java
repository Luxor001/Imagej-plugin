package DS4H.MainDialog.event;

public class AddFileEvent implements IMainDialogEvent {
    private String filePath = "";

    public AddFileEvent(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
