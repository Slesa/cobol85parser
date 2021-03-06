/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.inspect;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.InspectAllLeadingsContext;
import io.proleap.cobol.Cobol85Parser.InspectCharactersContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.call.Call;

public interface For extends CobolDivisionElement {

	AllLeadingPhrase addAllLeadingPhrase(InspectAllLeadingsContext ctx);

	Characters addCharacters(InspectCharactersContext ctx);

	List<AllLeadingPhrase> getAllLeadingPhrase();

	List<Characters> getCharacters();

	/**
	 * Data item the tally count is accumulated in.
	 */
	Call getTallyCountDataItemCall();

	void setTallyCountDataItemCall(Call tallyCountDataItemCall);
}
