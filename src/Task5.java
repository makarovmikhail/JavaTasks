import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by Mikhail on 05.10.2017.
 */
public class Task5 {
    static void UnZip() throws IOException{
        try {
            // Open the zip file
            ZipFile zipFile = new ZipFile("src/src.zip");
            Enumeration<?> enu = zipFile.entries();
            while (enu.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) enu.nextElement();

                String name = "D://unzipFolder/" + zipEntry.getName();
                long size = zipEntry.getSize();
                long compressedSize = zipEntry.getCompressedSize();
                System.out.println("name: " + name);

                // Creating directories
                File file = new File(name);
                if (name.endsWith("/")) {
                    file.mkdirs();
                    continue;
                }

                File parent = file.getParentFile();
                if (parent != null) {
                    parent.mkdirs();
                }

                // Extract the file
                InputStream is = zipFile.getInputStream(zipEntry);
                FileOutputStream fos = new FileOutputStream(file);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = is.read(bytes)) >= 0) {
                    fos.write(bytes, 0, length);
                }
                is.close();
                fos.close();
            }
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void searching() throws IOException {
        Files.walk(Paths.get("D://unzipFolder/"),100)
                .filter(p -> p.toString().contains("volatile"))
                .map(p -> p.getParent().getParent())
                .distinct()
                .forEach(System.out::println);
        Files.walk(Paths.get("D://unzipFolder"))
                .filter(p -> p.toString().contains("transient"))
                .map(p -> p.getParent().getParent())
                .distinct()
                .forEach(System.out::println);
    }
}
