package jp.ac.kobe_u.cs.prolog.lang;

import java.util.Collection;


/**
 * Initial continuation goal.<br>
 * That is to say, this <code>Success</code> will be executed 
 * every time the Prolog Cafe system finds an answer.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class Success extends PredicateBase {
  /** Prolog thread that this <code>Success</code> belongs to. */
  public PrologControl c;

  /** Constructs a new initial continuation goal. */
  public Success() {
  }

  /** Constructs a new initial continuation goal with given Prolog thread. */
  public Success(PrologControl c) {
    this.c = c;
  }

  /**
   * Backtracks and returns a next clause
   * after invoking the <code>PrologControl.success()</code>.
   * @param engine Prolog engine
   * @see PrologControl#success
   */
  public Predicate exec(Prolog engine) {
    Object[] engine_aregs = engine.getAreg();
    c.success();
    return fail(engine);
  }

  /** Returns a string representation of this <code>Success</code>. */
  public String toPrologString(Collection c) {
    return "Success";
  }

  /** Returns <code>0</code>. */
  public int arity() {
    return 0;
  }
}
