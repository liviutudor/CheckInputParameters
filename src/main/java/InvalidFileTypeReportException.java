import java.io.File;

/**
 * Created by ltudor on 2/18/16.
 */
public class InvalidFileTypeReportException extends ReportException {
    public InvalidFileTypeReportException(File f) {
        super(f.getAbsolutePath());
    }
}
