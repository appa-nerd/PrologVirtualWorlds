/* PRED_$end_exception_1 - at Sun Sep 21 05:39:00 PDT 2008 */
package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/* used 5 more classes */
/* import java.lang.Object; */
/* import jp.ac.kobe_u.cs.prolog.builtin.PRED_$begin_exception_1; */
/* import java.lang.StringBuilder; */
/* import java.lang.String; */
/* import jp.ac.kobe_u.cs.prolog.builtin.PRED_$end_exception_1; */

class PRED_$end_exception_1 extends PredicateBase
{
    /**
   * 
   */
  private static final long serialVersionUID = 2029048466818211217L;
    Object arg1;

    @Override
    public  int arity() {
        /* flow_0_0_ConstantOperator
 */
return 1;
}
    public  PRED_$end_exception_1() {
    /* flow_0_0_EmptyBlock_451143809
 */
/* empty */}
    public  PRED_$end_exception_1(Object a1, Predicate cont) {
        /* flow_0_0_PutFieldOperator
 */
this.arg1 = a1;
    this.cont = cont;
}
//    @Override
//    public  String toString() {
//        /* flow_0_0_StringAddOperator
// */
//return "$end_exception(" + this.arg1 + ")";
//}
    @Override
    public  Predicate exec(Prolog engine) {
        /* flow_0_0_LocalStoreOperator
 */
final Object[] engine_aregs = engine.getAreg();
    engine.setB0();
    Object a1 = this.arg1;
    a1 = deref(a1);
    if (!isJavaObject(a1))
 throw new IllegalTypeException(this, 1, "java", a1);
    final Object obj = toJava(a1);
    if (!(obj instanceof PRED_$begin_exception_1))
 throw new SystemException("a1 must be an object of PRED_$begin_exception_1: " + this.toString());
    final PRED_$begin_exception_1 p = (PRED_$begin_exception_1) obj;
    p.outOfScope = true;
    engine.trail_push(new OutOfScope(p));
    return this.cont;
}
    @Override
    public  void setArgument(Object[] args, Predicate cont) {
    /* flow_0_0_PutFieldOperator
 */
this.arg1 = args[0];
    this.cont = cont;
}}
