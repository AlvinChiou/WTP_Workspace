/*

 * Copyright (c) 1999 The Java Apache Project.  All rights reserved.

 *

 * Redistribution and use in source and binary forms, with or without

 * modification, are permitted provided that the following conditions

 * are met:

 *

 * 1. Redistributions of source code must retain the above copyright

 *    notice, this list of conditions and the following disclaimer.

 *

 * 2. Redistributions in binary form must reproduce the above copyright

 *    notice, this list of conditions and the following disclaimer in

 *    the documentation and/or other materials provided with the

 *    distribution.

 *

 * 3. All advertising materials mentioning features or use of this

 *    software must display the following acknowledgment:

 *    "This product includes software developed by the Java Apache 

 *    Project. <http://java.apache.org/>"

 *

 * 4. The names "Java Apache Element Construction Set", "Java Apache ECS" and 

 *    "Java Apache Project" must not be used to endorse or promote products 

 *    derived from this software without prior written permission.

 *

 * 5. Products derived from this software may not be called 

 *    "Java Apache Element Construction Set" nor "Java Apache ECS" appear 

 *    in their names without prior written permission of the 

 *    Java Apache Project.

 *

 * 6. Redistributions of any form whatsoever must retain the following

 *    acknowledgment:

 *    "This product includes software developed by the Java Apache 

 *    Project. <http://java.apache.org/>"

 *    

 * THIS SOFTWARE IS PROVIDED BY THE JAVA APACHE PROJECT "AS IS" AND ANY

 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE

 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR

 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE JAVA APACHE PROJECT OR

 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,

 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT

 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;

 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)

 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,

 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)

 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED

 * OF THE POSSIBILITY OF SUCH DAMAGE.

 *

 * This software consists of voluntary contributions made by many

 * individuals on behalf of the Java Apache Project. For more information

 * on the Java Apache Project please see <http://java.apache.org/>.

 *

 */

package org.apache.ecs.xhtml;



import org.apache.ecs.*;



import java.io.OutputStream;

import java.io.PrintWriter;

import java.io.IOException;

import java.io.ByteArrayOutputStream;

import java.io.BufferedOutputStream;

import java.util.Enumeration;

import java.util.Vector;

import org.apache.ecs.storage.Hash;



/**

    This class defines a comment &lt;-- value --&gt; Element.

    @version $Id: comment.java,v 1.1 2000/11/28 17:35:19 jstoor Exp $

    @author <a href="mailto:snagy@servletapi.com">Stephan Nagy</a>

    @author <a href="mailto:jon@clearink.com">Jon S. Stevens</a>

    @author <a href="mailto:bojan@binarix.com">Bojan Smojver</a>

*/

public class comment extends MultiPartElement implements Printable

{



    /**

        private initializer.

    */

    {

        setElementType("--");

        setCase(LOWERCASE);

        setAttributeQuote(true);

        setBeginStartModifier('!');

    }



    /**

        Default constructor use set* methods.

    */

    public comment()

    {

    }



    /**

        Create a comment object containg this element.

    */

    public comment(String element)

    {

        addElement(element);

    }



    /**

        Create a comment object containg this element.

    */

    public comment(Element element)

    {

        addElement(element);

    }



    /**

        Sets the lang="" and xml:lang="" attributes

        @param   lang  the lang="" and xml:lang="" attributes

    */

    public Element setLang(String lang)

    {

        addAttribute("lang",lang);

        addAttribute("xml:lang",lang);

        return this;

    }



    /**

        Adds an Element to the element.

        @param  hashcode name of element for hash table

        @param  element Adds an Element to the element.

     */

    public comment addElement(String hashcode,Element element)

    {

        addElementToRegistry(hashcode,element);

        return(this);

    }



    /**

        Adds an Element to the element.

        @param  hashcode name of element for hash table

        @param  element Adds an Element to the element.

     */

    public comment addElement(String hashcode,String element)

    {

        addElementToRegistry(hashcode,element);

        return(this);

    }

    

    /**

        Adds an Element to the element.

        @param  element Adds an Element to the element.

     */

    public comment addElement(Element element)

    {

        addElementToRegistry(element);

        return(this);

    }

    /**

        Adds an Element to the element.

        @param  element Adds an Element to the element.

     */

    public comment addElement(String element)

    {

        addElementToRegistry(element);

        return(this);

    }

    /**

        Removes an Element from the element.

        @param hashcode the name of the element to be removed.

    */

    public comment removeElement(String hashcode)

    {

        removeElementFromRegistry(hashcode);

        return(this);

    }



    protected String createStartTag()

    {

        setEndTagChar(' ');

        StringBuffer out = new StringBuffer();

        out.append(getStartTagChar());



        if(getBeginStartModifierDefined())

        {

            out.append(getBeginStartModifier());

        }

        out.append(getElementType());



        if(getBeginEndModifierDefined())

        {

            out.append(getBeginEndModifier());

        }

        out.append(getEndTagChar());



        setEndTagChar('>'); // put back the end tag character.

        return(out.toString());

    }

    

    protected String createEndTag()

    {

        StringBuffer out = new StringBuffer();

        setStartTagChar(' ');

        setEndStartModifier(' ');



        out.append(getStartTagChar());



        if(getEndStartModifierDefined())

        {

            out.append(getEndStartModifier());

        }

        out.append(getElementType());



        if(getEndEndModifierDefined())

        {

            out.append(getEndEndModifier());

        }

        out.append(getEndTagChar());

        setStartTagChar('<'); // put back the tag start character



        return(out.toString());

    }

} 

