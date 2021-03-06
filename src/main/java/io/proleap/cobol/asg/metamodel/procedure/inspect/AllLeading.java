/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.inspect;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.InspectBeforeAfterContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt;

public interface AllLeading extends CobolDivisionElement {

	BeforeAfterPhrase addBeforeAfterPhrase(InspectBeforeAfterContext ctx);

	List<BeforeAfterPhrase> getBeforeAfterPhrases();

	ValueStmt getPatternDataItemValueStmt();

	void setPatternDataItemValueStmt(ValueStmt patternDataItemValueStmt);

}
