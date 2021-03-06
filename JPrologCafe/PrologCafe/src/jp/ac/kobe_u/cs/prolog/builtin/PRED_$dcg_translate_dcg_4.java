package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$dcg_translate_dcg'/4</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @author Douglas R. Miles (dmiles@users.sourceforge.net) for Object(s) 
 @version 1.0-dmiles
*/
class PRED_$dcg_translate_dcg_4 extends PredicateBase {

    public Object arg1, arg2, arg3, arg4;

    public PRED_$dcg_translate_dcg_4(Object a1, Object a2, Object a3, Object a4, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        this.cont = cont;
    }

    public PRED_$dcg_translate_dcg_4(){}

    public void setArgument(Object[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        this.cont = cont;
    }

    public int arity() { return 4; }

    public String nameUQ() { return "$dcg_translate_dcg"; }

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
        return "'$dcg_translate_dcg'(" + argString(arg1,newParam) + "," + argString(arg2,newParam) + "," + argString(arg3,newParam) + "," + argString(arg4,newParam) + ")";
    }

    public Predicate exec(Prolog engine) { enter(engine); Object[] engine_aregs = engine.getAreg(); 
    // '$dcg_translate_dcg'(A, B, C, D):-'$dcg_translate_dcg'(A, E, F, C, D), '$dummy_24_builtins.pl'(A, B, C, D, E, F)
        engine.setB0();
        Object a1, a2, a3, a4, a5, a6;
        Predicate p1;
        a1 = arg1;
        a2 = arg2;
        a3 = arg3;
        a4 = arg4;
    // '$dcg_translate_dcg'(A, B, C, D):-['$dcg_translate_dcg'(A, E, F, C, D), '$dummy_24_builtins.pl'(A, B, C, D, E, F)]
        a5 = engine.makeVariable(this);
        a6 = engine.makeVariable(this);
        p1 = new PRED_$dummy_24_builtins$002Epl_6(a1, a2, a3, a4, a5, a6, cont);
        return exit(engine, new PRED_$dcg_translate_dcg_5(a1, a5, a6, a3, a4, p1));
    }
}
