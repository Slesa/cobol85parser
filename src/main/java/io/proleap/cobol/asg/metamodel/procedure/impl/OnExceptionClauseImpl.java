/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.impl;

import io.proleap.cobol.Cobol85Parser.OnExceptionClauseContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.ScopeImpl;
import io.proleap.cobol.asg.metamodel.procedure.OnExceptionClause;

public class OnExceptionClauseImpl extends ScopeImpl implements OnExceptionClause {

	protected final OnExceptionClauseContext ctx;

	public OnExceptionClauseImpl(final ProgramUnit programUnit, final OnExceptionClauseContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}
}
