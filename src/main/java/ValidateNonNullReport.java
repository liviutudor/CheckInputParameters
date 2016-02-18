import java.io.File;

/**
 * Created by ltudor on 2/18/16.
 */
public class ValidateNonNullReport extends Report {
    @Override
    public final void validate(File f) throws ReportException {
        if (f == null) throw new ReportNullFileException();
        checkAfterNull(f);
    }

    public void checkAfterNull(File f) throws ReportException {
    }
}
