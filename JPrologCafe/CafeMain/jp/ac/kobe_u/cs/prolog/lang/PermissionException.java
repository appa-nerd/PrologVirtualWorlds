package jp.ac.kobe_u.cs.prolog.lang;
/**
 * Permission error.<br>
 * There will be a permission error when it is not permitted
 * to perform a specific operation.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PermissionException extends BuiltinException {
    /** A functor symbol of <code>permission_error/5</code>. */
    public static /*SymbolTerm*/Object PERMISSION_ERROR = StaticProlog.makeAtom("permission_error", 5);

    /* operation ::= access | create | input | modify | open | output | reposition | new */
    /** Holds a string representation of operation. */
    public String operation;

    /*
      permissionType ::= binary_stream | flag | operator | past_end_of_stream
                         private_procedure | static_procedure | source_sink
			 stream | text_stream
    */
    /** Holds a string representation of permission type. */
    public String permissionType;

    /** Holds the argument or one of its components which caused the error. */
    public Object culprit;

    /** Holds a string representation of detail message. */
    public String message;

    /** Constructs a new <code>PermissionException</code>
     * with the given arguments. */
    public PermissionException(Predicate _goal, 
			       String _operation, 
			       String _permissionType, 
			       Object _culprit, 
			       String _message) {
	this.goal = _goal;
	operation = _operation;
	permissionType   = _permissionType;
	culprit   = _culprit;
	message   = _message;
    }

    /** Returns a term representation of this <code>PermissionException</code>:
     * <code>permission_error(goal,argNo,operation,permissionType,culprit,message)</code>.
     */
    public Object getMessageTerm() {
	Object[] args = {
	    StaticProlog.makeJavaObject(goal), 
	    StaticProlog.makeAtom(operation),
	    StaticProlog.makeAtom(permissionType),
	    culprit,
	    StaticProlog.makeAtom(message)};
	return StaticProlog.makeStructure(PERMISSION_ERROR, args);
    }

    /** Returns a string representation of this <code>PermissionException</code>. */
    public String toString() {
	String s = "{PERMISSION ERROR: " + goal.toString();
	s += " - can not " + operation + " " + permissionType + " " + culprit.toString();
	s += ": " + message;
	s += "}";
	return s;
    }
}
