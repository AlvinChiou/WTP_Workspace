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
package org.apache.ecs.html;

import org.apache.ecs.*;

/**
    This class creates an ObjectElement

    @version $Id: Applet.java,v 1.2 1999/07/06 05:56:55 stephan Exp $
    @author <a href="mailto:snagy@servletapi.com">Stephan Nagy</a>
    @author <a href="mailto:jon@clearink.com">Jon S. Stevens</a>
*/
public class Applet extends MultiPartElement implements Printable
{
    /**
        Private initializer.
    */
    {
        setElementType("applet");
    }

    /**
        Default constructor.  Creates the &lt;applet/&gt; Element.<br>
        use set* methods.
    */
    public Applet()
    {
    }

   /**
        Determines the base url for this applet.
        @param url base url for this applet.
    */
    public Applet setCodeBase(String url)
    {
        addAttribute("codebase",url);
        return(this);
    }

    /**
        Comma seperated archive list.
        @param url Comma seperate archive list.
    */
    public Applet setArchive(String url)
    {
        addAttribute("archive",url);
        return(this);
    }

    /**
        Applet class file.
        @param code Applet class file.
    */
    public Applet setCode(String code)
    {
        addAttribute("code",code);
        return(this);
    }

    /**
        Suggested height of applet.
        @param height suggested link height.
    */
    public Applet setHeight(String height)
    {
        addAttribute("height",height);
        return(this);
    }

    /**
        Suggested height of applet.
        @param height suggested link height.
    */
    public Applet setHeight(int height)
    {
        addAttribute("height",Integer.toString(height));
        return(this);
    }

    /**
        Suggested height of applet.
        @param height suggested link height.
    */
    public Applet setHeight(double height)
    {
        addAttribute("height",Double.toString(height));
        return(this);
    }

    /**
        Suggested width of applet.
        @param height suggested link width.
    */
    public Applet setWidth(String width)
    {
        addAttribute("width",width);
        return(this);
    }

    /**
        Suggested width of applet.
        @param height suggested link width.
    */
    public Applet setWidth(int width)
    {
        addAttribute("width",Integer.toString(width));
        return(this);
    }

    /**
        Suggested width of object.
        @param height suggested link width.
    */
    public Applet setWidth(double width)
    {
        addAttribute("width",Double.toString(width));
        return(this);
    }

    /**
        Suggested horizontal gutter.
        @param hspace suggested horizontal gutter.
    */
    public Applet setHSpace(String hspace)
    {
        addAttribute("hspace",hspace);
        return(this);
    }

    /**
        Suggested horizontal gutter.
        @param hspace suggested horizontal gutter.
    */
    public Applet setHSpace(int hspace)
    {
        addAttribute("hspace",Integer.toString(hspace));
        return(this);
    }

    /**
        Suggested horizontal gutter.
        @param hspace suggested horizontal gutter.
    */
    public Applet setHSpace(double hspace)
    {
        addAttribute("hspace",Double.toString(hspace));
        return(this);
    }

    /**
        Suggested vertical gutter.
        @param hspace suggested vertical gutter.
    */
    public Applet setVSpace(String vspace)
    {
        addAttribute("vspace",vspace);
        return(this);
    }

    /**
        Suggested vertical gutter.
        @param hspace suggested vertical gutter.
    */
    public Applet setVSpace(int vspace)
    {
        addAttribute("vspace",Integer.toString(vspace));
        return(this);
    }

    /**
        Suggested vertical gutter.
        @param hspace suggested vertical gutter.
    */
    public Applet setVSpace(double vspace)
    {
        addAttribute("vspace",Double.toString(vspace));
        return(this);
    }

    /**
        Set the horizontal or vertical alignment of this applet.<br>
        Convience variables are in the AlignTypes interface.
        @param alignment Set the horizontal or vertical alignment of this applet.<br>
        Convience variables are in the AlignTypes interface.
    */
    public Applet setAlign(String alignment)
    {
        addAttribute("align",alignment);
        return(this);
    }

    /**
        Set the name of this applet.
        @param name set the name of this applet.
    */
    public Applet setName(String name)
    {
        addAttribute("name",name);
        return(this);
    }

    /**
        Serialized applet file.
        @param object Serialized applet file.
    */
    // someone give me a better description of what this does.
    public Applet setObject(String object)
    {
        addAttribute("object",object);
        return(this);
    }

    /**
        Breif description, alternate text for the applet.
        @param alt alternat text.
    */
    public Applet setAlt(String alt)
    {
        addAttribute("alt",alt);
        return(this);
    }
    
    /**
        Adds an Element to the element.
        @param  hashcode name of element for hash table
        @param  element Adds an Element to the element.
     */
    public Applet addElement(String hashcode,Element element)
    {
        addElementToRegistry(hashcode,element);
        return(this);
    }

    /**
        Adds an Element to the element.
        @param  hashcode name of element for hash table
        @param  element Adds an Element to the element.
     */
    public Applet addElement(String hashcode,String element)
    {
        addElementToRegistry(hashcode,element);
        return(this);
    }
    /**
        Add an element to the element
        @param element a string representation of the element
    */
    public Applet addElement(String element)
    {
        addElementToRegistry(element);
        return(this);
    }

    /**
        Add an element to the element
        @param element  an element to add
    */
    public Applet addElement(Element element)
    {
        addElementToRegistry(element);
        return(this);
    }
    /**
        Removes an Element from the element.
        @param hashcode the name of the element to be removed.
    */
    public Applet removeElement(String hashcode)
    {
        removeElementFromRegistry(hashcode);
        return(this);
    }
}
