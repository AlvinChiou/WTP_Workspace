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
    This class implements the dtmf element

    @author Written by <a href="mailto:jcarol@us.ibm.com">Carol Jones</a>
*/
public class Dtmf extends VXMLElement
{

    /**
	Basic constructor. You need to set the attributes using the
	set* methods.
    */
    public Dtmf()
    {
	super("dtmf");
    }

    
    /**
	This constructor creates a &lt;dtmf&gt; tag.
	@param src the src="" attribute
	@param scope the scope="" attribute
	@param t the type="" attribute
	@param caching the caching="" attribute
	@param fetchint the fetchint="" attribute
	@param fetchtimeout the fetchtimeout="" attribute
    */
    public Dtmf(String src, String scope, String t,  
	              String caching, String fetchint, String fetchtimeout)
    {
	this();
	setSrc(src);
	setScope(scope);
	setType(t);
	setCaching(caching);
	setFetchint(fetchint);
	setFetchtimeout(fetchtimeout);
    }

    /**
	This constructor creates a &lt;dtmf&gt; tag.
	@param t the type="" attribute
    */
    public Dtmf(String t)
    {
	this();
	setType(t);
    }

    /**
	This constructor creates a &lt;dtmf&gt; tag.
	@param src the src="" attribute
	@param t the type="" attribute
    */
    public Dtmf(String src, String t)
    {
	this();
	setSrc(src);
	setType(t);
    }
        
    /**
	Sets the src="" attribute
	@param src the src="" attribute
    */
    public Dtmf setSrc(String src)
    {
	addAttribute("src", src);
	return this;
    }

    /**
	Sets the scope="" attribute
	@param scope the scope="" attribute
    */
    public Dtmf setScope(String scope)
    {
	addAttribute("scope", scope);
	return this;
    }


    /**
	Sets the type="" attribute
	@param t the type="" attribute
    */
    public Dtmf setType(String t)
    {
	addAttribute("type", t);
	return this;
    }

    /**
	Sets the caching="" attribute
	@param caching the caching="" attribute
    */
    public Dtmf setCaching(String caching)
    {
	addAttribute("caching", caching);
	return this;
    }

    /**
	Sets the fetchint="" attribute
	@param fetchint the fetchint="" attribute
    */
    public Dtmf setFetchint(String fetchint)
    {
	addAttribute("fetchint", fetchint);
	return this;
    }

    /**
	Sets the fetchtimeout="" attribute
	@param fetchtimeout the fetchtimeout="" attribute
    */
    public Dtmf setFetchtimeout(String fetchtimeout)
    {
	addAttribute("fetchtimeout", fetchtimeout);
	return this;
    }

    
} 
