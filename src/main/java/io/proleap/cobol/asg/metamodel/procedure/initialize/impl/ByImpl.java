/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.initialize.impl;

import io.proleap.cobol.Cobol85Parser.InitializeReplacingByContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.asg.metamodel.procedure.initialize.By;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public class ByImpl extends CobolDivisionElementImpl implements By {

	protected ByType byType;

	protected final InitializeReplacingByContext ctx;

	protected ValueStmt valueStmt;

	public ByImpl(final ProgramUnit programUnit, final InitializeReplacingByContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public ByType getByType() {
		return byType;
	}

	@Override
	public ValueStmt getValueStmt() {
		return valueStmt;
	}

	@Override
	public void setByType(final ByType byType) {
		this.byType = byType;
	}

	@Override
	public void setValueStmt(final ValueStmt valueStmt) {
		this.valueStmt = valueStmt;
	}

}
