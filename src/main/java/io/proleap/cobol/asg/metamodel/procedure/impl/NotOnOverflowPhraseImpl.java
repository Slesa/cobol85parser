/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.impl;

import io.proleap.cobol.Cobol85Parser.NotOnOverflowPhraseContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.impl.ScopeImpl;
import io.proleap.cobol.asg.metamodel.procedure.NotOnOverflowPhrase;

public class NotOnOverflowPhraseImpl extends ScopeImpl implements NotOnOverflowPhrase {

	protected final NotOnOverflowPhraseContext ctx;

	public NotOnOverflowPhraseImpl(final ProgramUnit programUnit, final NotOnOverflowPhraseContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

}
