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

/**

    This class creates a &lt;button&gt; tag.

                                   

    @version $Id: button.java,v 1.1 2000/11/28 17:35:14 jstoor Exp $

    @author <a href="mailto:snagy@servletapi.com">Stephan Nagy</a>

    @author <a href="mailto:jon@clearink.com">Jon S. Stevens</a>

    @author <a href="mailto:bojan@binarix.com">Bojan Smojver</a>

*/



public class button extends MultiPartElement implements Printable, FocusEvents, MouseEvents, KeyEvents

{

    // convience variables

    public final static String reset = "reset";

    public final static String submit = "submit";

    public final static String button = "button";



    /**

        private initializaer.

    */

    {

        setElementType("button");

        setCase(LOWERCASE);

        setAttributeQuote(true);

    }



    public button()

    {

    }



    /**

        Set the name of this button.

        @param name set the name of this button.

    */

    public button setName(String name)

    {

        addAttribute("name",name);

        return(this);

    }



    /**

        Set the value of this button.

        @param value set the value of this button.

    */

    public button setValue(String value)

    {

        addAttribute("value",value);

        return(this);

    }



    /**

        Set the type of button this is. Convience variables are<br>

        button.submit<br>button.reset<br>button.button

        @param button type.

    */

    public button setType(String type)

    {

        addAttribute("type",type);

        return(this);

    }



    /**

        Is this button disabled?

        disabled true|false

    */

    public button setDisabled(boolean disabled)

    {

        if(disabled)

            addAttribute("disabled","disabled");

        else

            removeAttribute("disabled");

        return(this);

    }



    /**

        Set the elements position in the tabbing order.

        @param number set the elements position in the tabbing order.

    */

    public button setTabIndex(int number)

    {

        addAttribute("tabindex",Integer.toString(number));

        return(this);

    }



    /**

        Set the elements position in the tabbing order.

        @param number set the elements position in the tabbing order.

    */

    public button setTabIndex(String number)

    {

        addAttribute("tabindex",number);

        return(this);

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

    public button addElement(String hashcode,Element element)

    {

        addElementToRegistry(hashcode,element);

        return(this);

    }



    /**

        Adds an Element to the element.

        @param  hashcode name of element for hash table

        @param  element Adds an Element to the element.

     */

    public button addElement(String hashcode,String element)

    {

        addElementToRegistry(hashcode,element);

        return(this);

    }



    /**

        Adds an Element to the element.

        @param  element Adds an Element to the element.

     */

    public button addElement(Element element)

    {

        addElementToRegistry(element);

        return(this);

    }

    

    /**

        Adds an Element to the element.

        @param  element Adds an Element to the element.

     */

    public button addElement(String element)

    {

        addElementToRegistry(element);

        return(this);

    }

    /**

        Removes an Element from the element.

        @param hashcode the name of the element to be removed.

    */

    public button removeElement(String hashcode)

    {

        removeElementFromRegistry(hashcode);

        return(this);

    }



    /**

        The onfocus event occurs when an element receives focus either by the

        pointing device or by tabbing navigation. This attribute may be used

        with the following elements: LABEL, INPUT, SELECT, TEXTAREA, and

        BUTTON.

        

        @param The script

    */

    public void setOnFocus(String script)

    {

        addAttribute ( "onfocus", script );

    }



    /**

        The onblur event occurs when an element loses focus either by the

        pointing device or by tabbing navigation. It may be used with the same

        elements as onfocus.

        

        @param The script

    */

    public void setOnBlur(String script)

    {

        addAttribute ( "onblur", script );

    }



    /**

        The onclick event occurs when the pointing device button is clicked

        over an element. This attribute may be used with most elements.

        

        @param The script

    */

    public void setOnClick(String script)

    {

        addAttribute ( "onclick", script );

    }

    /**

        The ondblclick event occurs when the pointing device button is double

        clicked over an element. This attribute may be used with most elements.



        @param The script

    */

    public void setOnDblClick(String script)

    {

        addAttribute ( "ondblclick", script );

    }

    /**

        The onmousedown event occurs when the pointing device button is pressed

        over an element. This attribute may be used with most elements.



        @param The script

    */

    public void setOnMouseDown(String script)

    {

        addAttribute ( "onmousedown", script );

    }

    /**

        The onmouseup event occurs when the pointing device button is released

        over an element. This attribute may be used with most elements.



        @param The script

    */

    public void setOnMouseUp(String script)

    {

        addAttribute ( "onmouseup", script );

    }

    /**

        The onmouseover event occurs when the pointing device is moved onto an

        element. This attribute may be used with most elements.



        @param The script

    */

    public void setOnMouseOver(String script)

    {

        addAttribute ( "onmouseover", script );

    }

    /**

        The onmousemove event occurs when the pointing device is moved while it

        is over an element. This attribute may be used with most elements.



        @param The script

    */

    public void setOnMouseMove(String script)

    {

        addAttribute ( "onmousemove", script );

    }

    /**

        The onmouseout event occurs when the pointing device is moved away from

        an element. This attribute may be used with most elements.



        @param The script

    */

    public void setOnMouseOut(String script)

    {

        addAttribute ( "onmouseout", script );

    }



    /**

        The onkeypress event occurs when a key is pressed and released over an

        element. This attribute may be used with most elements.

        

        @param The script

    */

    public void setOnKeyPress(String script)

    {

        addAttribute ( "onkeypress", script );

    }



    /**

        The onkeydown event occurs when a key is pressed down over an element.

        This attribute may be used with most elements.

        

        @param The script

    */

    public void setOnKeyDown(String script)

    {

        addAttribute ( "onkeydown", script );

    }



    /**

        The onkeyup event occurs when a key is released over an element. This

        attribute may be used with most elements.

        

        @param The script

    */

    public void setOnKeyUp(String script)

    {

        addAttribute ( "onkeyup", script );

    }

} 

