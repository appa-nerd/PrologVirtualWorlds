/***********************************************************************

  OKBC Implemementation for Java

  Copyright (c) 1996, 1997 Stanford University KSL.

  Original code by James Rice (rice@ksl.stanford.edu)


  This code was automatically generated on Tuesday, 21 December 1999.

  KSL Network Services available at:
            http://ontolingua.stanford.edu/


  Legal Notice for KSL Network Services

  The software made available through the Stanford Knowledge Systems
  Laboratory's Network Services was written by and is copyright (c) by
  Stanford University, Knowledge Systems Laboratory and others not
  limited to those mentioned below.
  
  NEITHER THE AUTHORS NOR THE PUBLISHER OF THESE SERVICES AND DOCUMENTS
  OFFER ANY WARRANTY OF FITNESS OR MERCHANTABILITY FOR ANY PARTICULAR
  PURPOSE OR ACCEPTS ANY LIABILITY WITH RESPECT TO THE SERVICES,
  PROGRAMS, PROCEDURES, ALGORITHMS, DOCUMENTS OR APPLICATIONS OR
  DOCUMENTS MADE AVAILABLE THROUGH THE KNOWLEDGE SYSTEMS LABORATORY'S
  NETWORK SERVICES.
  
  
  ***********************************************************************/
package OKBC;

import java.util.*;
import java.io.*;

public class NotUniqueError extends AbstractError {
  public Node pattern = null;
  public Node matches = null;
  public Node context = null;

  public NotUniqueError () {}

  public NotUniqueError (Node the_pattern,
                         Node the_matches,
                         Node the_context,
                         Node the_kb) {
    pattern = the_pattern;
    matches = the_matches;
    context = the_context;
    kb = the_kb;
  }

  public NotUniqueError (Node the_pattern,
                         Node the_matches,
                         Node the_context,
                         Node the_kb,
                         Node the_continuable,
                         Node the_error_message) {
    pattern = the_pattern;
    matches = the_matches;
    context = the_context;
    kb = the_kb;
    continuable = the_continuable;
    error_message = the_error_message;
  }

  public void init_from_plist (Node plist) {
    pattern = 
      plistGet(Symbol.keyword("PATTERN"), plist);
    matches = 
      plistGet(Symbol.keyword("MATCHES"), plist);
    context = 
      plistGet(Symbol.keyword("CONTEXT"), plist);
    kb = 
      plistGet(Symbol.keyword("KB"), plist);
    super.init_from_plist(plist);
  }

  public Node decode_to_plist() {
    return Cons.append_cons(Cons.list(Symbol.keyword("PATTERN"),
                                      (pattern == null ?
                                       Node._NIL :
                                       pattern),
                                      Symbol.keyword("MATCHES"),
                                      (matches == null ?
                                       Node._NIL :
                                       matches),
                                      Symbol.keyword("CONTEXT"),
                                      (context == null ?
                                       Node._NIL :
                                       context),
                                      Symbol.keyword("KB"),
                                      (kb == null ?
                                       Node._NIL :
                                       kb)),
                            super.decode_to_plist());
  }

  public String report () {
    return "Pattern [" +
           pattern +
           "] does not uniquely identify a " +
           context +
           " in " +
           kb +
           ".  It matches " +
           matches +
           ".";
  }
}