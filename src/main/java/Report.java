import java.io.File;

/**
 * Created by ltudor on 2/18/16.
 */
public class Report {
    public final void export(File file) throws ReportException {
        validate(file);
        System.out.println("File " + file.getAbsolutePath() + " exported.");
    }

    public void validate(File f) throws ReportException {
        // default implementation left blank
    }
}
