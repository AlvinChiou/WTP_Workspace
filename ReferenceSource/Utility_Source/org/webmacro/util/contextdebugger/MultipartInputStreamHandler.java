package org.webmacro.util.contextdebugger;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Hashtable;
import java.util.Enumeration;
import javax.servlet.ServletRequest;
import javax.servlet.ServletInputStream;


// A class to aid in reading multipart/form-data from a ServletInputStream.
// It keeps track of how many bytes have been read and detects when the
// Content-Length limit has been reached.  This is necessary since some
// servlet engines are slow to notice the end of stream.
//

/**
 * Class declaration
 *
 *
 * @author
 * @version %I%, %G%
 */

class MultipartInputStreamHandler {

    ServletInputStream  in;
    String              boundary;
    int                 totalExpected;
    int                 totalRead = 0;
    byte[]              buf = new byte[8 * 1024];

    /**
     * Constructor declaration
     *
     *
     * @param in
     * @param boundary
     * @param totalExpected
     *
     * @see
     */

    public MultipartInputStreamHandler(ServletInputStream in, String boundary, int totalExpected) {
        this.in = in;
        this.boundary = boundary;
        this.totalExpected = totalExpected;
    }

    // Reads the next line of input.  Returns null to indicate the end
    // of stream.
    //

    /**
     * Method declaration
     *
     *
     * @return
     *
     * @throws IOException
     *
     * @see
     */

    public String readLine() throws IOException {
        StringBuffer    sbuf = new StringBuffer();
        int             result;
        String          line;

        do {
            result = this.readLine(buf, 0, buf.length);     // this.readLine() does +=

            if (result != -1) {
                sbuf.append(new String(buf, 0, result, "ISO-8859-1"));
            }
        } while (result == buf.length);                     // loop only if the buffer was filled

        if (sbuf.length() == 0) {
            return null;    // nothing read, must be at the end of stream
        }

        sbuf.setLength(sbuf.length() - 2);      // cut off the trailing \r\n

        return sbuf.toString();
    }

    // A pass-through to ServletInputStream.readLine() that keeps track
    // of how many bytes have been read and stops reading when the
    // Content-Length limit has been reached.
    //

    /**
     * Method declaration
     *
     *
     * @param b
     * @param off
     * @param len
     *
     * @return
     *
     * @throws IOException
     *
     * @see
     */

    public int readLine(byte b[], int off, int len) throws IOException {
        if (totalRead >= totalExpected) {
            return -1;
        } else {
            int result = in.readLine(b, off, len);

            if (result > 0) {
                totalRead += result;
            }

            return result;
        }
    }

}



/*--- formatting done in "CIBC Java Application Frameworks Coding Style" style on 02-14-2000 ---*/


