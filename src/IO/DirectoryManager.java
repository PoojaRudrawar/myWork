package IO;

/**
 * Created by PRudrawar on 12/12/2017.
 */
import java.io.File;
import java.io.FileNotFoundException;

//import org.apache.log4j.Logger;

public class DirectoryManager {

  //  private static Logger log = Logger.getLogger(DirectoryManager.class);

    public DirectoryManager() {

    }

    public File[] getFiles(String directoryPath) throws FileNotFoundException {

        File path = new File(directoryPath);
        if (path.exists() && path.isDirectory()) {
            return getFiles(path);
        } else {
            throw new FileNotFoundException(String.format("The directory [%s] does not exist!!!", directoryPath));
        }
    }

    private File[] getFiles(File directory) {
        return directory.listFiles();
    }

    public void removeFilesUntilDate(File[] files, long date, Boolean includeInnerFolders) {
        for (File file : files) {
            if (includeInnerFolders && file.isDirectory()) {
  //              log.info(String.format("Scanning inner directory: %s", file.getName()));
                removeFilesUntilDate(file.listFiles(), date, includeInnerFolders);
                file.delete();
            } else if (file.isFile()) {
                if (file.lastModified() < date) {
                    String fileName = file.getName();
                    Boolean deleted = file.delete();
                    if (deleted) {
    //                    log.info(String.format("File %s was successfully deleted", fileName));
                    } else {
      //                  log.warn(String.format("File %s deletation failure", fileName));
                    }
                }
            }
        }
    }

    public void cleanDirectory(String path, long date, boolean includeInnerFolders) throws FileNotFoundException {
        //log.info(String.format("Scanning directory %s", path));
        File[] files = getFiles(path);
        removeFilesUntilDate(files, date, includeInnerFolders);
    }
}
