package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$merge'/5</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_$merge_5 extends PredicateBase {
    static /*Symbol*/Object s1 = makeAtom("[]");
    static Predicate _$merge_5_var = new PRED_$merge_5_var();
    static Predicate _$merge_5_var_1 = new PRED_$merge_5_var_1();
    static Predicate _$merge_5_var_2 = new PRED_$merge_5_var_2();
    static Predicate _$merge_5_con = new PRED_$merge_5_con();
    static Predicate _$merge_5_con_1 = new PRED_$merge_5_con_1();
    static Predicate _$merge_5_lis = new PRED_$merge_5_lis();
    static Predicate _$merge_5_lis_1 = new PRED_$merge_5_lis_1();
    static Predicate _$merge_5_1 = new PRED_$merge_5_1();
    static Predicate _$merge_5_2 = new PRED_$merge_5_2();
    static Predicate _$merge_5_3 = new PRED_$merge_5_3();

    public Object arg1, arg2, arg3, arg4, arg5;

    public PRED_$merge_5(Object a1, Object a2, Object a3, Object a4, Object a5, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        arg5 = a5;
        this.cont = cont;
    }

    public PRED_$merge_5(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        arg5 = args[4];
        this.cont = cont;
    }

    public int arity() { return 5; }

    public String nameUQ() { return "$merge"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
         case 1: arg2 = val;break ;
         case 2: arg3 = val;break ;
         case 3: arg4 = val;break ;
         case 4: arg5 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
         case 1: return arg2;
         case 2: return arg3;
         case 3: return arg4;
         case 4: return arg5;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'$merge'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + "," + argString(arg3,newParam) + "," + argString(arg4,newParam) + "," + argString(arg5,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
        engine_aregs[1] = arg1;
        engine_aregs[2] = arg2;
        engine_aregs[3] = arg3;
        engine_aregs[4] = arg4;
        engine_aregs[5] = arg5;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$merge_5_var, _$merge_5_3, _$merge_5_3, _$merge_5_con, _$merge_5_3, _$merge_5_lis);
    }
}

class PRED_$merge_5_var extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_$merge_5_1, _$merge_5_var_1);
    }
}

class PRED_$merge_5_var_1 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.retry(_$merge_5_2, _$merge_5_var_2);
    }
}

class PRED_$merge_5_var_2 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$merge_5_3);
    }
}

class PRED_$merge_5_con extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_$merge_5_2, _$merge_5_con_1);
    }
}

class PRED_$merge_5_con_1 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$merge_5_3);
    }
}

class PRED_$merge_5_lis extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_$merge_5_1, _$merge_5_lis_1);
    }
}

class PRED_$merge_5_lis_1 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$merge_5_3);
    }
}

class PRED_$merge_5_1 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$merge'([A|B], [C|D], [E|F], G, H):-!, '$compare'(G, H, A, C, I), '$dummy_4_builtins.pl'(A, B, C, D, E, F, G, H, I)
        Object a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Predicate p1;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        a5 = engine_aregs[5];
        cont = engine.cont;
    // '$merge'([A|B], [C|D], [E|F], G, H):-['$neck_cut', '$compare'(G, H, A, C, I), '$dummy_4_builtins.pl'(A, B, C, D, E, F, G, H, I)]
        a1 = deref( a1);
        if (isListTerm(a1)){
            Object[] args = consArgs(a1);
            a6 = args[0];
            a7 = args[1];
        } else if (isVariable(a1)){
            a6 = engine.makeVariable(this);
            a7 = engine.makeVariable(this);
             bind(a1,makeList(a6, a7));
        } else {
            return fail(engine);
        }
        a2 = deref( a2);
        if (isListTerm(a2)){
            Object[] args = consArgs(a2);
            a8 = args[0];
            a9 = args[1];
        } else if (isVariable(a2)){
            a8 = engine.makeVariable(this);
            a9 = engine.makeVariable(this);
             bind(a2,makeList(a8, a9));
        } else {
            return fail(engine);
        }
        a3 = deref( a3);
        if (isListTerm(a3)){
            Object[] args = consArgs(a3);
            a10 = args[0];
            a11 = args[1];
        } else if (isVariable(a3)){
            a10 = engine.makeVariable(this);
            a11 = engine.makeVariable(this);
             bind(a3,makeList(a10, a11));
        } else {
            return fail(engine);
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a12 = engine.makeVariable(this);
        p1 = new PRED_$dummy_4_builtins$002Epl_9(a6, a7, a8, a9, a10, a11, a4, a5, a12, cont);
        return exit(engine, new PRED_$compare_5(a4, a5, a6, a8, a12, p1));
    }
}

class PRED_$merge_5_2 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$merge'([], A, A, B, C):-!
        Object a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        a5 = engine_aregs[5];
        cont = engine.cont;
    // '$merge'([], A, A, B, C):-['$neck_cut']
        a1 = deref( a1);
        if (isAtomTerm(a1)){
            if (! prologEquals(a1,s1))
                return fail(engine);
        } else if (isVariable(a1)){
             bind(/*VAR*/ a1,s1);
        } else {
            return fail(engine);
        }
        if (! unify(a2,a3))
            return fail(engine);
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return exit(engine,cont);
    }
}

class PRED_$merge_5_3 extends PRED_$merge_5 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$merge'(A, [], A, B, C):-true
        Object a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        a5 = engine_aregs[5];
        cont = engine.cont;
    // '$merge'(A, [], A, B, C):-[]
        a2 = deref( a2);
        if (isAtomTerm(a2)){
            if (! prologEquals(a2,s1))
                return fail(engine);
        } else if (isVariable(a2)){
             bind(/*VAR*/ a2,s1);
        } else {
            return fail(engine);
        }
        if (! unify(a1,a3))
            return fail(engine);
        return exit(engine,cont);
    }
}