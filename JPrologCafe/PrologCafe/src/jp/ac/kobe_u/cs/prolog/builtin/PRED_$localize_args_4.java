package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$localize_args'/4</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_$localize_args_4 extends PredicateBase {
    static /*Symbol*/Object s1 = makeAtom("[]");
    static /*Symbol*/Object s2 = makeAtom(":");
    static /*Symbol*/Object s3 = makeAtom(":", 2);
    static Predicate _$localize_args_4_top = new PRED_$localize_args_4_top();
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$localize_args_4_var = new PRED_$localize_args_4_var();
    static Predicate _$localize_args_4_var_1 = new PRED_$localize_args_4_var_1();
    static Predicate _$localize_args_4_var_2 = new PRED_$localize_args_4_var_2();
    static Predicate _$localize_args_4_lis = new PRED_$localize_args_4_lis();
    static Predicate _$localize_args_4_lis_1 = new PRED_$localize_args_4_lis_1();
    static Predicate _$localize_args_4_1 = new PRED_$localize_args_4_1();
    static Predicate _$localize_args_4_2 = new PRED_$localize_args_4_2();
    static Predicate _$localize_args_4_3 = new PRED_$localize_args_4_3();

    public Object arg1, arg2, arg3, arg4;

    public PRED_$localize_args_4(Object a1, Object a2, Object a3, Object a4, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        this.cont = cont;
    }

    public PRED_$localize_args_4(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        this.cont = cont;
    }

    public int arity() { return 4; }

    public String nameUQ() { return "$localize_args"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
         case 1: arg2 = val;break ;
         case 2: arg3 = val;break ;
         case 3: arg4 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
         case 1: return arg2;
         case 2: return arg3;
         case 3: return arg4;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'$localize_args'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + "," + argString(arg3,newParam) + "," + argString(arg4,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
        engine_aregs[1] = arg1;
        engine_aregs[2] = arg2;
        engine_aregs[3] = arg3;
        engine_aregs[4] = arg4;
        engine.cont = cont;
        return exit(engine, _$localize_args_4_top);
    }
}

class PRED_$localize_args_4_top extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        engine.setB0();
        return engine.switch_on_term(_$localize_args_4_var, _fail_0, _fail_0, _$localize_args_4_1, _fail_0, _$localize_args_4_lis);
    }
}

class PRED_$localize_args_4_var extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_$localize_args_4_1, _$localize_args_4_var_1);
    }
}

class PRED_$localize_args_4_var_1 extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.retry(_$localize_args_4_2, _$localize_args_4_var_2);
    }
}

class PRED_$localize_args_4_var_2 extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$localize_args_4_3);
    }
}

class PRED_$localize_args_4_lis extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.jtry(_$localize_args_4_2, _$localize_args_4_lis_1);
    }
}

class PRED_$localize_args_4_lis_1 extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$localize_args_4_3);
    }
}

class PRED_$localize_args_4_1 extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$localize_args'([], [], A, []):-!
        Object a1, a2, a3, a4;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        cont = engine.cont;
    // '$localize_args'([], [], A, []):-['$neck_cut']
        a1 = deref( a1);
        if (isAtomTerm(a1)){
            if (! prologEquals(a1,s1))
                return fail(engine);
        } else if (isVariable(a1)){
             bind(/*VAR*/ a1,s1);
        } else {
            return fail(engine);
        }
        a2 = deref( a2);
        if (isAtomTerm(a2)){
            if (! prologEquals(a2,s1))
                return fail(engine);
        } else if (isVariable(a2)){
             bind(/*VAR*/ a2,s1);
        } else {
            return fail(engine);
        }
        a4 = deref( a4);
        if (isAtomTerm(a4)){
            if (! prologEquals(a4,s1))
                return fail(engine);
        } else if (isVariable(a4)){
             bind(/*VAR*/ a4,s1);
        } else {
            return fail(engine);
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return exit(engine,cont);
    }
}

