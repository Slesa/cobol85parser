/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.impl;

import io.proleap.cobol.Cobol85Parser.ProcedureDivisionByValueContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.procedure.ByValue;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public class ByValueImpl extends CobolDivisionElementImpl implements ByValue {

	protected boolean any;

	protected final ProcedureDivisionByValueContext ctx;

	protected ValueStmt valueValueStmt;

	public ByValueImpl(final ProgramUnit programUnit, final ProcedureDivisionByValueContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public ValueStmt getValueValueStmt() {
		return valueValueStmt;
	}

	@Override
	public boolean isAny() {
		return any;
	}

	@Override
	public void setAny(final boolean any) {
		this.any = any;
	}

	@Override
	public void setValueValueStmt(final ValueStmt valueValueStmt) {
		this.valueValueStmt = valueValueStmt;
	}
}
