// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.AstAdapters;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Expression extends modType {
    private exprType body;
    public exprType getInternalBody() {
        return body;
    }
    public Object getBody() {
        return body;
    }
    public void setBody(Object body) {
        this.body = AstAdapters.to_expr(body);
    }


    private final static String[] fields = new String[] {"body"};
    public String[] get_fields() { return fields; }

    public Expression() {}
    public Expression(Object body) {
        setBody(body);
    }

    public Expression(Token token, exprType body) {
        super(token);
        this.body = body;
        addChild(body);
    }

    public Expression(Integer ttype, Token token, exprType body) {
        super(ttype, token);
        this.body = body;
        addChild(body);
    }

    public Expression(PythonTree tree, exprType body) {
        super(tree);
        this.body = body;
        addChild(body);
    }

    public String toString() {
        return "Expression";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Expression(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitExpression(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null)
            body.accept(visitor);
    }

}
