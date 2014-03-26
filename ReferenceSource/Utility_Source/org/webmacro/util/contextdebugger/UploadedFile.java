package org.webmacro.util.contextdebugger;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Hashtable;
import java.util.Enumeration;
import javax.servlet.ServletRequest;
import javax.servlet.ServletInputStream;


// A class to hold information about an uploaded file.
//

/**
 * Class declaration
 *
 *
 * @author
 * @version %I%, %G%
 */

class UploadedFile {

    private String  dir;
    private String  filename;
    private String  type;

    /**
     * Constructor declaration
     *
     *
     * @param dir
     * @param filename
     * @param type
     *
     * @see
     */

    UploadedFile(String dir, String filename, String type) {
        this.dir = dir;
        this.filename = filename;
        this.type = type;
    }

    /**
     * Method declaration
     *
     *
     * @return
     *
     * @see
     */

    public String getContentType() {
        return type;
    }

    /**
     * Method declaration
     *
     *
     * @return
     *
     * @see
     */

    public String getFilesystemName() {
        return filename;
    }

    /**
     * Method declaration
     *
     *
     * @return
     *
     * @see
     */

    public File getFile() {
        if (dir == null || filename == null) {
            return null;
        } else {
            return new File(dir + File.separator + filename);
        }
    }

}


