/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.inspect;

import io.proleap.cobol.Cobol85Parser.InspectConvertingPhraseContext;
import io.proleap.cobol.Cobol85Parser.InspectReplacingPhraseContext;
import io.proleap.cobol.Cobol85Parser.InspectTallyingPhraseContext;
import io.proleap.cobol.Cobol85Parser.InspectTallyingReplacingPhraseContext;
import io.proleap.cobol.asg.metamodel.call.Call;
import io.proleap.cobol.asg.metamodel.procedure.Statement;

/**
 * Tally, replace, or tally and replace occurrences of one or multiple
 * characters in a data item.
 */
public interface InspectStatement extends Statement {

	enum InspectType {
		CONVERTING, REPLACING, TALLYING, TALLYING_REPLACING
	}

	Converting addConverting(InspectConvertingPhraseContext ctx);

	Replacing addReplacing(InspectReplacingPhraseContext ctx);

	Tallying addTallying(InspectTallyingPhraseContext ctx);

	TallyingReplacing addTallyingReplacing(InspectTallyingReplacingPhraseContext ctx);

	Converting getConverting();

	/**
	 * Data item to be inspected.
	 */
	Call getDataItemCall();

	InspectType getInspectType();

	Replacing getReplacing();

	Tallying getTallying();

	TallyingReplacing getTallyingReplacing();

	void setDataItemCall(Call dataItemCall);

	void setInspectType(InspectType inspectType);

}
