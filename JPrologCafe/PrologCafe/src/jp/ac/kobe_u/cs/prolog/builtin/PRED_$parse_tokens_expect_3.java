package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$parse_tokens_expect'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_$parse_tokens_expect_3 extends PredicateBase {
    static /*Symbol*/Object s1 = makeAtom("expected");
    static /*Symbol*/Object s2 = makeAtom("[]");
    static /*List*/Object s3 = makeList(s1, s2);
    static Predicate _$parse_tokens_expect_3_sub_1 = new PRED_$parse_tokens_expect_3_sub_1();
    static Predicate _$parse_tokens_expect_3_1 = new PRED_$parse_tokens_expect_3_1();
    static Predicate _$parse_tokens_expect_3_2 = new PRED_$parse_tokens_expect_3_2();

    public Object arg1, arg2, arg3;

    public PRED_$parse_tokens_expect_3(Object a1, Object a2, Object a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$parse_tokens_expect_3(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String nameUQ() { return "$parse_tokens_expect"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
         case 1: arg2 = val;break ;
         case 2: arg3 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
         case 1: return arg2;
         case 2: return arg3;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'$parse_tokens_expect'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + "," + argString(arg3,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
        engine_aregs[1] = arg1;
        engine_aregs[2] = arg2;
        engine_aregs[3] = arg3;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$parse_tokens_expect_3_1, _$parse_tokens_expect_3_sub_1);
    }
}

class PRED_$parse_tokens_expect_3_sub_1 extends PRED_$parse_tokens_expect_3 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$parse_tokens_expect_3_2);
    }
}

class PRED_$parse_tokens_expect_3_1 extends PRED_$parse_tokens_expect_3 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$parse_tokens_expect'(A, B, C):-'$parse_tokens_skip_spaces'(B, D), D=[A|C], !
        Object a1, a2, a3, a4, a5, a6;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        cont = engine.cont;
    // '$parse_tokens_expect'(A, B, C):-['$get_level'(D), '$parse_tokens_skip_spaces'(B, E), '$unify'(E, [A|C]), '$cut'(D)]
        a4 = engine.makeVariable(this);
        //START inline expansion of $get_level(a(4))
        if (! unify(a4,makeInteger(engine.B0))) {
            return fail(engine);
        }
        //END inline expansion
        a5 = engine.makeVariable(this);
        a6 = makeList(a1, a3);
        p1 = new PRED_$cut_1(a4, cont);
        p2 = new PRED_$unify_2(a5, a6, p1);
        return exit(engine, new PRED_$parse_tokens_skip_spaces_2(a2, a5, p2));
    }
}

class PRED_$parse_tokens_expect_3_2 extends PRED_$parse_tokens_expect_3 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$parse_tokens_expect'(A, B, C):-'$parse_tokens_error'([A, expected], B, C)
        Object a1, a2, a3, a4;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        cont = engine.cont;
    // '$parse_tokens_expect'(A, B, C):-['$parse_tokens_error'([A, expected], B, C)]
        a4 = makeList(a1, s3);
        return exit(engine, new PRED_$parse_tokens_error_3(a4, a2, a3, cont));
    }
}
