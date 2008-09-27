package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$parse_tokens_post_in_ops'/7</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_$parse_tokens_post_in_ops_7 extends PredicateBase {
    static Predicate _$parse_tokens_post_in_ops_7_sub_1 = new PRED_$parse_tokens_post_in_ops_7_sub_1();
    static Predicate _$parse_tokens_post_in_ops_7_1 = new PRED_$parse_tokens_post_in_ops_7_1();
    static Predicate _$parse_tokens_post_in_ops_7_2 = new PRED_$parse_tokens_post_in_ops_7_2();

    public Object arg1, arg2, arg3, arg4, arg5, arg6, arg7;

    public PRED_$parse_tokens_post_in_ops_7(Object a1, Object a2, Object a3, Object a4, Object a5, Object a6, Object a7, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        arg5 = a5;
        arg6 = a6;
        arg7 = a7;
        this.cont = cont;
    }

    public PRED_$parse_tokens_post_in_ops_7(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        arg5 = args[4];
        arg6 = args[5];
        arg7 = args[6];
        this.cont = cont;
    }

    public int arity() { return 7; }

    public String nameUQ() { return "$parse_tokens_post_in_ops"; }

    public void sArg(int i0, Object val) {  switch (i0) {         case 0: arg1 = val;break ;
         case 1: arg2 = val;break ;
         case 2: arg3 = val;break ;
         case 3: arg4 = val;break ;
         case 4: arg5 = val;break ;
         case 5: arg6 = val;break ;
         case 6: arg7 = val;break ;
default: newIndexOutOfBoundsException("setarg" , i0 , val);  }   }


    public Object gArg(int i0) {  switch (i0) {         case 0: return arg1;
         case 1: return arg2;
         case 2: return arg3;
         case 3: return arg4;
         case 4: return arg5;
         case 5: return arg6;
         case 6: return arg7;
default: return newIndexOutOfBoundsException("getarg", i0,null);  }   }


    public String toPrologString(java.util.Collection newParam) {
        return "'$parse_tokens_post_in_ops'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + "," + argString(arg3,newParam) + "," + argString(arg4,newParam) + "," + argString(arg5,newParam) + "," + argString(arg6,newParam) + "," + argString(arg7,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
        engine_aregs[1] = arg1;
        engine_aregs[2] = arg2;
        engine_aregs[3] = arg3;
        engine_aregs[4] = arg4;
        engine_aregs[5] = arg5;
        engine_aregs[6] = arg6;
        engine_aregs[7] = arg7;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$parse_tokens_post_in_ops_7_1, _$parse_tokens_post_in_ops_7_sub_1);
    }
}

class PRED_$parse_tokens_post_in_ops_7_sub_1 extends PRED_$parse_tokens_post_in_ops_7 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
        return engine.trust(_$parse_tokens_post_in_ops_7_2);
    }
}

class PRED_$parse_tokens_post_in_ops_7_1 extends PRED_$parse_tokens_post_in_ops_7 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$parse_tokens_post_in_ops'(A, B, C, D, E, F, G):-'$parse_tokens_skip_spaces'(F, H), H=[I|J], '$parse_tokens_op'(I, A, B, C, K, L, J, M), '$parse_tokens_post_in_ops'(A, K, L, D, E, M, G)
        Object a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Predicate p1, p2, p3;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        a5 = engine_aregs[5];
        a6 = engine_aregs[6];
        a7 = engine_aregs[7];
        cont = engine.cont;
    // '$parse_tokens_post_in_ops'(A, B, C, D, E, F, G):-['$parse_tokens_skip_spaces'(F, H), '$unify'(H, [I|J]), '$parse_tokens_op'(I, A, B, C, K, L, J, M), '$parse_tokens_post_in_ops'(A, K, L, D, E, M, G)]
        a8 = engine.makeVariable(this);
        a9 = engine.makeVariable(this);
        a10 = engine.makeVariable(this);
        a11 = makeList(a9, a10);
        a12 = engine.makeVariable(this);
        a13 = engine.makeVariable(this);
        a14 = engine.makeVariable(this);
        p1 = new PRED_$parse_tokens_post_in_ops_7(a1, a12, a13, a4, a5, a14, a7, cont);
        p2 = new PRED_$parse_tokens_op_8(a9, a1, a2, a3, a12, a13, a10, a14, p1);
        p3 = new PRED_$unify_2(a8, a11, p2);
        return exit(engine, new PRED_$parse_tokens_skip_spaces_2(a6, a8, p3));
    }
}

class PRED_$parse_tokens_post_in_ops_7_2 extends PRED_$parse_tokens_post_in_ops_7 {
    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); //anony 
    // '$parse_tokens_post_in_ops'(A, B, C, B, C, D, E):-C=<A, E=D
        Object a1, a2, a3, a4, a5, a6, a7;
        Predicate cont;
        a1 = engine_aregs[1];
        a2 = engine_aregs[2];
        a3 = engine_aregs[3];
        a4 = engine_aregs[4];
        a5 = engine_aregs[5];
        a6 = engine_aregs[6];
        a7 = engine_aregs[7];
        cont = engine.cont;
    // '$parse_tokens_post_in_ops'(A, B, C, B, C, D, E):-['$less_or_equal'(C, A), '$unify'(E, D)]
        if (! unify(a2,a4))
            return fail(engine);
        if (! unify(a3,a5))
            return fail(engine);
        //START inline expansion of $less_or_equal(a(3), a(1))
        try {
            if (arithCompareTo(Arithmetic.evaluate(a3),Arithmetic.evaluate(a1)) > 0) {
                return fail(engine);
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        //START inline expansion of $unify(a(7), a(6))
        if (! unify(a7,a6)) {
            return fail(engine);
        }
        //END inline expansion
        return exit(engine,cont);
    }
}