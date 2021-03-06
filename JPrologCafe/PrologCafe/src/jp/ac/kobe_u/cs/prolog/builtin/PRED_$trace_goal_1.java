package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$trace_goal'/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_$trace_goal_1 extends PredicateBase {
    static /*Symbol*/Object s1 = makeAtom("leap");
    static /*Symbol*/Object s2 = makeAtom("no");
    static /*Symbol*/Object s3 = makeAtom("user");
    static /*IntegerTerm*/Object si4 = makeInteger(0);
    static /*Symbol*/Object s5 = makeAtom("trace");

    public Object arg1;

    public PRED_$trace_goal_1(Object a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_$trace_goal_1(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String nameUQ() { return "$trace_goal"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'$trace_goal'(" + argString(arg1,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
    // '$trace_goal'(A):-'$set_debug_flag'(leap, no), '$get_level'(B), '$meta_call'(A, user, B, 0, trace)
        engine.setB0();
        Object a1, a2;
        Predicate p1, p2;
        a1 = arg1;
    // '$trace_goal'(A):-['$set_debug_flag'(leap, no), '$get_level'(B), '$meta_call'(A, user, B, 0, trace)]
        a2 = engine.makeVariable(this);
        p1 = new PRED_$meta_call_5(a1, s3, a2, si4, s5, cont);
        p2 = new PRED_$get_level_1(a2, p1);
        return exit(engine, new PRED_$set_debug_flag_2(s1, s2, p2));
    }
}
