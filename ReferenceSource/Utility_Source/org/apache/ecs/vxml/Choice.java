/*
 * Copyright (c) 2000 The Java Apache Project.  All rights reserved.
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
package org.apache.ecs.vxml;

/**
    This class implements the choice element

    @author Written by <a href="mailto:jcarol@us.ibm.com">Carol Jones</a>
*/
public class Choice extends VXMLElement
{

    /**
	Basic constructor. You need to set the attributes using the
	set* methods.
    */
    public Choice()
    {
	super("choice");
    }

    
    /**
	This constructor creates a &lt;choice&gt; tag.
	@param dtmf the dtmf="" attribute
	@param next the next="" attribute
	@param event the event="" attribute
	@param expr the expr="" attribute
	@param caching the caching="" attribute
	@param fetchaudio the fetchaudio="" attribute
	@param fetchint the fetchint="" attribute
	@param fetchtimeout the fetchtimeout="" attribute
    */
    public Choice(String dtmf, String next, String event, String expr, 
	              String caching, String fetchaudio, String fetchint, String fetchtimeout)
    {
	this();
	setDtmf(dtmf);
	setNext(next);
	setEvent(event);
	setExpr(expr);
	setCaching(caching);
	setFetchaudio(fetchaudio);
	setFetchint(fetchint);
	setFetchtimeout(fetchtimeout);
    }

    /**
	This constructor creates a &lt;choice&gt; tag.
	@param next the next="" attribute
    */
    public Choice(String next)
    {
	this();
	setNext(next);
    }
    
    /**
	This constructor creates a &lt;choice&gt; tag.
	@param dtmf the dtmf="" attribute
	@param next the next="" attribute
    */
    public Choice(String dtmf, String next)
    {
	this();
	setDtmf(dtmf);
	setNext(next);
    }
    
    /**
	Sets the dtmf="" attribute
	@param dtmf the dtmf="" attribute
    */
    public Choice setDtmf(String dtmf)
    {
	addAttribute("dtmf", dtmf);
	return this;
    }

    /**
	Sets the next="" attribute
	@param next the next="" attribute
    */
    public Choice setNext(String next)
    {
	addAttribute("next", next);
	return this;
    }


    /**
	Sets the event="" attribute
	@param event the event="" attribute
    */
    public Choice setEvent(String event)
    {
	addAttribute("event", event);
	return this;
    }

    /**
	Sets the expr="" attribute
	@param expr the expr="" attribute
    */
    public Choice setExpr(String expr)
    {
	addAttribute("expr", expr);
	return this;
    }

    /**
	Sets the caching="" attribute
	@param caching the caching="" attribute
    */
    public Choice setCaching(String caching)
    {
	addAttribute("caching", caching);
	return this;
    }

    /**
	Sets the fetchaudio="" attribute
	@param fetchaudio the fetchaudio="" attribute
    */
    public Choice setFetchaudio(String fetchaudio)
    {
	addAttribute("fetchaudio", fetchaudio);
	return this;
    }

    /**
	Sets the fetchint="" attribute
	@param fetchint the fetchint="" attribute
    */
    public Choice setFetchint(String fetchint)
    {
	addAttribute("fetchint", fetchint);
	return this;
    }

    /**
	Sets the fetchtimeout="" attribute
	@param fetchtimeout the fetchtimeout="" attribute
    */
    public Choice setFetchtimeout(String fetchtimeout)
    {
	addAttribute("fetchtimeout", fetchtimeout);
	return this;
    }

    
} 
