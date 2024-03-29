// Serve - minimal Java HTTP server class
//
// Copyright (C)1996,1998 by Jef Poskanzer <jef@acme.com>. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
// OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
// HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE.
//
// Visit the ACME Labs Java page for up-to-date versions of this and other
// fine Java utilities: http://www.acme.com/java/

package Acme.Serve;

import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;
import Acme.Serve.servlet.*;
import Acme.Serve.servlet.http.*;

class ServeConfig implements ServletConfig
    {

    private ServletContext context;

    public ServeConfig( ServletContext context )
	{
	this.context = context;
	}

    // Methods from ServletConfig.

    /// Returns the context for the servlet.
    public ServletContext getServletContext()
	{
	return context;
	}

    /// Gets an initialization parameter of the servlet.
    // @param name the parameter name
    public String getInitParameter( String name )
	{
	// This server doesn't support servlet init params.
	return null;
	}

    /// Gets the names of the initialization parameters of the servlet.
    // @param name the parameter name
    public Enumeration getInitParameterNames()
	{
	// This server doesn't support servlet init params.
	return new Vector().elements();
	}

    }


