package com.exasol.sql.expression;

/**
 * Static factory methods for SQL expressions.
 */
public abstract class ExpressionTerm extends AbstractValueExpression {
    private ExpressionTerm() {
        super();
    }

    /**
     * Create a string literal.
     *
     * @param value literal value
     * @return string literal
     */
    public static StringLiteral stringLiteral(final String value) {
        return StringLiteral.of(value);
    }

    /**
     * Create a string literal from a character.
     *
     * @param value character value
     * @return string literal
     */
    public static StringLiteral stringLiteral(final char value) {
        return StringLiteral.of(value);
    }

    /**
     * Create an integer literal.
     *
     * @param value literal value
     * @return integer literal
     */
    public static IntegerLiteral integerLiteral(final int value) {
        return IntegerLiteral.of(value);
    }

    /**
     * Create an long literal.
     *
     * @param value literal value
     * @return long literal
     */
    public static LongLiteral longLiteral(final long value) {
        return LongLiteral.of(value);
    }

    /**
     * Create a double literal.
     *
     * @param value literal value
     * @return double literal
     */
    public static DoubleLiteral doubleLiteral(final double value) {
        return DoubleLiteral.of(value);
    }

    /**
     * Create a float literal.
     *
     * @param value literal value
     * @return float literal
     */
    public static FloatLiteral floatLiteral(final float value) {
        return FloatLiteral.of(value);
    }

    /**
     * Create a boolean literal.
     *
     * @param value literal value
     * @return boolean literal
     */
    public static BooleanLiteral booleanLiteral(final boolean value) {
        return BooleanLiteral.of(value);
    }

    /**
     * Create a reference to a table column.
     *
     * @param column column name
     * @return column reference
     */
    public static ColumnReference column(final String column) {
        return ColumnReference.of(column);
    }

    /**
     * Create a reference to a column in a specific table.
     * 
     * @param table table name
     * @param column column name
     *
     * @return column reference
     */
    public static ColumnReference column(final String table, final String column) {
        return ColumnReference.column(table, column);
    }
}
