import java.io.File;

/**
 * Created by ltudor on 2/18/16.
 */
public class OnlyZipFilesReport extends ValidateNonNullReport {
    @Override
    public final void checkAfterNull(File f) throws ReportException {
        if (!f.getName().endsWith(".zip")) throw new InvalidFileTypeReportException(f);
        checkAfterZip(f);
    }

    public void checkAfterZip(File f) throws ReportException {
    }
}
