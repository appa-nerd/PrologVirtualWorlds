package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>(initialization)/2</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
public class PRED_initialization_2 extends PredicateBase {
    static /*Symbol*/Object s1 = makeAtom("[]");
    static /*Symbol*/Object s2 = makeAtom(":", 2);
    static /*Symbol*/Object s3 = makeAtom("jp.ac.kobe_u.cs.prolog.builtin");
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _initialization_2_var = new PRED_initialization_2_var();
    static Predicate _initialization_2_var_1 = new PRED_initialization_2_var_1();
    static Predicate _initialization_2_1 = new PRED_initialization_2_1();
    static Predicate _initialization_2_2 = new PRED_initialization_2_2();

    public Object arg1, arg2;

    public PRED_initialization_2(Object a1, Object a2, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public PRED_initialization_2(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        this.cont = cont;
    }

    public int arity() { return 2; }

    public String nameUQ() { return "initialization"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
         case 1: arg2 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
         case 1: return arg2;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'initialization'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
        engine_aregs[1] = arg1;
        engine_aregs[2] = arg2;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_initialization_2_var, _fail_0, _fail_0, _initialization_2_1, _fail_0, _initialization_2_2);
    }
}

class PRED_initialization_2_var extends PRED_initialization_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_initialization_2_1, _initialization_2_var_1);
    }
}

class PRED_initialization_2_var_1 extends PRED_initialization_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_initialization_2_2);
    }
}

class PRED_initialization_2_1 extends PRED_initialization_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // initialization([], A):-!, call(A)
        Object a1, a2, a3;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        cont = engine.cont;
    // initialization([], A):-['$neck_cut', call('jp.ac.kobe_u.cs.prolog.builtin':A)]
        a1 = deref( a1);
        if (isAtomTerm(a1)){
            if (! prologEquals(a1,s1))
                return fail(engine);
        } else if (isVariable(a1)){
             bind(/*VAR*/ a1,s1);
        } else {
            return fail(engine);
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        Object[] y1 = {s3, a2};
        a3 = makeStructure(s2, y1);
        return exit(engine, new PRED_call_1(a3, cont));
    }
}

class PRED_initialization_2_2 extends PRED_initialization_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // initialization([A|B], C):-'$new_internal_database'(A), initialization(B, C)
        Object a1, a2, a3, a4;
        Predicate p1;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        cont = engine.cont;
    // initialization([A|B], C):-['$new_internal_database'(A), initialization(B, C)]
        a1 = deref( a1);
        if (isListTerm(a1)){
            Object[] args = consArgs(a1);
            a3 = args[0];
            a4 = args[1];
        } else if (isVariable(a1)){
            a3 = engine.makeVariable(this);
            a4 = engine.makeVariable(this);
             bind(a1,makeList(a3, a4));
        } else {
            return fail(engine);
        }
        p1 = new PRED_initialization_2(a4, a2, cont);
        return exit(engine, new PRED_$new_internal_database_1(a3, p1));
    }
}