package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>print_message/2</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_print_message_2 extends PredicateBase {
    static /*Symbol*/Object s1 = makeAtom("var");
    static /*Symbol*/Object s2 = makeAtom("print_message", 2);
    static /*IntegerTerm*/Object si3 = makeInteger(1);
    static /*Symbol*/Object s4 = makeAtom("error");
    static /*Symbol*/Object s5 = makeAtom("info");
    static /*Symbol*/Object s6 = makeAtom("{");
    static /*Symbol*/Object s7 = makeAtom("}");
    static /*Symbol*/Object s8 = makeAtom("warning");
    static /*Symbol*/Object s9 = makeAtom("{WARNING: ");
    static Predicate _print_message_2_var = new PRED_print_message_2_var();
    static Predicate _print_message_2_var_1 = new PRED_print_message_2_var_1();
    static Predicate _print_message_2_var_2 = new PRED_print_message_2_var_2();
    static Predicate _print_message_2_var_3 = new PRED_print_message_2_var_3();
    static Predicate _print_message_2_con = new PRED_print_message_2_con();
    static Predicate _print_message_2_con_0 = new PRED_print_message_2_con_0();
    static Predicate _print_message_2_con_0_1 = new PRED_print_message_2_con_0_1();
    static Predicate _print_message_2_con_1 = new PRED_print_message_2_con_1();
    static Predicate _print_message_2_con_1_1 = new PRED_print_message_2_con_1_1();
    static Predicate _print_message_2_con_2 = new PRED_print_message_2_con_2();
    static Predicate _print_message_2_con_2_1 = new PRED_print_message_2_con_2_1();
    static Predicate _print_message_2_1 = new PRED_print_message_2_1();
    static Predicate _print_message_2_2 = new PRED_print_message_2_2();
    static Predicate _print_message_2_3 = new PRED_print_message_2_3();
    static Predicate _print_message_2_4 = new PRED_print_message_2_4();
    static HashtableOfTerm<Predicate> con = new HashtableOfTerm<Predicate>(3);
    static {
        con.put(s4, _print_message_2_con_0);
        con.put(s5, _print_message_2_con_1);
        con.put(s8, _print_message_2_con_2);
    }

    public Object arg1, arg2;

    public PRED_print_message_2(Object a1, Object a2, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public PRED_print_message_2(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        this.cont = cont;
    }

    public int arity() { return 2; }

    public String nameUQ() { return "print_message"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
         case 1: arg2 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
         case 1: return arg2;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'print_message'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
        engine_aregs[1] = arg1;
        engine_aregs[2] = arg2;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_print_message_2_var, _print_message_2_1, _print_message_2_1, _print_message_2_con, _print_message_2_1, _print_message_2_1);
    }
}

class PRED_print_message_2_var extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_print_message_2_1, _print_message_2_var_1);
    }
}

class PRED_print_message_2_var_1 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.retry(_print_message_2_2, _print_message_2_var_2);
    }
}

class PRED_print_message_2_var_2 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.retry(_print_message_2_3, _print_message_2_var_3);
    }
}

class PRED_print_message_2_var_3 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_print_message_2_4);
    }
}

class PRED_print_message_2_con extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.switch_on_hash(con, _print_message_2_1);
    }
}

class PRED_print_message_2_con_0 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_print_message_2_1, _print_message_2_con_0_1);
    }
}

class PRED_print_message_2_con_0_1 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_print_message_2_2);
    }
}

class PRED_print_message_2_con_1 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_print_message_2_1, _print_message_2_con_1_1);
    }
}

class PRED_print_message_2_con_1_1 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_print_message_2_3);
    }
}

class PRED_print_message_2_con_2 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_print_message_2_1, _print_message_2_con_2_1);
    }
}

class PRED_print_message_2_con_2_1 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_print_message_2_4);
    }
}

class PRED_print_message_2_1 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // print_message(A, B):-var(A), !, illarg(var, print_message(A, B), 1)
        Object a1, a2, a3, a4;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        cont = engine.cont;
    // print_message(A, B):-['$get_level'(C), var(A), '$cut'(C), illarg(var, print_message(A, B), 1)]
        a3 = engine.makeVariable(this);
        //START inline expansion of $get_level(a(3))
        if (! unify(a3,makeInteger(engine.B0))) {
            return fail(engine);
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = deref( a1);
        if (! isVariable(a1)) {
            return fail(engine);
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = deref( a3);
        if (! isCutter/*Integer*/(a3)) {
            throw new IllegalTypeException("integer", a3);
        } else {
            engine.cut(( a3));
        }
        //END inline expansion
        Object[] y1 = {a1, a2};
        a4 = makeStructure(s2, y1);
        return exit(engine, new PRED_illarg_3(s1, a4, si3, cont));
    }
}

class PRED_print_message_2_2 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // print_message(error, A):-!, '$error_message'(A)
        Object a1, a2;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        cont = engine.cont;
    // print_message(error, A):-['$neck_cut', '$error_message'(A)]
        a1 = deref( a1);
        if (isAtomTerm(a1)){
            if (! prologEquals(a1,s4))
                return fail(engine);
        } else if (isVariable(a1)){
             bind(/*VAR*/ a1,s4);
        } else {
            return fail(engine);
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return exit(engine, new PRED_$error_message_1(a2, cont));
    }
}

class PRED_print_message_2_3 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // print_message(info, A):-!, '$fast_write'('{'), '$builtin_message'(A), '$fast_write'('}'), nl
        Object a1, a2;
        Predicate p1, p2, p3;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        cont = engine.cont;
    // print_message(info, A):-['$neck_cut', '$fast_write'('{'), '$builtin_message'(A), '$fast_write'('}'), nl]
        a1 = deref( a1);
        if (isAtomTerm(a1)){
            if (! prologEquals(a1,s5))
                return fail(engine);
        } else if (isVariable(a1)){
             bind(/*VAR*/ a1,s5);
        } else {
            return fail(engine);
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        p1 = new PRED_nl_0(cont);
        p2 = new PRED_$fast_write_1(s7, p1);
        p3 = new PRED_$builtin_message_1(a2, p2);
        return exit(engine, new PRED_$fast_write_1(s6, p3));
    }
}

class PRED_print_message_2_4 extends PRED_print_message_2 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // print_message(warning, A):-!, '$fast_write'('{WARNING: '), '$builtin_message'(A), '$fast_write'('}'), nl
        Object a1, a2;
        Predicate p1, p2, p3;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        cont = engine.cont;
    // print_message(warning, A):-['$neck_cut', '$fast_write'('{WARNING: '), '$builtin_message'(A), '$fast_write'('}'), nl]
        a1 = deref( a1);
        if (isAtomTerm(a1)){
            if (! prologEquals(a1,s8))
                return fail(engine);
        } else if (isVariable(a1)){
             bind(/*VAR*/ a1,s8);
        } else {
            return fail(engine);
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        p1 = new PRED_nl_0(cont);
        p2 = new PRED_$fast_write_1(s7, p1);
        p3 = new PRED_$builtin_message_1(a2, p2);
        return exit(engine, new PRED_$fast_write_1(s9, p3));
    }
}
