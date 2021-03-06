package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>halt/0</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
public class PRED_halt_0 extends PredicateBase {
    static /*IntegerTerm*/Object si1 = makeInteger(1);

    public PRED_halt_0(Predicate cont) {
        this.cont = cont;
    }

    public PRED_halt_0(){}

    public void setArgument(Object[] args, Predicate cont) {
        this.cont = cont;
    }

    public int arity() { return 0; }

    public String nameUQ() { return "halt"; }

    public void sArg(int i0, Object val) {  switch (i0) {default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'halt";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
    // halt:-halt(1)
        engine.setB0();
    // halt:-[halt(1)]
        return exit(engine, new PRED_halt_1(si1, cont));
    }
}
