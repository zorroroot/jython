// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;

public abstract class modType extends PythonTree {

    public static final PyType TYPE = PyType.fromClass(modType.class);
    public modType() {
    }

    public modType(PyType subType) {
    }

    public modType(int ttype, Token token) {
        super(ttype, token);
    }

    public modType(Token token) {
        super(token);
    }

    public modType(PythonTree node) {
        super(node);
    }

}
