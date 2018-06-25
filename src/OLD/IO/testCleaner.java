package OLD.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * Created by PRudrawar on 12/12/2017.
 */
public class testCleaner {
    public static void main(String[] args) throws FileNotFoundException {
        String directoryPath = "D:/testClean";
      //  Long dateDelta = message.getProperty("dateDelta", PropertyScope.SESSION);
        Long date = new Date().getTime() ;
        DirectoryManager manager = new DirectoryManager();
        if (new File(directoryPath).exists()) {
            File[] files =manager.getFiles(directoryPath);

            for (File file : files) {

                if ( file.isDirectory()&&!file.getPath().contains("hashes")) {
                       // log.info(String.format("Scanning inner directory: %s", file.getName()));
                    manager.removeFilesUntilDate(file.listFiles(), date, true);
                    file.delete();
                } else if (file.isFile()) {
                    if (file.lastModified() < date) {
                        String fileName = file.getName();
                        Boolean deleted = file.delete();
                        if (deleted) {
                           System.out.print("deleted"+fileName);
                        } else {
                            System.out.print("deletion failure"+fileName);
                        }
                    }
                }
            }


            //manager.cleanDirectory(directoryPath, date, true);
        } else {
           // LOG.warn(String.format("Directory [%s] not exists", directoryPath));
        }

    }
}