class PRED_$localize_args_4_2 extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$localize_args'([:|A], [B|C], D, [D:B|E]):-'$dummy_8_builtins.pl'(B, F, G), !, '$localize_args'(A, C, D, E)
        Object a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        cont = engine.cont;
    // '$localize_args'([:|A], [B|C], D, [D:B|E]):-['$get_level'(F), '$dummy_8_builtins.pl'(B, G, H), '$cut'(F), '$localize_args'(A, C, D, E)]
        a1 = deref( a1);
        if (isListTerm(a1)){
            Object[] args = consArgs(a1);
            if (!unify( s2,args[0]))
                return fail(engine);
            a5 = args[1];
        } else if (isVariable(a1)){
            a5 = engine.makeVariable(this);
             bind(a1,makeList(s2, a5));
        } else {
            return fail(engine);
        }
        a2 = deref( a2);
        if (isListTerm(a2)){
            Object[] args = consArgs(a2);
            a6 = args[0];
            a7 = args[1];
        } else if (isVariable(a2)){
            a6 = engine.makeVariable(this);
            a7 = engine.makeVariable(this);
             bind(a2,makeList(a6, a7));
        } else {
            return fail(engine);
        }
        a4 = deref( a4);
        if (isListTerm(a4)){
            Object[] args = consArgs(a4);
            a8 = args[0];
            a9 = args[1];
        } else if (isVariable(a4)){
            a8 = engine.makeVariable(this);
            a9 = engine.makeVariable(this);
             bind(a4,makeList(a8, a9));
        } else {
            return fail(engine);
        }
        a8 = deref( a8);
        if (isCompound(a8)){
            if (!functorOf( s3,a8))
                return fail(engine);
            Object[] args = args(a8);
            if (!unify( a3,args[0]))
                return fail(engine);
            if (!unify( a6,args[1]))
                return fail(engine);
        } else if (isVariable(a8)){
            Object[] args = {a3, a6};
            bind(/*VAR*/ a8,makeStructure(s3, args));
        } else {
            return fail(engine);
        }
        a10 = engine.makeVariable(this);
        //START inline expansion of $get_level(a(10))
        if (! unify(a10,makeInteger(engine.B0))) {
            return fail(engine);
        }
        //END inline expansion
        p1 = new PRED_$localize_args_4(a5, a7, a3, a9, cont);
        p2 = new PRED_$cut_1(a10, p1);
        return exit(engine, new PRED_$dummy_8_builtins$002Epl_3(a6, engine.makeVariable(this), engine.makeVariable(this), p2));
    }
}

class PRED_$localize_args_4_3 extends PRED_$localize_args_4 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$localize_args'([A|B], [C|D], E, [C|F]):-'$localize_args'(B, D, E, F)
        Object a1, a2, a3, a4, a5, a6, a7, a8;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        cont = engine.cont;
    // '$localize_args'([A|B], [C|D], E, [C|F]):-['$localize_args'(B, D, E, F)]
        a1 = deref( a1);
        if (isListTerm(a1)){
            Object[] args = consArgs(a1);
            a5 = args[1];
        } else if (isVariable(a1)){
            a5 = engine.makeVariable(this);
             bind(a1,makeList(engine.makeVariable(this), a5));
        } else {
            return fail(engine);
        }
        a2 = deref( a2);
        if (isListTerm(a2)){
            Object[] args = consArgs(a2);
            a6 = args[0];
            a7 = args[1];
        } else if (isVariable(a2)){
            a6 = engine.makeVariable(this);
            a7 = engine.makeVariable(this);
             bind(a2,makeList(a6, a7));
        } else {
            return fail(engine);
        }
        a4 = deref( a4);
        if (isListTerm(a4)){
            Object[] args = consArgs(a4);
            if (!unify( a6,args[0]))
                return fail(engine);
            a8 = args[1];
        } else if (isVariable(a4)){
            a8 = engine.makeVariable(this);
             bind(a4,makeList(a6, a8));
        } else {
            return fail(engine);
        }
        engine_aregs[1] = a5;
        engine_aregs[2] = a7;
        engine_aregs[3] = a3;
        engine_aregs[4] = a8;
        engine.cont = cont;
        return exit(engine, _$localize_args_4_top);
    }
}